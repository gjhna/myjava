package ch08;
import javax.swing.*;
public class ch_8_4_ScrollPaneWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame();//�������壬���ô������ʹ���رշ�ʽ
		frm.setTitle("���������Ĵ���");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea ta=new JTextArea();//����һ��5��32�е��ı��򣬲�����Ĭ������
		ta.setRows(5);
		ta.setColumns(32);
		ta.setText("����һ��5��32�е��ı���\n\r�����������Լ�������й۲�Ч��!");
		
		JButton btn=new JButton("��ť");//����һ����ť
		
		JPanel p=new JPanel();//����һ�������������壬������ı���Ͱ�ť
		p.add(ta);
		p.add(btn);
		
		JScrollPane sp=new JScrollPane();//����������壬���������洴�������Ϊ���
		sp.setViewportView(p);
		frm.setContentPane(sp);//�������������Ϊ������������
		
		frm.setBounds(450,230 , 300, 150);
		frm.setVisible(true);
		
	}

}
