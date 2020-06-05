package gui;

import java.awt.BorderLayout;
import javax.swing.*;

//FlightEditor�� ���� Flight�� �˻��� �� ���� �����ϰ����ϴ� Flight�� �����ϸ� �� Flight�� �����ϵ��� �����޴��� �����ִ� Ŭ����
public class EditMenuSelection extends JFrame{
	WindowFrame frame;
	
	public EditMenuSelection(WindowFrame frame) {
		super("Edit");	//Frameâ ������(����Ŭ������ ������ ȣ��)		
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
		
		//�г��� ���� frame�� ����, �߾ӿ� ��ġ
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		this.setSize(350, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
