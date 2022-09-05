package test.day0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//순서
//드라이버를 먼저 가져온다->Connection(연결)->Statement,PreparedStatement,CallableStatement(프로시저 관련 안배움)
//->execute(실행)->select같은 경우는 ResultSet이라는 클래스를 이용해서 데이터를 가져옴
//->모든 작업이 끝난 후 항상 모든 자원은 close

//드라이버는 처음만 하면 되서 생성자에서 선언
public class Ex1_OracleJdbc {
	static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:xe";
	
	public Ex1_OracleJdbc() {
		try {
			Class.forName(DRIVER);//클래스안에 프로젝트가 없거나 이름이 틀렸거나 (오류)
			System.out.println("오라클 드라이버 클래스 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 드라이버 클래스 실패"+e.getMessage());
		}
	}
	
	//오라클 서버에 연결 후 반환하는 메서드
	public Connection getConnection()
	{
		Connection conn=null; // try catch는 변수를 따로 선언해야 함
		try {
			conn=DriverManager.getConnection(ORACLE_URL,"angel","a1234");
			System.out.println("오라클 연결 성공!");
		} catch (SQLException e) {
			System.out.println("오라클 연결 실패:"+e.getMessage());
		}
		return conn;
	}
	
	//food table의 데이터를 조회해서 가져오기
	public void foodSelect()
	{
		//오라클 서버에 연결(지역변수[멤버변수 쓰면 문제발생])
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null; //select는 executeQuery(String sql)을 쓰는데 ResultSet을 반환함
		String sql="select foodno,fname,to_char(fprice,'L99,999') "
				+ "fprice from food order by 2 asc";
		//제목
		System.out.println("foodno\tfood\tprice");
		System.out.println("------------------------------------");
		//오라클 서버에 연결
		conn=this.getConnection();//this.를 쓰는 이유는 자동완성때문에(오타)
		//Statement sql을 실행하기 위해선 statement를 얻어야함
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);//rs.next() 행에 데이터가 있으면 true 한개면 if(rs.next()) 여러개면 while
			while(rs.next())//rs.next()가 true일 동안 다음 레코드로 이동, 없으면 false 반환
			{
				//index로 가져와보자
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				//Label로 가져와보자
//				System.out.println(rs.getInt("foodno")+"\t"+rs.getString("fname")+"\t"+rs.getString("fprice"));
				int fno=rs.getInt("foodno");
				String fname=rs.getString("fname");
				String fprice=rs.getString("fprice");
				System.out.printf("%-5d%-13s%5s\n",fno,fname,fprice);
			}
			System.out.println("** Food 조회 끝 **");
		} catch (SQLException e) {
			System.out.println("select 오류:"+e.getMessage());
		}finally {//닫는걸 rs-stmt-conn 순으로 함 if문 or catch에 |NullPointerException으로 넣음
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				
			}
		}
	}
	
	//insert method
	public void insertFood(String fname,int fprice)
	{
		String sql="insert into food values (seq1.nextval,'"+fname+"',"+fprice+")";
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		//db연결
		conn=this.getConnection();
		try {
			stmt=conn.createStatement();
			//실행
			stmt.execute(sql);
			//결과 출력
			System.out.println("** insert 후 전체 출력**");
			this.foodSelect();
		} catch (SQLException e) {
			System.out.println("insert 오류:"+e.getMessage());
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e){
				
			}
		}
	}
	
	//delete method
	public void deleteFood(String fname)
	{
		String sql="delete from food where fname='"+fname+"'";
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		conn=this.getConnection();
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);//삭제된 레코드의 개수를 반환하는 실행
			if(n==0)
				System.out.println(fname+"메뉴는 없습니다!");
			else
				System.out.println("총 "+n+"개의 메뉴가 삭제되었습니다");
		} catch (SQLException e) {
			System.out.println("delete 오류:"+e.getMessage());
		} finally {
				try {
					if(stmt!=null) stmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
				}
			
		}
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_OracleJdbc ex=new Ex1_OracleJdbc();
		
		Scanner sc=new Scanner(System.in);
		String num="";
		while(true)
		{
			System.out.println("1.추가 2.전체출력 3.삭제 4.종료");
			num=sc.nextLine();
			switch(num)
			{
			case "1":
			{
				System.out.println("추가할 메뉴명");
				String fname=sc.nextLine();
				System.out.println("가격은?");
				int fprice=Integer.parseInt(sc.nextLine());
				//추가 메서드 호출
				ex.insertFood(fname, fprice);
			}
				break;
			case "2":
				ex.foodSelect();
				break;
			case "3":
			{
				System.out.println("삭제할 메뉴명을 입력하세요");
				String fname=sc.nextLine();
				//삭제 메서드 호출
				ex.deleteFood(fname);
			}
				break;
			default:
				System.out.println("** 종료합니다 **");
				System.exit(0);
					
			
			}
		}
	}

}
