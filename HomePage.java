package project;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class HomePage extends JFrame{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	HomePage(){
		
	}
	public void proceed(String type,String Id){
		System.out.println("hai");
		b1=new JButton("Add Event");
		if(type.compareToIgnoreCase("employee")==0) {
			add(b1);
		}
		JButton b2=new JButton("Select Event");
		if(type.compareToIgnoreCase("customer")==0){
			add(b2);
		}
		JButton b3=new JButton("Add Employee");
		JButton b4=new JButton("Add Customer");
		if(type.compareToIgnoreCase("manager")==0){
			add(b3);
			add(b4);
		}
		JButton b5=new JButton("Add Manager");
		JButton b6=new JButton("Check Payment");
		if(type.compareToIgnoreCase("admin")==0){
			add(b5);
			add(b6);
		}
		b1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				new AddingEvents(Id);
			}
		});
		b2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				selectEvent se= new selectEvent();
			}
		});
		b3.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				new AddingEmployees();
			}
		});
		b4.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				new AddingCustomers();
			}
		});
		b5.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				new AddingManager();
			}
		});
		b6.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Admin a = new Admin();
				a.checkPayment();
			}
		});
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
