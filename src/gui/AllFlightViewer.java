package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AllFlightViewer extends JFrame {
	public AllFlightViewer() {
		super("All of Flight Information");	//Frameâ ������(����Ŭ������ ������ ȣ��)
		
		DefaultTableModel model = new DefaultTableModel();	//����Ʈ ���̺� ��� �ν��Ͻ� ����
		
		//���̺� ���� �ø��� ���� �߰�
		model.addColumn("Flight Number");
		model.addColumn("Airline");
		model.addColumn("Departure");
		model.addColumn("Arrival");
		model.addColumn("Flight Time");
		
		JTable table = new JTable(model);	//������ ���̺��� container�� JTable�� �߰�
		JScrollPane sp = new JScrollPane(table);	//��ũ�ѱ���� �ִ� JScrollPane�� table �߰�
		
		this.add(sp);	//Frame�� sp�߰�
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
