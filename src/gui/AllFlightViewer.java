package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AllFlightViewer extends JPanel {
	WindowFrame frame;
	
	public AllFlightViewer(WindowFrame frame) {
		this.frame = frame;
		
		JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel one = new JPanel();
		JPanel two = new JPanel();
		
		DomesticTable t1 = new DomesticTable();
		InternationalTable t2 = new InternationalTable();
		
		one.setSize(700, 700);
		two.setSize(700, 700);
		
		one.add(t1);
		two.add(t2);
		
		tab.addTab("Domestic Flight", one);
		tab.addTab("International Flight", two);
		
		this.setSize(700, 700);
		this.add(tab);
	}
}
