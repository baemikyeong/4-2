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
	private String[] menu = {"김밥", "떡볶이", "라면", "짜장면", "김치볶음밥"}; // 사람마다 다르니 수정하슈
	
	public pl_panel1() {
		
		setLayout(null);
		
		labeldate = new JLabel(" 날       짜");
		labeldate.setSize(100,20);
		labeldate.setLocation(100,50);
		
		labelcnum = new JLabel("고객번호");
		labelcnum.setBounds(100,100,100,20);
		labelmenu = new JLabel(" 메       뉴");
		labelmenu.setBounds(100,150,100,20);
		
		jdate = new JTextArea();
		jdate.setBounds(200,50,200,20);		
		jcnum = new JTextArea();
		jcnum.setBounds(200,100,200,20);
		combomenu = new JComboBox(menu);
		combomenu.setBounds(200,150,100,20);
		
		jorder = new JButton("주문");
		jorder.setBounds(130,230,100,50);
		jorder.addActionListener(new pl_order());		// 함수 구현해야해유
		jcancle = new JButton("주문취소");
		jcancle.setBounds(280,230,100,50);
		jcancle.addActionListener(new pl_cancle());		// 함수 구현해야해융
		
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


