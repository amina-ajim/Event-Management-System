package project;
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
class page extends JFrame{
	Users u,u1;
	Manager m;
	Customer c;
	Admin a;
	public page(){
		u = new Users();
		m = new Manager();
		c = new Customer();
		a = new Admin();
	}
	public void start()
	{
		JTextField t1;
		JTextField t2;
		JButton b1;
		JButton b2;
		setTitle("Event Management System");
		JLabel l1=new JLabel("email_Id");
		add(l1);
		t1 = new JTextField(25);
		t1.setEditable(true);
		add(t1);
		JLabel l2=new JLabel("Password");
		add(l2);
		t2 = new JTextField(25);
		t2.setEditable(true);
		add(t2);
		b1=new JButton("SignUp");	//button is dumb by default.So to provide action we use actionlistener
		add(b1);
		b2=new JButton("SignIn");	//button is dumb by default.So to provide action we use actionlistener
		add(b2);
		b2.addActionListener(new ActionListener() { //perform when signIn clicked
			public void actionPerformed(ActionEvent e) {
				u1 = u.signIn(t1.getText(),t2.getText());
				if(u1!=null)
				{
					System.out.println("Signin Success");
					HomePage obj = new HomePage();
					System.out.println(u1.getId());
					obj.proceed(u1.getType(),u1.getId());
				}
				else
				{
					System.out.println("Invalid credentials");
				}
			}
		});
		b1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				new signupactions(); 
			}
		});
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
public class projectJDBC {
	public static void main(String[] args) {
	    page p = new page();
		p.start();
		
	}

}
