package ch08;
import java.awt.*;
import javax.swing.*;
public class ch_8_2_UsePanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("ʹ��JPanel");//�������岢���ô��ڱ���
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô���رշ�ʽ
		JPanel topPanel=new JPanel();//������岢���ڴ����ϰ벿��
		frm.add(topPanel,BorderLayout.NORTH);
		JLabel show=new JLabel();//������ʾ��ǩ��������ʾ��Ϣ
		show.setText("������������");
		JTextField input=new JTextField();//�������������Ϊ�ɱ༭��������룬20��
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(20);
		JButton myBtn=new JButton("�ύ");//�����ύ��ť
		topPanel.add(show);//�����ʾ��ǩ�������Ͱ�ť
		topPanel.add(input);
		topPanel.add(myBtn);
		
		
		JPanel bottomPanel=new JPanel();//������岢���ڴ����°벿��
		frm.add(bottomPanel,BorderLayout.CENTER);
		JLabel againshow=new JLabel();//������ʾ��ǩ��������ʾ��Ϣ
		againshow.setText("��ʾ���������������");
		JTextArea output=new JTextArea();//���������5��32�У����ɱ༭
		output.setRows(5);
		output.setColumns(32);
		output.setEditable(false);
		bottomPanel.add(againshow);//�����ʾ��ǩ�������
		bottomPanel.add(output);
		frm.setBounds(400,200,400,200);//���ô���λ�úʹ�С����ʾ
		frm.setVisible(true);
		
		
	}

}
