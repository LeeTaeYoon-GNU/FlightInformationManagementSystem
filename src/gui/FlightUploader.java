package gui;

import javax.swing.*;

public class FlightUploader extends JFrame{
	public FlightUploader() {
		super("Flight Upload");	//Frameâ ������(����Ŭ������ ������ ȣ��)
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());	//Layout�� "SpringLayout"���� ����
		
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
		
		JLabel labelDeparture = new JLabel("Departure: ", JLabel.TRAILING);
		JTextField fieldDeparture = new JTextField(10);
		labelDeparture.setLabelFor(fieldDeparture);
		panel.add(labelDeparture);
		panel.add(fieldDeparture);
		
		JLabel labelArrival = new JLabel("Arrival: ", JLabel.TRAILING);
		JTextField fieldArrival = new JTextField(10);
		labelArrival.setLabelFor(fieldArrival);
		panel.add(labelArrival);
		panel.add(fieldArrival);
		
		JLabel labelFlightTime = new JLabel("Flight Time: ", JLabel.TRAILING);
		JTextField fieldFlightTime = new JTextField(10);
		labelFlightTime.setLabelFor(fieldFlightTime);
		panel.add(labelFlightTime);
		panel.add(fieldFlightTime);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		//SpringUtilitiesŬ������ makeCompactGrid��� �޼ҵ带 �̿��� �гγ��� ��������
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
