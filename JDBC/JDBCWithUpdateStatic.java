package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCWithUpdateStatic {

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
			
			String sql="update customer1 set custname='hina', address='mumbai' where custid=405";
			ps=con.prepareStatement(sql);
			
			ps.executeUpdate();
			
			System.out.println("Customer Update Successfully.......");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
