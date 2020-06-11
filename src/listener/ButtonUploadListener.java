package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.FlightUploader;
import gui.WindowFrame;

//MenuSelection -> Upload Flight버튼을 눌렀을 때를 위한 Listener
public class ButtonUploadListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonUploadListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		FlightUploader uploader = frame.getFlightUploader();
		frame.setupPanel(uploader);
		frame.setupSize(300, 250);
		frame.setupTitle("Upload Flight");
	}
}
