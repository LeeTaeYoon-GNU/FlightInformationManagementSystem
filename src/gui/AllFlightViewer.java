package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AllFlightViewer extends JFrame {
	public AllFlightViewer() {
		super("All of Flight Information");	//Frame창 제목설정(상위클래스의 생성자 호출)
		
		DefaultTableModel model = new DefaultTableModel();	//디폴트 테이블 모드 인스턴스 생성
		
		//테이블에 열을 늘리며 내용 추가
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		
		JTable table = new JTable(model);	//설정한 테이블을 container인 JTable에 추가
		JScrollPane sp = new JScrollPane(table);	//스크롤기능이 있는 JScrollPane에 table 추가
		
		this.add(sp);	//Frame에 sp추가
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
