package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.FlightEditor;
import gui.WindowFrame;

//MenuSelection -> Edit Flight버튼을 눌렀을 때를 위한 Listener
public class ButtonEditListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		FlightEditor editor = frame.getFlightEditor();
		frame.setupPanel(editor);
		frame.setupSize(300, 150);
		frame.setupTitle("Edit Flight");
	}
}
