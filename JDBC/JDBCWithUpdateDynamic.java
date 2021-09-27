package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCWithUpdateDynamic {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/ct125";
		String user="root";
		String password="Neeraj@2000";
		
		
		int cid;
		String cname , address;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer Id which you want to update");
		cid=sc.nextInt();
		
		System.out.println("Enter Customer Name");
		cname=sc.next();
		
		System.out.println("Enter Customer Address");
		address=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url, user, password);
			
			String sql="update customer1 set custname=?, address=?  where custid=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, cname);
			ps.setString(2, address);
			ps.setInt(3, cid);
			
			ps.executeUpdate();
			System.out.println("Customer Update Successfully........");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			ps.close();
			con.close();
		}
		

	}

}
