package test.day0805;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import db.DbConnect;

//Statement : sql을 완벽하게 만든 후 execute할 때 sql을 실행
//PreparedStatement : sql을 value를 미완성으로 만든 후 statement 생성시 (sql)을 검사
// => ? 자리에 바인딩으로 모든 값을 준 후에 마지막에 execute(sql 파라미터 없음)
public class Ex1OraclePrepare {
	DbConnect db=new DbConnect();

	public void selectBuseo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("조회할 부서를 입력해주세요");
		String buseo=sc.nextLine();
		//인원수 검색
		int inwon=this.getBuseoCount(buseo);
		if(inwon==0) {
			System.out.println(buseo+" 부서는 없습니다");
			return;//현재 메서드 종료
		}
		System.out.println("총 "+inwon+"명 검색");
		String sql="select * from sawon where buseo=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		conn=db.getOracleConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, buseo);
			rs=pstmt.executeQuery();
			System.out.println("번호\t이름\t부서\t급여\t나이\t입사일");
			System.out.println("========================================================");
			while(rs.next())
			{
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String b=rs.getString("buseo");
				int pay=rs.getInt("pay");
				int age=rs.getInt("age");
				Timestamp ipsa=rs.getTimestamp("ipsaday");
				
				System.out.print(num+"\t");
				System.out.print(name+"\t");
				System.out.print(b+"\t");
				System.out.print(NumberFormat.getCurrencyInstance().format(pay)+"\t");
				System.out.print(age+"\t");
				System.out.println(new SimpleDateFormat("yyyy-MM-dd EEE").format(ipsa));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(conn, pstmt, rs);
		}

	}

	public int getBuseoCount(String buseo)//인원수
	{
		int inwon=0; //catch 에서 값이 안들어갈 수 있기 때문에 0으로 초기화
		String sql="select count(*) from sawon where buseo=?";//?에 값을 넣는게 바인딩
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//db연결
		conn=db.getOracleConnection();
		try {
			//pstmt
			pstmt=conn.prepareStatement(sql);//실행이 아니고 검사만
			//? 갯수만큼 값을 넣어줘야한다 : 바인딩
			//?는 첫번째부터 차례대로 1,2,3...
			pstmt.setString(1, buseo);//문자여도 String만해놓으면 '' 안 넣어도됨
			//실행
			rs=pstmt.executeQuery();
			if(rs.next())
				inwon=rs.getInt(1);//어차피 컬럼이 하나뿐이라 인덱스로 가져옴
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(conn, pstmt, rs);
		}
		return inwon;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1OraclePrepare ex=new Ex1OraclePrepare();
		ex.selectBuseo();
	}

}
