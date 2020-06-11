package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.AllFlightViewer;
import gui.WindowFrame;

//MenuSelection -> View All Flights버튼을 눌렀을 때를 위한 Listener
public class ButtonAllViewListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonAllViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		AllFlightViewer allViewer= frame.getAllViewer();
		frame.setupPanel(allViewer);
		frame.setupSize(500, 550);
		frame.setupTitle("All of Flight Information");
	}
}
