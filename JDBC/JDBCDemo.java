package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		
		try {
			// Load and Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ct125" , "root" , "Neeraj@2000");
			
			//Create Statement
			Statement stmt = con.createStatement();
			
			//executeQuery
			String sql ="select * from customer1";
		
			//ResultSet
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
			}
			
			//Close Connection
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		

	}

}
