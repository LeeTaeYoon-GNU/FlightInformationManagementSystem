package gui;

import javax.swing.*;

import listener.ButtonSaveDomesticListener;

public class FlightUploader extends JPanel{
	WindowFrame frame;
	
	public FlightUploader(WindowFrame frame) {
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
		
		JLabel labelDeparture = new JLabel("Departure: ", JLabel.TRAILING);
		JTextField fieldDeparture = new JTextField(10);
		labelDeparture.setLabelFor(fieldDeparture);
		this.add(labelDeparture);
		this.add(fieldDeparture);
		
		JLabel labelArrival = new JLabel("Arrival: ", JLabel.TRAILING);
		JTextField fieldArrival = new JTextField(10);
		labelArrival.setLabelFor(fieldArrival);
		this.add(labelArrival);
		this.add(fieldArrival);
		
		JLabel labelFlightTime = new JLabel("Flight Time: ", JLabel.TRAILING);
		JTextField fieldFlightTime = new JTextField(10);
		labelFlightTime.setLabelFor(fieldFlightTime);
		this.add(labelFlightTime);
		this.add(fieldFlightTime);
		
		JButton saveButton = new JButton("save");
		JButton cancelButton = new JButton("cancel");
		
		saveButton.addActionListener(new ButtonSaveDomesticListener(frame, frame.getFlightManager(), fieldFlightNumber, fieldAirline, fieldDeparture, 
				fieldArrival, fieldFlightTime));
		//cancelButton.addActionListener(l);
		this.add(saveButton);
		this.add(cancelButton);
		
		//SpringUtilities클래스의 makeCompactGrid라는 메소드를 이용해 패널내부 조정해줌
		SpringUtilities.makeCompactGrid(this, 6, 2, 6, 6, 6, 6);
	}
}
