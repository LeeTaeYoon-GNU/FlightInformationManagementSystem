package gui;

import java.awt.BorderLayout;
import javax.swing.*;

public class MenuSelection extends JFrame{
	public MenuSelection() {
		super("Flight Management");	//Frame창 제목설정
		this.setSize(300, 200);	//frame창 크기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Upload Flight");
		JButton button2 = new JButton("Delete Flight");
		JButton button3 = new JButton("Edit Flight");
		JButton button4 = new JButton("View All Flights");
		JButton button5 = new JButton("Search Flight");
		JButton button6 = new JButton("Exit");
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);

		this.setVisible(true);
	}
}
