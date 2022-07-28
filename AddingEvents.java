package project;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddingEvents extends JFrame {
	AddingEvents(String Id){
		JLabel Event_Id = new JLabel("Event_Id");
		add(Event_Id);
		JTextField Event_Id_t1 = new JTextField(25);
		Event_Id_t1.setEditable(true);
		add(Event_Id_t1);
		JLabel name = new JLabel("name");
		add(name);
		JTextField name_t1 = new JTextField(25);
		name_t1.setEditable(true);
		add(name_t1);
		JLabel user_Id = new JLabel("user_Id");
		add(user_Id);
		JTextField user_Id_t1 = new JTextField(25);
		user_Id_t1.setEditable(true);
		add(user_Id_t1);
		JLabel price = new JLabel("Price");
		add(price);
		JTextField price_t1 = new JTextField(25);
		price_t1.setEditable(true);
		add(price_t1);
		JLabel venue_Id = new JLabel("venue");
		add(venue_Id);
		JTextField venue_t1 = new JTextField(25);
		venue_t1.setEditable(true);
		add(venue_t1);
		JButton b = new JButton("Submit");
		add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("y");
				Employee obj = new Employee();
				Event e1=new Event(Event_Id_t1.getText(),name_t1.getText(),Id,Double.parseDouble(price_t1.getText()),venue_t1.getText());
				obj.addingEvent(e1);
				
			}
		});
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
