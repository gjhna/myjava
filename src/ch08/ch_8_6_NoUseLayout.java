package ch08;
import javax.swing.*;

public class ch_8_6_NoUseLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("δʹ�ò��ֹ���");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		//�����û���ǩ��������ʾ��Ϣ����ʼλ�úʹ�С
		JLabel userLabel=new JLabel();
		userLabel.setText("�û�����");
		userLabel.setBounds(40, 20, 80, 30);
		//�����û�������򣬿ɱ༭��������룬20�У���������ʼλ�����С
		JTextField userText=new JTextField();
		userText.setEditable(true);
		userText.setHorizontalAlignment(SwingConstants.LEFT);
		userText.setColumns(20);
		userText.setBounds(100, 20, 120, 30);
		//������¼��ť����������ʼλ�úʹ�С
		JButton loginBtn=new JButton("��¼");
		loginBtn.setBounds(130,60,60,30);
		//����ǩ������򣬡��Ͱ�ť��ӵ������������
		frm.add(userLabel);
		frm.add(userText);
		frm.add(loginBtn);
		
		frm.setBounds(400, 200, 300, 160);
		frm.setVisible(true);
	}

}
