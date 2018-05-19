package assignment4;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame{
	
	public pl_panel1 a = null;
	public pl_panel2 b = null;
	
	public static void main(String[] args) {
		JTabbedPaneTest win = new JTabbedPaneTest();
		win.setTitle("硅固家_苞力");
		
		win.a = new pl_panel1();
		win.b = new pl_panel2();
		JTabbedPane jtab = new JTabbedPane();
		
		jtab.addTab("林巩包府", win.a);
		jtab.addTab("绊按包府", win.b);
		win.add(jtab);
		
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(500,400);
		win.setVisible(true);
	}
}