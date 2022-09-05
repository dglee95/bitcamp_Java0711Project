package test.day0804;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DbConnect;

public class Ex2_MysqlJdbc {
	DbConnect db=new DbConnect();
	//추가
	public void insertStudent(String name,String addr)
	{
		String sql="insert into student (name,addr,writeday) values ('"+name+"','"+addr+"',now())";
		//		System.out.println(sql);

		Connection conn=null;
		Statement stmt=null;
		//db연결
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);

			System.out.println("** insert 후 다시 출력 **");
			this.selectStudent();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(conn, stmt);
		}


	}
	//수정
	public void updateStudent(int num,String name,String addr)
	{
		String sql="update student set name='"+name+"',addr='"+addr+"' where num="+num;
		//		System.out.println(sql);

		Connection conn=null;
		Statement stmt=null;

		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n==0)
				System.out.println("해당 번호가 없습니다");
			else
			{
				System.out.println("수정되었습니다.");
				this.selectStudent();
			}
		} catch (SQLException e) {
		}finally {
			db.dbClose(conn, stmt);
		}

	}
	//삭제
	public void deleteStudent(int no)
	{
		String sql="delete from student where num="+no;
		//		System.out.println(sql);
		Connection conn=null;
		Statement stmt=null;
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n==0)
				System.out.println("해당 번호가 없습니다");
			else
			{
				System.out.println("총 "+n+"명 삭제되었습니다");
				this.selectStudent();
			}
		} catch (SQLException e) {
		} finally {
			db.dbClose(conn, stmt);
		}

	}
	//출력
	public void selectStudent()
	{
		String sql="select * from student order by num asc";
		//		System.out.println(sql);
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			//날짜타입을 원하는 형태의 문자열로 변환
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss"); //날짜에 대한 데이터양식을 바꾸는 것

			while(rs.next())
			{
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//날짜타입은 오라클,mysql모두 Timestamp로 얻는다 그래야 시간까지 정확하게 얻음
				Timestamp ts=rs.getTimestamp("writeday");
				//위의 날짜 타입을 문자열로 변환
				String day=sdf.format(ts);

				System.out.printf("%-5d%-6s%-10s%20s\n",num,name,addr,day);
			}

			System.out.println("** 학생 조회 끝 **");
		} catch (SQLException e) {

		}finally {
			db.dbClose(conn, stmt, rs);
		}
	}


	//이름이 입력한 값으로 시작하는 데이터들 출력
	public void selectSearchList(String startName)
	{
		//번호 이름 주소 날짜(yyyy-MM-dd a hh:mm)
		String sql="select * from student where name like '"+startName+"%'";
		//		System.out.println(sql);

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			SimpleDateFormat sdf=new SimpleDateFormat("y-MM-dd a hh:mm");

			System.out.println("\t\""+startName+"\" 으로 시작하는 학생 명단");
			int inwon=0;
			//if(rs.next()==false) 를 하면 이미 한 번을 true인지 false인지 값을 내고 다음으로 감
			while(rs.next())
			{
				inwon++;
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				Timestamp ts=rs.getTimestamp("writeday");
				String day=sdf.format(ts);
				System.out.printf("%d\t%s\t%s\t%s\n",num,name,addr,day);
			}
			if(inwon==0)
				System.out.println("\t\""+startName+"\"으로 시작하는 학생이 없습니다");
			else
				System.out.println("총 "+inwon+"명 검색완료!!");
		} catch (SQLException e) {
		} finally {
			db.dbClose(conn, stmt, rs);
		}
	}

	public static void main(String[] args) {
		Ex2_MysqlJdbc ex=new Ex2_MysqlJdbc();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.추가 2.수정 3.삭제 4.출력 5.검색 6.종료");
			int n=Integer.parseInt(sc.nextLine());
			switch(n)
			{
			case 1:
			{
				System.out.println("이름 입력");
				String name=sc.nextLine();
				System.out.println("주소 입력");
				String addr=sc.nextLine();
				ex.insertStudent(name, addr);
				break;
			}
			case 2:
			{
				System.out.println("수정할 번호 입력");
				int num=Integer.parseInt(sc.nextLine());
				System.out.println("이름 입력");
				String name=sc.nextLine();
				System.out.println("주소 입력");
				String addr=sc.nextLine();
				ex.updateStudent(num, name, addr);
				break;
			}
			case 3:
			{
				System.out.println("삭제할 시퀀스값을 입력해주세요");
				int no=Integer.parseInt(sc.nextLine());
				ex.deleteStudent(no);
				break;
			}
			case 4:
			{
				ex.selectStudent();
				break;
			}
			case 5:
				System.out.println("검색할 사람의 성을 입력해주세요");
				String searchName=sc.nextLine();
				ex.selectSearchList(searchName);
				break;
			default:
				System.out.println("** 종료합니다 **");
				System.exit(0);
			}

		}

	}

}





