package ch08;
//import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class ch_8_11_UseActionEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("����¼�����");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		//������ť����
		JButton btn=new JButton("�뵥������ť");
		btn.setBounds(120,60,120,30);
		frm.add(btn);
		//������ť�ļ�������ע�ᣬ����Ϊ�¼��Ĵ����߶���
		ButtonHandler btnHandler=new ButtonHandler();
		btn.addActionListener(btnHandler);//�뵥���¼���ص���Ȩ������
		frm.setBounds(400,200,400,200);
		frm.setVisible(true);
	}

}
//��д��ť���¼������ţ���ʵ��ActionListner�ӿ�
class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("����һ�ΰ�ť");
	}
}
