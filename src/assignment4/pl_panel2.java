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
		
		labelcnum = new JLabel("����ȣ");
		labelcnum.setSize(100,20);
		labelcnum.setLocation(100,50);
		labelcname = new JLabel(" ��  ��  ��");
		labelcname.setBounds(100,100,100,20);
		labelcphone = new JLabel("��ȭ��ȣ");
		labelcphone.setBounds(100,150,100,20);
		labelcdate = new JLabel(" ��  ��  ��");
		labelcdate.setBounds(100,200,100,20);
		
		jcnum = new JTextArea();
		jcnum.setBounds(200,50,200,20);		
		jcname = new JTextArea();
		jcname.setBounds(200,100,200,20);
		jcphone = new JTextArea();
		jcphone.setBounds(200,150,200,20);
		jcdate = new JTextArea();
		jcdate.setBounds(200,200,200,20);

		jregister = new JButton("�����");
		jregister.setBounds(70,250,100,50);
		jregister.addActionListener(new pl_order()); // �Լ� �����ؾ���
		jsearch = new JButton("���˻�");
		jsearch.setBounds(200,250,100,50);
		jsearch.addActionListener(new pl_cancle());  // �Լ� �����ؾ��� 
		jremove = new JButton("������");
		jremove.setBounds(330,250,100,50);
		jremove.addActionListener(new pl_cancle());	 // �Լ� �����ؾ��� 
		
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
