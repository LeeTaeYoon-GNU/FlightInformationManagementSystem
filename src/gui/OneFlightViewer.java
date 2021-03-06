package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

//FlightSearcher를 통해 Flight를 검색한 뒤 만약 찾고자 하는 Flight가 검색이 되면 그 Flight의 정보를 보여주는 클래스
public class OneFlightViewer extends JPanel {
	WindowFrame frame;
	
	public OneFlightViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();	//디폴트 테이블 모드 인스턴스 생성
		
		//테이블에 열을 늘리며 내용 추가
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		
		JTable table = new JTable(model);	//설정한 테이블을 container인 JTable에 추가
		JScrollPane sp = new JScrollPane(table);	//스크롤기능이 있는 JScrollPane에 table 추가
		
		this.add(sp);	//Panel에 sp추가
		
		this.setSize(500, 100);
		this.setVisible(true);
	}
}
