package assignment4;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame{
	
	public pl_panel1 a = null;
	public pl_panel2 b = null;
	
	public static void main(String[] args) {
		JTabbedPaneTest win = new JTabbedPaneTest();
		win.setTitle("��̼�_����");
		
		win.a = new pl_panel1();
		win.b = new pl_panel2();
		JTabbedPane jtab = new JTabbedPane();
		
		jtab.addTab("�ֹ�����", win.a);
		jtab.addTab("������", win.b);
		win.add(jtab);
		
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(500,400);
		win.setVisible(true);
	}
}