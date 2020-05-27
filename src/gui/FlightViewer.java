package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FlightViewer extends JFrame {
	public FlightViewer() {
		super("Flight Information");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
