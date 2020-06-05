package gui;

import java.awt.BorderLayout;
import javax.swing.*;

import listener.*;

public class MenuSelection extends JPanel{
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Upload Flight");
		JButton button2 = new JButton("Delete Flight");
		JButton button3 = new JButton("Edit Flight");
		JButton button4 = new JButton("View All Flights");
		JButton button5 = new JButton("Search Flight");
		JButton button6 = new JButton("Exit");
		
		button1.addActionListener(new ButtonUploadListener(frame));
		button2.addActionListener(new ButtonRemoveListener(frame));
		button3.addActionListener(new ButtonEditListener(frame));
		button4.addActionListener(new ButtonAllViewListener(frame));
		button5.addActionListener(new ButtonSearchListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		//패널을 각각 frame의 위쪽, 중앙에 위치
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}
