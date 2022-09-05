package test.day0803;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex1_Jdbc {

	public void oracleConnect ()
	{
		//드라이버 클래스부터 가져와야함
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 문자열을 실제 패키지의 클래스로 받아오는 것
			//라이브러리에 안에 프로젝트를 직접 넣는게 좋음
			System.out.println("오라클 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 실패:"+e.getMessage());
		} 
		//드라이버를 가져오기만 하고 연결은 안한 상태

		Connection conn=null;
		//퀀텀-oracle_angel 우클릭 Properties 주소 
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn=DriverManager.getConnection(url, "angel", "a1234");
			System.out.println("나의 오라클 연결 됨");
		} catch (SQLException e) {
			System.out.println("내 오라클 연결 실패:"+e.getMessage());
		}

	}

	public void mysqlConnect ()
	{
		//드라이버 클래스부터 가져와야함
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 문자열을 실제 패키지의 클래스로 받아오는 것
			//라이브러리에 안에 프로젝트를 직접 넣는게 좋음
			System.out.println("mysql8 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("mhysql8 드라이버 실패:"+e.getMessage());
		} 
		//드라이버를 가져오기만 하고 연결은 안한 상태

		Connection conn=null;
		//퀀텀-oracle_angel 우클릭 Properties 주소 
		String url="jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul";
		try {
			conn=DriverManager.getConnection(url, "angel", "1234");
			System.out.println("나의 mysql8 연결 됨");
		} catch (SQLException e) {
			System.out.println("내 mysql8 연결 실패:"+e.getMessage());
		}
	}

	public void gangsaOracleConnect()
	{
		//드라이버 클래스부터 가져와야함
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");// 문자열을 실제 패키지의 클래스로 받아오는 것
					//라이브러리에 안에 프로젝트를 직접 넣는게 좋음
					System.out.println("오라클 드라이버 성공");
				} catch (ClassNotFoundException e) {
					System.out.println("오라클 드라이버 실패:"+e.getMessage());
				} 
				//드라이버를 가져오기만 하고 연결은 안한 상태

				Connection conn=null;
				//퀀텀-oracle_angel 우클릭 Properties 주소 
				String url="jdbc:oracle:thin:@192.168.0.27:1521:xe";
				try {
					conn=DriverManager.getConnection(url, "angel", "a1234");
					System.out.println("강사 오라클 연결 됨");
				} catch (SQLException e) {
					System.out.println("강사 오라클 연결 실패:"+e.getMessage());
				}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Ex1_Jdbc ex=new Ex1_Jdbc();
		while(true)
		{
			System.out.println("1.oracle 연결  2.mysql 연결  3.강사pc 오라클 연결 4.종료");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				ex.oracleConnect();
				break;
			case 2:
				ex.mysqlConnect();
				break;
			case 3:
				ex.gangsaOracleConnect();
				break;
			default:
				System.out.println("** 종료합니다 **");
				System.exit(0);
			}

		}
	}

}
