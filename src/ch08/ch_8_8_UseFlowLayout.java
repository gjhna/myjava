package ch08;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch_8_8_UseFlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("ʹ��˳�򲼾ֹ�����");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����˳�������������
		FlowLayout flowlayout=new FlowLayout();
		frm.setLayout(flowlayout);
		//�����ĸ��������ӵ�������
		JLabel label1=new JLabel("���1");
		JLabel label2=new JLabel("���2");
		JLabel label3=new JLabel("���3");
		JLabel label4=new JLabel("���4");
		frm.add(label1);
		frm.add(label2);
		frm.add(label3);
		frm.add(label4);
		
		frm.setBounds(450,230,150,100);
		frm.setVisible(true);
		
	}

}
