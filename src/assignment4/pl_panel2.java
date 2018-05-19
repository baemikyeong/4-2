package assignment4;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class pl_panel2 extends JPanel{
	private JLabel labelcnum;
	private JLabel labelcname;
	private JLabel labelcphone;
	private JLabel labelcdate;
	
	private JButton jregister;
	private JButton jsearch;
	private JButton jremove;
	private JTextArea jcnum;
	private JTextArea jcname;
	private JTextArea jcphone;
	private JTextArea jcdate;
	
	public pl_panel2() {
		
		setLayout(null);
		
		labelcnum = new JLabel("고객번호");
		labelcnum.setSize(100,20);
		labelcnum.setLocation(100,50);
		labelcname = new JLabel(" 고  객  명");
		labelcname.setBounds(100,100,100,20);
		labelcphone = new JLabel("전화번호");
		labelcphone.setBounds(100,150,100,20);
		labelcdate = new JLabel(" 가  입  일");
		labelcdate.setBounds(100,200,100,20);
		
		jcnum = new JTextArea();
		jcnum.setBounds(200,50,200,20);		
		jcname = new JTextArea();
		jcname.setBounds(200,100,200,20);
		jcphone = new JTextArea();
		jcphone.setBounds(200,150,200,20);
		jcdate = new JTextArea();
		jcdate.setBounds(200,200,200,20);

		jregister = new JButton("고객등록");
		jregister.setBounds(70,250,100,50);
		jregister.addActionListener(new pl_order()); // 함수 수정해야함
		jsearch = new JButton("고객검색");
		jsearch.setBounds(200,250,100,50);
		jsearch.addActionListener(new pl_cancle());  // 함수 수정해야함 
		jremove = new JButton("고객삭제");
		jremove.setBounds(330,250,100,50);
		jremove.addActionListener(new pl_cancle());	 // 함수 수정해야함 
		
		add(labelcnum);
		add(labelcname);
		add(labelcphone);
		add(labelcdate);
		add(jcnum);
		add(jcname);
		add(jcphone);
		add(jcdate);
		add(jregister);
		add(jsearch);
		add(jremove);
	}
}
