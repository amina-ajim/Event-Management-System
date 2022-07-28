package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Users {
	String id;
	String ename;
	String phonenumber;
	String RegisterNo;
	String email_id;
	String password;
	String type;
	String Event_Id;
	String name;
	String user_Id ;
	double price ;
	String venue ;
	public Users(){
		
	}
	public Users(String Id,String name,String phoneNumber,String registerNo,String email_Id ,String password) { //employee
		this.id = Id;
		this.name=name;
		this.phonenumber=phoneNumber;
		this.RegisterNo=registerNo;
		this.email_id=email_Id;
		this.password=password;
	}
	public Users(String Event_Id,String name,String user_Id ,double price ,String venue ) {  //payment table constructor
		this.Event_Id = Event_Id;
		this.name = name;
		this.user_Id = user_Id;
		this.price= price;
		this.venue = venue;
	}
	public Users(String id, String ename, String phonenumber, String registerNo, String email_id, String password,   //user table constructor
			String type) {
		this.id = id;
		this.ename = ename;
		this.phonenumber = phonenumber;
		this.RegisterNo = registerNo;
		this.email_id = email_id;
		this.password = password;
		this.type = type;
	}	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisterNo() {
		return RegisterNo;
	}
	public void setRegisterNo(String registerNo) {
		RegisterNo = registerNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	void signUp() {
		try {
			Class.forName("org.postgresql.Driver");     //loading driver
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaproject", "postgres", "8111");  //creating connection
			c.setAutoCommit(true); //saving changes automatically
			Statement stmt = c.createStatement();
			String sql ="insert into Users values('"+this.id+"','"+ this.ename + "','"+this.phonenumber+"','"+this.RegisterNo+"','"+this.email_id+"','"+this.password+"','"+this.type+"');";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			c.close();	
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	Users signIn(String username,String password) {
		try {
			Users u1 = new Users();
			Class.forName("org.postgresql.Driver");     //loading driver
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaproject", "postgres", "8111");  //creating connection
			c.setAutoCommit(true); //saving changes automatically
			Statement stmt = c.createStatement();
			String sql ="select * from users where Email_Id='"+username+"' and password='"+password+"';" ;
			System.out.println(sql);
				ResultSet result =  stmt.executeQuery(sql);
				int count=0;
				while(result.next()) {
                 count++;
				 System.out.println(  );
				 System.out.println(result.getString("email_id"));     
				 System.out.println(result.getString("password"));    
				 System.out.println(result.getString("type"));    
				 u1.setEmail_id(result.getString("ename"));
				 u1.setType(result.getString("type"));
				 u1.setId(result.getString("Id"));
				    // etc.
				}
				if(count==1)
				return u1;
				c.close();	
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
