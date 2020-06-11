package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import flight.InternationalFlight;
import manager.FlightManager;

//View All Flight창에 들어갔을 때 Domestic Flight와 International Flight를 나눠서 보여주는데 그 중 Domestic Flight에 들어갈 Panel
public class InternationalTable extends JPanel{
	FlightManager flightManager;
	
	public InternationalTable(FlightManager flightManager) {
		this.flightManager = flightManager;
		
		DefaultTableModel model = new DefaultTableModel();	//디폴트 테이블 모드 인스턴스 생성
		
		//테이블에 열을 늘리며 내용 추가
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		model.addColumn("Transfer Times");
		model.addColumn("Transfer City");
		
		//International Flight의 정보들을 입력
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
		
		JTable table = new JTable(model);	//설정한 테이블을 container인 JTable에 추가
		JScrollPane sp = new JScrollPane(table);	//스크롤기능이 있는 JScrollPane에 table 추가
		
		this.add(sp);
	}
}