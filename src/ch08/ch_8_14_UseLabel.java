package ch08;
import javax.swing.*;
import java.awt.*;
public class ch_8_14_UseLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("��ʾ��ͼ��ı�ǩ");
		frm.setLayout(null);//����Ϊ��ʹ�ò��ֹ�����
		//������ǩ���������λ�ü���С����ʾ���壬����ͼƬ
		JLabel label=new JLabel("��ʾ22�Ŵ�����");
		label.setBounds(5,5,220,100);
		label.setFont(new Font("",Font.BOLD,22));
		label.setIcon(new ImageIcon("label.jpg"));
		//�������������
		label.setHorizontalAlignment(JLabel.LEFT);
		//���ñ�ǩ���ͼƬ��λ��
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		frm.add(label);
		frm.setBounds(450,200,230,130);
		frm.setVisible(true);
	}

}
