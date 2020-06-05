package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InternationalTable extends JPanel{
	public InternationalTable() {
		DefaultTableModel model = new DefaultTableModel();	//����Ʈ ���̺� ��� �ν��Ͻ� ����
		
		//���̺� ���� �ø��� ���� �߰�
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		model.addColumn("Transfer Times");
		model.addColumn("Transfer City");
		
		JTable table = new JTable(model);	//������ ���̺��� container�� JTable�� �߰�
		JScrollPane sp = new JScrollPane(table);	//��ũ�ѱ���� �ִ� JScrollPane�� table �߰�
		
		this.add(sp);
	}
}
