package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import flight.InternationalFlight;
import manager.FlightManager;

//View All Flightâ�� ���� �� Domestic Flight�� International Flight�� ������ �����ִµ� �� �� Domestic Flight�� �� Panel
public class InternationalTable extends JPanel{
	FlightManager flightManager;
	
	public InternationalTable(FlightManager flightManager) {
		this.flightManager = flightManager;
		
		DefaultTableModel model = new DefaultTableModel();	//����Ʈ ���̺� ��� �ν��Ͻ� ����
		
		//���̺� ���� �ø��� ���� �߰�
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		model.addColumn("Transfer Times");
		model.addColumn("Transfer City");
		
		//International Flight�� �������� �Է�
		for(int i = 0; i < flightManager.size(); i++) {
			Vector row = new Vector();
			InternationalFlight interf = flightManager.getInternational(i);
			if(interf != null) {
				row.add(interf.getFlightNum());
				row.add(interf.getAirlineName());
				row.add(interf.getDeparture());
				row.add(interf.getArrival());
				row.add(interf.getFlightTme());
				row.add(interf.getTransferTime());
				row.add(interf.getTransferCity(interf.getTransferTime()));
				model.addRow(row);
			}
		}
		
		JTable table = new JTable(model);	//������ ���̺��� container�� JTable�� �߰�
		JScrollPane sp = new JScrollPane(table);	//��ũ�ѱ���� �ִ� JScrollPane�� table �߰�
		
		this.add(sp);
	}
}