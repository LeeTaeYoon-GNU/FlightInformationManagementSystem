package gui;

import javax.swing.*;
import manager.FlightManager;

public class AllFlightViewer extends JPanel {
	WindowFrame frame;
	
	public AllFlightViewer(WindowFrame frame, FlightManager flightManager) {
		this.frame = frame;
		
		JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);	//Tab을 넣어 Domestic Flight와 International Flight를 구분시켜주기위함
		
		JPanel one = new JPanel();
		JPanel two = new JPanel();
		
		DomesticTable t1 = new DomesticTable(flightManager);
		InternationalTable t2 = new InternationalTable(flightManager);
		
		one.add(t1);
		two.add(t2);
		
		tab.addTab("Domestic Flight", one);
		tab.addTab("International Flight", two);
		
		this.add(tab);
	}
}
