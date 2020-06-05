package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InternationalTable extends JPanel{
	public InternationalTable() {
		DefaultTableModel model = new DefaultTableModel();	//디폴트 테이블 모드 인스턴스 생성
		
		//테이블에 열을 늘리며 내용 추가
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		model.addColumn("Transfer Times");
		model.addColumn("Transfer City");
		
		JTable table = new JTable(model);	//설정한 테이블을 container인 JTable에 추가
		JScrollPane sp = new JScrollPane(table);	//스크롤기능이 있는 JScrollPane에 table 추가
		
		this.add(sp);
	}
}
