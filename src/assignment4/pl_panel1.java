package assignment4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class pl_panel1 extends JPanel {
	
	private JLabel labeldate;
	private JLabel labelcnum;
	private JLabel labelmenu;
	
	private JButton jorder;
	private JButton jcancle;
	private JTextArea jdate;
	private JTextArea jcnum;
	private JComboBox combomenu;
	private String[] menu = {"���", "������", "���", "¥���", "��ġ������"}; // ������� �ٸ��� �����Ͻ�
	
	public pl_panel1() {
		
		setLayout(null);
		
		labeldate = new JLabel(" ��       ¥");
		labeldate.setSize(100,20);
		labeldate.setLocation(100,50);
		
		labelcnum = new JLabel("����ȣ");
		labelcnum.setBounds(100,100,100,20);
		labelmenu = new JLabel(" ��       ��");
		labelmenu.setBounds(100,150,100,20);
		
		jdate = new JTextArea();
		jdate.setBounds(200,50,200,20);		
		jcnum = new JTextArea();
		jcnum.setBounds(200,100,200,20);
		combomenu = new JComboBox(menu);
		combomenu.setBounds(200,150,100,20);
		
		jorder = new JButton("�ֹ�");
		jorder.setBounds(130,230,100,50);
		jorder.addActionListener(new pl_order());		// �Լ� �����ؾ�����
		jcancle = new JButton("�ֹ����");
		jcancle.setBounds(280,230,100,50);
		jcancle.addActionListener(new pl_cancle());		// �Լ� �����ؾ�����
		
		add(labeldate);
		add(jdate);
		add(jcnum);
		add(labelcnum);
		add(labelmenu);
		add(combomenu);
		add(jorder);
		add(jcancle);
	}
	
}


