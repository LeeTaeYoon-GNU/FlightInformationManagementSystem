package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import flight.DomesticFlight;

import manager.FlightManager;

//View All Flight창에 들어갔을 때 Domestic Flight와 International Flight를 나눠서 보여주는데 그 중 Domestic Flight에 들어갈 Panel
public class DomesticTable extends JPanel{
	FlightManager flightManager;
	
	public DomesticTable(FlightManager flightManager) {
		this.flightManager = flightManager;
		
		DefaultTableModel model = new DefaultTableModel();	//디폴트 테이블 모드 인스턴스 생성
		
		//테이블에 열을 늘리며 내용 추가
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		
		//Domestic Flight의 정보들을 입력
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
		
		JTable table = new JTable(model);	//설정한 테이블을 container인 JTable에 추가
		JScrollPane sp = new JScrollPane(table);	//스크롤기능이 있는 JScrollPane에 table 추가
		
		this.add(sp);
	}
}
