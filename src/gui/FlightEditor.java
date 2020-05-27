package gui;

import javax.swing.*;

public class FlightEditor extends JFrame {
	public FlightEditor() {
		super("Flight Edit");	//Frame창 제목설정(상위클래스의 생성자 호출)
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());	//Layout을 "SpringLayout"으로 설정
		
		JLabel labelFlightNumber = new JLabel("Flight Number: ", JLabel.TRAILING);
		JTextField fieldFlightNumber = new JTextField(10);
		labelFlightNumber.setLabelFor(fieldFlightNumber);
		panel.add(labelFlightNumber);
		panel.add(fieldFlightNumber);
		
		JLabel labelAirline = new JLabel("Airline: ", JLabel.TRAILING);
		JTextField fieldAirline = new JTextField(10);
		labelAirline.setLabelFor(fieldAirline);
		panel.add(labelAirline);
		panel.add(fieldAirline);
		
		panel.add(new JButton("edit"));
		panel.add(new JButton("cancel"));
		
		//SpringUtilities클래스의 makeCompactGrid라는 메소드를 이용해 패널내부 조정해줌
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
