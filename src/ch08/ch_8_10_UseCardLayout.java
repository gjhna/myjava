package ch08;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch_8_10_UseCardLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("ʹ�ÿ�Ƭ���ֹ�����");
		CardLayout cardlayout=new CardLayout();//������Ƭ���ֹ�����
		frm.setLayout(cardlayout);
		
		JLabel label1=new JLabel("Ӣ��");
		JLabel label2=new JLabel("��ѧ");
		JLabel label3=new JLabel("����");
		JLabel label4=new JLabel("��ʷ");
		JLabel label5=new JLabel("����");
		frm.add(label1,"�γ�1");
		frm.add(label2,"�γ�2");
		frm.add(label3,"�γ�3");
		frm.add(label4,"�γ�4");
		frm.add(label5,"�γ�5");
		
		cardlayout.show(frm.getContentPane(),"�γ�4");
		
		
		frm.setBounds(450, 230, 200, 100);
		frm.setVisible(true);
		
	}

}
