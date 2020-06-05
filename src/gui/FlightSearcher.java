package gui;

import javax.swing.*;

public class FlightSearcher extends JPanel {
	WindowFrame frame;
	
	public FlightSearcher(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new SpringLayout());	//Layout을 "SpringLayout"으로 설정
		
		JLabel labelFlightNumber = new JLabel("Flight Number: ", JLabel.TRAILING);
		JTextField fieldFlightNumber = new JTextField(10);
		labelFlightNumber.setLabelFor(fieldFlightNumber);
		this.add(labelFlightNumber);
		this.add(fieldFlightNumber);
		
		JLabel labelAirline = new JLabel("Airline: ", JLabel.TRAILING);
		JTextField fieldAirline = new JTextField(10);
		labelAirline.setLabelFor(fieldAirline);
		this.add(labelAirline);
		this.add(fieldAirline);
		
		this.add(new JButton("search"));
		this.add(new JButton("cancel"));
		
		//SpringUtilities클래스의 makeCompactGrid라는 메소드를 이용해 패널내부 조정해줌
		SpringUtilities.makeCompactGrid(this, 3, 2, 6, 6, 6, 6);
		
		this.setSize(300, 150);
	}
}
