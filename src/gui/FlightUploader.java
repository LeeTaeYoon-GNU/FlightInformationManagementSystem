package gui;

import javax.swing.*;

public class FlightUploader extends JPanel{
	WindowFrame frame;
	
	public FlightUploader(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new SpringLayout());	//Layout�� "SpringLayout"���� ����
		
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
		
		this.add(new JButton("save"));
		this.add(new JButton("cancel"));
		
		//SpringUtilitiesŬ������ makeCompactGrid��� �޼ҵ带 �̿��� �гγ��� ��������
		SpringUtilities.makeCompactGrid(this, 6, 2, 6, 6, 6, 6);
	}
}
