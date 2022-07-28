package project;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddingCustomers extends JFrame {
	AddingCustomers(){
		JLabel Id = new JLabel("Id");
		add(Id);
		JTextField Id_t1 = new JTextField(25);
		Id_t1.setEditable(true);
		add(Id_t1);
		JLabel name = new JLabel("name");
		add(name);
		JTextField name_t1 = new JTextField(25);
		name_t1.setEditable(true);
		add(name_t1);
		JLabel phoneNumber = new JLabel("phoneNumber");
		add(phoneNumber);
		JTextField phoneNumber_t1 = new JTextField(25);
		phoneNumber_t1.setEditable(true);
		add(phoneNumber_t1);
		JLabel registerNo = new JLabel("registerNo");
		add(registerNo);
		JTextField registerNo_t1 = new JTextField(25);
		registerNo_t1.setEditable(true);
		add(registerNo_t1);
		JLabel email_Id = new JLabel("email_Id");
		add(email_Id);
		JTextField email_Id_t1 = new JTextField(25);
		email_Id_t1.setEditable(true);
		add(email_Id_t1);
		JLabel password = new JLabel("password");
		add(password);
		JTextField password_t1 = new JTextField(25);
		password_t1.setEditable(true);
		add(password_t1);
		JButton b1 = new JButton("Submit Customer Details");
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("y");
				Manager obj = new Manager();
				Users u =new Users(Id_t1.getText(),name_t1.getText(),phoneNumber_t1.getText(),registerNo_t1.getText(),email_Id_t1.getText(),password_t1.getText(),"customer");
				obj.addCustomer(u);
			}
			
		});
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}


}
