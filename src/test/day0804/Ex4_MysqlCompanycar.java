package test.day0804;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DbConnect;

public class Ex4_MysqlCompanycar {
	DbConnect db=new DbConnect();

	public void insertCar(String company,String carName,String carColor,int carPrice)
	{
		String sql="insert into companycar (company,carname,carcolor,carprice,carguip)"
				+ " values ('"+company+"','"+carName+"','"+carColor+"',"+carPrice+",now())";
		Connection conn=null;
		Statement stmt=null;
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			System.out.println("자동차가 등록되었습니다");
			this.selectCar();
		} catch (SQLException e) {
		}finally {
			db.dbClose(conn, stmt);
		}

	}

	public void selectCar()
	{
		String sql="select num,company,carname,carcolor,format(carprice,0) carprice,carguip from companycar";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			SimpleDateFormat sdf=new SimpleDateFormat("yy년M월d일 EEEE");
			int su=0;
			System.out.println("번호\t회사\t자동차명\t색상\t가격\t구입일");
			System.out.println("-----------------------------------------------------------");
			while(rs.next())
			{
				su++;
				int num=rs.getInt("num");
				String company=rs.getString("company");
				String carName=rs.getString("carname");
				String carColor=rs.getString("carcolor");
				String carPrice=rs.getString("carprice");
				Timestamp carGuip=rs.getTimestamp("carguip");
				String day=sdf.format(carGuip);
				System.out.printf("%d\t%s\t%s\t\t%s\t%s\t%s\n",num,company,carName,carColor,carPrice,day);
			}
			System.out.println("총 "+su+"대 등록되어있음");
		} catch (SQLException e) {
		} finally {
			db.dbClose(conn, stmt, rs);
		}
	}

	public void analysisCar()
	{
		String sql="select company,count(*) count,format(round(avg(carprice),-2),0) carprice from companycar group by company";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("회사\t대수\t평균가격");
			System.out.println("-----------------------------");
			while(rs.next())
			{
				String company=rs.getString("company");
				int count=rs.getInt("count");
				String carPrice=rs.getString("carprice");
				System.out.printf("%s\t%d\t%s\n",company,count,carPrice);
			}

		} catch (SQLException e) {
		}finally {
			db.dbClose(conn, stmt, rs);
		}
	}

	public void deleteCar(String carName)
	{
		String sql="delete from companycar where carname='"+carName+"'";
		Connection conn=null;
		Statement stmt=null;
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n==0)
				System.out.println(carName+" 자동차는 등록되어있지 않습니다");
			else
			{
				System.out.println(carName+" 자동차가 삭제되었습니다");
				this.selectCar();
			}
		} catch (SQLException e) {
		}finally {
			db.dbClose(conn, stmt);
		}
	}
		
	public void updateCar(int num,String carName,String carColor)
	{
		String sql="update companycar set carname='"+carName+"',carcolor='"+carColor+"' where num="+num;
		Connection conn=null;
		Statement stmt=null;
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n==0)
				System.out.println(carName+" 자동차는 등록되어있지 않습니다");
			else
			{
				System.out.println(carName+" 자동차가 수정되었습니다");
				this.selectCar();
			}
		} catch (SQLException e) {
		}finally {
			db.dbClose(conn, stmt);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_MysqlCompanycar ex=new Ex4_MysqlCompanycar();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.자동차등록 2.전체 조회 3.회사별 통계 4.삭제 5.수정 6.종료");
			int n=Integer.parseInt(sc.nextLine());
			switch(n)
			{
			case 1:
			{
				System.out.println("회사명 입력 현대,기아,쌍용");
				String company=sc.nextLine();
				System.out.println("자동차명 입력");
				String carName=sc.nextLine();
				System.out.println("색상 입력");
				String carColor=sc.nextLine();
				System.out.println("가격 입력");
				int carPrice=Integer.parseInt(sc.nextLine());
				ex.insertCar(company, carName, carColor, carPrice);
				break;
			}
			case 2:
				ex.selectCar();
				break;
			case 3:
				ex.analysisCar();
				break;
			case 4:
			{
				System.out.println("삭제할 자동차명");
				String carName=sc.nextLine();
				ex.deleteCar(carName);
				break;
			}
			case 5:
			{
				System.out.println("수정할 번호 입력");
				int num=Integer.parseInt(sc.nextLine());
				System.out.println("자동차명 입력");
				String carName=sc.nextLine();
				System.out.println("색상 입력");
				String carColor=sc.nextLine();
				ex.updateCar(num, carName, carColor);
				break;
			}
			default:
				System.out.println("** 종료합니다 **");
				System.exit(0);
			}
		}
	}
}
