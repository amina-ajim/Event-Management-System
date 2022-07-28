package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Manager extends Users {
	String Id;
	String name;
	String phoneNumber;
	String registerNo;
	String email_Id;
	String password;
	Manager(){
		
	}
  void addEmployee(Users e) {
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
  void addCustomer(Users e) {
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
}
