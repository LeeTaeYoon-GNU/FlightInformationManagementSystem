package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import flight.DomesticFlight;

import manager.FlightManager;

//View All Flightâ�� ���� �� Domestic Flight�� International Flight�� ������ �����ִµ� �� �� Domestic Flight�� �� Panel
public class DomesticTable extends JPanel{
	FlightManager flightManager;
	
	public DomesticTable(FlightManager flightManager) {
		this.flightManager = flightManager;
		
		DefaultTableModel model = new DefaultTableModel();	//����Ʈ ���̺� ��� �ν��Ͻ� ����
		
		//���̺� ���� �ø��� ���� �߰�
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		
		//Domestic Flight�� �������� �Է�
		for(int i = 0; i < flightManager.size(); i++) {
			Vector row = new Vector();
			DomesticFlight df = flightManager.getDomestic(i);
			if(df != null) {
				row.add(df.getFlightNum());
				row.add(df.getAirlineName());
				row.add(df.getDeparture());
				row.add(df.getArrival());
				row.add(df.getFlightTme());
				model.addRow(row);
			}
		}
		
		JTable table = new JTable(model);	//������ ���̺��� container�� JTable�� �߰�
		JScrollPane sp = new JScrollPane(table);	//��ũ�ѱ���� �ִ� JScrollPane�� table �߰�
		
		this.add(sp);
	}
}
