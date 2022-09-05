package test.day0805;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DbConnect;

public class Ex4MysqlShopCategory {
	DbConnect db=new DbConnect();
	
	public void categoryAllView()
	{
		String sql="select upper(category) category,count(*) count,"
				+ "format(avg(price),0) avg,format(max(price),0) max,"
				+ "format(min(price),0) min from shop group by category order by 1";
		//퀀텀 복붙 했을때 \r\n 없애기, "" 안에 ; 없게
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		conn=db.getMysqlConnection();
		try {
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("\t** Shop의 상품 분석 **");
			System.out.println("category        count\tavg\tmax\tmin");
			System.out.println("---------------------------------------------");
			int total=0;
			while(rs.next())
			{
				String category=rs.getString("category");
				int count=rs.getInt("count");
				total+=count;//count를 int로 받아야 계산이 가능
				String avg=rs.getString("avg");
				String max=rs.getString("max");
				String min=rs.getString("min");
				
				System.out.printf("%-9s\t%d개\t%s\t%s\t%s\n",category,count,avg,max,min);
				
			}
			System.out.println();
			System.out.println("\t총 상품 갯수 : "+total+"개");
		} catch (SQLException e) {
		}finally {
			db.dbClose(conn, pstmt, rs);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4MysqlShopCategory ex=new Ex4MysqlShopCategory();
		ex.categoryAllView();
	}

}
