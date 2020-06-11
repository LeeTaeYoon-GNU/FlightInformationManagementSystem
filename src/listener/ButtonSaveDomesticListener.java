package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import flight.DomesticFlight;
import flight.FlightInput;
import flight.FlightKind;
import gui.WindowFrame;
import manager.FlightManager;

public class ButtonSaveDomesticListener implements ActionListener {
	WindowFrame frame;
	FlightManager flightManager;
	
	JTextField fieldFlightNumber;
	JTextField fieldAirline;
	JTextField fieldDeparture;
	JTextField fieldArrival;
	JTextField fieldFlightTime;
	
	public ButtonSaveDomesticListener(WindowFrame frame, FlightManager flightManager, JTextField fieldFlightNumber, JTextField fieldAirline, 
			JTextField fieldDeparture, JTextField fieldArrival, JTextField fieldFlightTime) {
		this.frame = frame;
		this.flightManager = flightManager;
		this.fieldFlightNumber = fieldFlightNumber;
		this.fieldAirline = fieldAirline;
		this.fieldDeparture = fieldDeparture;
		this.fieldArrival = fieldArrival;
		this.fieldFlightTime = fieldFlightTime;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		
		FlightInput df;
		df = new DomesticFlight(FlightKind.DomesticFlight);
		df.setFlightNum(Integer.parseInt(fieldFlightNumber.getText()));
		df.setAirlineName(fieldAirline.getText());
		df.setDeparture(fieldDeparture.getText());
		df.setArrival(fieldDeparture.getText());
		df.setFlightTime(fieldFlightTime.getText());
		flightManager.uploadToList(df);
		
		frame.setupPanel(frame.getFlightUploader());
		frame.setupSize(300, 250);
		frame.setupTitle("Upload Flight");
	}
}
