package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee extends Users {
	Employee(){
		
	}
	String Id;
	String name;
	String phoneNumber;
	String registerNo ;
	String email_Id ;
	String password ;
	public Employee(String id, String name, String phoneNumber, String registerNo, String email_Id, String password) {
		this.Id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.registerNo = registerNo;
		this.email_Id = email_Id;
		this.password = password;
	}
	void addingEvent(Event e) {
		try {
			Class.forName("org.postgresql.Driver");     //loading driver
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaproject", "postgres", "8111");  //creating connection
			c.setAutoCommit(true); //saving changes automatically
			Statement stmt = c.createStatement();
			String sql ="insert into Event values('"+e.Event_Id+"','"+ e.name +"','"+e.user_Id+ "',"+e.price+",'"+e.venue+"');";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			amountCharged(e.price);
			c.close();	
		} catch (Exception e2) {
		 System.out.println(e2.getMessage());
		}
		
	}
	void amountCharged(double x) {
		System.out.println("The amount charged for the Event is : "+x);
	}
}
