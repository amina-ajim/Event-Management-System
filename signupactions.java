package project;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class signupactions extends JFrame{
	signupactions(){
		System.out.println("Hi");
		JLabel Id = new JLabel("Id");
		add(Id);
		JTextField Id_t1 = new JTextField(25);
		Id_t1.setEditable(true);
		add(Id_t1);
		JLabel EName = new JLabel("Ename");
		add(EName);
		JTextField EName_t1 = new JTextField(25);
		EName_t1.setEditable(true);
		add(EName_t1);
		JLabel phoneNumber = new JLabel("phoneNumber");
		add(phoneNumber);
		JTextField phoneNumber_t1 = new JTextField(25);
		phoneNumber_t1.setEditable(true);
		add(phoneNumber_t1);
		JLabel RegisterNo = new JLabel("RegisterNo");
		add(RegisterNo);
		JTextField RegisterNo_t1 = new JTextField(25);
		RegisterNo_t1.setEditable(true);
		add(RegisterNo_t1);
		JLabel Email_Id = new JLabel("Email_Id");
		add(Email_Id);
		JTextField Email_Id_t1 = new JTextField(25);
		Email_Id_t1.setEditable(true);
		add(Email_Id_t1);
		JLabel password  = new JLabel("password");
		add(password );
		JTextField password_t1 = new JTextField(25);
		password_t1.setEditable(true);
		add(password_t1);
		JLabel type = new JLabel("type");
		add(type);
		JTextField type_t1 = new JTextField(25);
		type_t1.setEditable(true);
		add(type_t1);
		JButton b = new JButton("Submit");
		add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("y");
				Users u = new Users(Id_t1.getText(),EName_t1.getText(),phoneNumber_t1.getText(),RegisterNo_t1.getText(),Email_Id_t1.getText(),password_t1.getText(),type_t1.getText());
				u.signUp(); 
				System.out.println("New user "+type_t1.getText()+" is Enrolled");
			}
		});
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
