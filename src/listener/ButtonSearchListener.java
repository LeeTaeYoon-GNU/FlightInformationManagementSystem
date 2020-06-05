package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.FlightSearcher;
import gui.WindowFrame;

public class ButtonSearchListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonSearchListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		FlightSearcher searcher = frame.getFlightSearcher();
		frame.setupPanel(searcher);
		frame.setupSize(300, 150);
		frame.setupTitle("Search Flight");
	}
}
