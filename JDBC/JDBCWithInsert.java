package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCWithInsert {

	public static void main(String[] args) throws SQLException {
	// Static data insert
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/ct125?"+"autoReconnect=true&useSSL=false";
		String user="root";
		String password="Neeraj@2000";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url, user, password);
			
			String sql="insert into customer1(custid,custname,address) values(303,'Montu','Kolkata')";
			ps=con.prepareStatement(sql);
			
			ps.executeUpdate();
			
			System.out.println("Row inserted successfully...........");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			ps.close();
			con.close();
		}

	}

}
