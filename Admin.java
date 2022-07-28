package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Admin extends Users {
	String Id;
	String name;
	String phoneNumber;
	String registerNo;
	String email_Id;
	String password;
	Admin(){
		
	}
  void addManager(Users e) {
	  try {
			Class.forName("org.postgresql.Driver");     //loading driver
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaproject", "postgres", "8111");  //creating connection
			c.setAutoCommit(true); //saving changes automatically
			Statement stmt = c.createStatement();
			String sql ="insert into Users values('"+e.getId()+"','"+ e.ename +"','"+e.phonenumber+ "','"+e.RegisterNo+"','"+e.email_id+"','"+e.password+"','"+e.type+"');";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			c.close();	
		} catch (Exception e2) {
		 System.out.println(e2.getMessage());
		} 
	  
  }
  void checkPayment() {
	  try {
			Class.forName("org.postgresql.Driver");     //loading driver
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaproject", "postgres", "8111");  //creating connection
			c.setAutoCommit(true); //saving changes automatically
			Statement stmt = c.createStatement();
			String sql ="select * from payments;";
			System.out.println(sql);
			ResultSet result =  stmt.executeQuery(sql);
			
			while(result.next()) {
				 

			 System.out.println(  );
			 System.out.println(result.getString("Event_Id"));     
			 System.out.println(result.getString("user_Id"));    
			 System.out.println(result.getString("price"));    
			 System.out.println(result.getString("payment_mode"));
			 
			}
			c.close();	
		} catch (Exception e2) {
		 System.out.println(e2.getMessage());
		} 
	  
  }
}
