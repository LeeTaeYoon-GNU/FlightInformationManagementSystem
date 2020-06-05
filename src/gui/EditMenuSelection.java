package gui;

import java.awt.BorderLayout;
import javax.swing.*;

//FlightEditor를 통해 Flight를 검색한 뒤 만약 수정하고자하는 Flight가 존재하면 그 Flight를 수정하도록 수정메뉴를 보여주는 클래스
public class EditMenuSelection extends JFrame{
	WindowFrame frame;
	
	public EditMenuSelection(WindowFrame frame) {
		super("Edit");	//Frame창 제목설정(상위클래스의 생성자 호출)		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("Edit Menu Selection");
		JButton button1 = new JButton("Flight Numer");
		JButton button2 = new JButton("Airline");
		JButton button3 = new JButton("Departure");
		JButton button4 = new JButton("Arrival");
		JButton button5 = new JButton("Flight Time");
		JButton button6 = new JButton("Exit");
		
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
		
		this.setSize(350, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
