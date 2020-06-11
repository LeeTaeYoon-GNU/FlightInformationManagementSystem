package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.FlightRemover;
import gui.WindowFrame;

//MenuSelection -> Delete Flight버튼을 눌렀을 때를 위한 Listener
public class ButtonRemoveListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonRemoveListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		FlightRemover remover = frame.getFlightRemover();
		frame.setupPanel(remover);
		frame.setupSize(300, 150);
		frame.setupTitle("Delete Flight");
	}
}
