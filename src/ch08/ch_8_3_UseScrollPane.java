package ch08;
import java.awt.BorderLayout;
import javax.swing.*;

public class ch_8_3_UseScrollPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame();//�������壬���ô������͹رշ�ʽ
		frm.setTitle("ʹ��JScrollPane");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������������򣬾�Ϊ2��32�У�������Ĭ������
		JTextArea toutput=new JTextArea();
		toutput.setRows(2);
		toutput.setColumns(32);
		toutput.setText("����JScrollPaneʹ��ʾ����\n\r����һ������϶��ַ��۲���ʾ���ı仯��");
		
		JTextArea coutput=new JTextArea();
		coutput.setRows(2);
		coutput.setColumns(32);
		coutput.setText("����JScrollPaneʹ��ʾ����\\n\\r����������ַ���һ������ַ��۲���ʾ���ı仯��");
		
		JTextArea boutput=new JTextArea();
		boutput.setRows(2);
		boutput.setColumns(32);
		boutput.setText("����JScrollPaneʹ��ʾ����\\n\\r����������ַ��۲���ʾ���ı仯��");
		
		JScrollPane toutputScrollPane=new JScrollPane();//���������������
		JScrollPane coutputScrollPane=new JScrollPane();
		JScrollPane boutputScrollPane=new JScrollPane();
		
		toutputScrollPane.setViewportView(toutput);//Ϊÿ�����������Ӹ��Ե����
		coutputScrollPane.setViewportView(coutput);
		boutputScrollPane.setViewportView(boutput);
		
		toutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//Ϊÿ�������������ˮƽ�ʹ�ֱ��ʾ����
		toutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		coutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		coutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		boutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		boutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		
		frm.add(toutputScrollPane,BorderLayout.NORTH);//�ڴ�������������������
		frm.add(coutputScrollPane,BorderLayout.CENTER);
		frm.add(boutputScrollPane,BorderLayout.SOUTH);
		
		frm.setBounds(450,230,400,180);//���ô����λ�����С����ʾ
		frm.setVisible(true);
	}

}
