package test.day0805;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DbConnect;

public class Ex5MysqlSearchSangpum {
	DbConnect db=new DbConnect();
	
	public void searchSangpum(String sangpum)
	{
		String sql="select * from shop where sang like ?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=0;
		
		conn=db.getMysqlConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+sangpum+"%");
//			pstmt.setString(1, sangpum);
			//sangpum이 셔츠면 setString이라는 메서드가 ''를 마지막에 양쪽에 붙이는건가?
			rs=pstmt.executeQuery();
			
			System.out.println("\t\""+sangpum+"\" 상품 검색 결과");
			System.out.println();
			System.out.println("카테고리\t상품명\t색상\t사이즈\t단가\t입고일");
			System.out.println("========================================================");
			while(rs.next())
			{
				count++;
				String category=rs.getString("category");
				String sang=rs.getString("sang");
				String color=rs.getString("color");
				String price=rs.getString("price");
				String ssize=rs.getString("ssize");
				Timestamp ipgoday=rs.getTimestamp("ipgoday");
				
				System.out.println(category+"\t\t"+sang+"\t"+color+"\t"+price+"\t"+ssize+"\t"+new SimpleDateFormat("y-MM-dd").format(ipgoday));
				
			}
			System.out.println("========================================================");
			System.out.println("총 "+count+"개 상품 검색 됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(conn, pstmt, rs);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Ex5MysqlSearchSangpum ex=new Ex5MysqlSearchSangpum();
		while(true)
		{
			System.out.println("검색할 상품명을 입력하세요(종료:q)");
			String sangpum=sc.nextLine();
			if(sangpum.equalsIgnoreCase("q")) {
				System.out.println("종료합니다!!!");
				break;
			}
			ex.searchSangpum(sangpum);
		}
	}

}
