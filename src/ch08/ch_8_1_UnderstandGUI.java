package ch08;
import java.awt.*;
import javax.swing.*;

public class ch_8_1_UnderstandGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame();//��������
		frm.setTitle("���GUI���");//���ñ���
		frm.setLayout(new BorderLayout());//���ò���
		JButton myBtn=new JButton("��ť");//������ť���
		frm.add(myBtn);//����ť���������ӵ�������
		//���¼�
		frm.setBounds(500,200,400,200);//���ô��ڳ�ʼλ�����С����ʾ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô��ڹرշ�ʽ
		frm.setVisible(true);//�ô�����ʾ
	}

}
 