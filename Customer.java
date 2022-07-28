package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer extends Users {
public Customer() {
System.out.println("customer constructor");	
}
 void selectEvent() {
	 
 }
 void payment(String Event_Id,String user_Id,Double price ,String payment_mode) {
	 System.out.println("Payment Success");
	 try {
			Class.forName("org.postgresql.Driver");     //loading driver
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaproject", "postgres", "8111");  //creating connection
			c.setAutoCommit(true); //saving changes automatically
			Statement stmt = c.createStatement();
			String sql ="insert into Payments values('"+Event_Id +"','"+ user_Id + "',"+price+",'"+payment_mode+"');";
			System.out.println(sql);
			 stmt.executeUpdate(sql);
			c.close();	
		} catch (ClassNotFoundException | SQLException e) {
		 System.out.println(e.getMessage());
		}
		
 }
}
