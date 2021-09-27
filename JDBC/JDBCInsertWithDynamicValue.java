package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertWithDynamicValue {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/ct125";
		String user="root";
		String password="Neeraj@2000";
		
		int cid;
		String cname,address;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id");
		cid=sc.nextInt();
		
		System.out.println("Enter Customer Name");
		cname=sc.next();
		
		System.out.println("Enter Customer Address");
		address=sc.next();
		
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url, user, password);
			
			String sql="insert into customer1 (custid,custname,address) values(?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, cid);
			ps.setString(2, cname);
			ps.setString(3, address);
			
			
			
			ps.executeUpdate();
			
			System.out.println("Data is inserted Successfully.......");
			
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
