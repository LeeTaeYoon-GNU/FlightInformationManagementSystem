package gui;

import javax.swing.*;

public class FlightEditor extends JFrame {
	public FlightEditor() {
		super("Flight Edit");	//Frameâ ������(����Ŭ������ ������ ȣ��)
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
		
		panel.add(new JButton("edit"));
		panel.add(new JButton("cancel"));
		
		//SpringUtilitiesŬ������ makeCompactGrid��� �޼ҵ带 �̿��� �гγ��� ��������
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
