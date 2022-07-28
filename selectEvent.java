package project;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class selectEvent extends JFrame implements ActionListener {
	JMenu menu;
	JMenuItem a1,a2,a3;
	 JTextField t;
	 Event e1,e2,e3;
		JButton b;
	Event ev=null;
	selectEvent(){
		 e1 = new Event("Ev101","Marriage","E101", 40000, "Vijayawada");
		 e2 = new Event("Ev102","Birthday","E101", 20000, "Kerala");
		 e3 = new Event("Ev103","sendoff","E101", 10000, "Delhi");
		 menu = new JMenu("EventsList");
		 a1=new JMenuItem(e1.getName());
		 a2=new JMenuItem(e2.getName());
		 a3=new JMenuItem(e3.getName());
		menu.add(a1);
		a1.addActionListener(this);
		menu.add(a2);
		a2.addActionListener(this);
		menu.add(a3);
		a3.addActionListener(this);
		JMenuBar m1 = new JMenuBar();
		m1.add(menu);
		JLabel l=new JLabel("Price");
		add(l);
		t = new JTextField(25);
		t.setEditable(true);
		add(t);
		b=new JButton("Payment");
		add(b);
		b.addActionListener(this);
		setJMenuBar(m1);
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("button listener");
			Customer c1 = new Customer();
			
			String Event_Id;
			double payment;
		
			if(e.getSource()==a1) {
				t.setText(e1.getPrice()+"");
				ev=e1;
			}
			if(e.getSource()==a2) {
				t.setText(e2.getPrice()+"");
				ev=e2;
			}
			if(e.getSource()==a3) {
				t.setText(e3.getPrice()+"");
				ev=e3;
			}
			if(e.getSource()==b) {
				System.out.println("psyment");
				c1.payment(ev.getEvent_Id(),"100",ev.getPrice(),"Card");
				System.out.println("pay");
			}
		
	} 
	  
}
