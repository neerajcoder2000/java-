package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCdeleteWithPreparedStament {

	public static void main(String[] args) throws SQLException {
		

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/ct125";
		String user="root";
		String password="Neeraj@2000";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url, user, password);
			
			String sql="delete from customer1 where custid=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1,301);
			
			ps.executeUpdate();
			
			System.out.println("Data is Delete Successfully.......");
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
