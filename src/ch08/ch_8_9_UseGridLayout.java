package ch08;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch_8_9_UseGridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("ʹ�����񲼾ֹ�����");
		
		//������һ��2��2�е����񲼾ֹ�������������
		GridLayout gridlayout=new GridLayout(2,2);
		frm.setLayout(gridlayout);//������ʹ���˲��ֹ���֣�Ȼ��ʼ��Ӹ������
		//����5���������ӵ�������
		JLabel label1=new JLabel("Ӣ��");
		JLabel label2=new JLabel("��ѧ");
		JLabel label3=new JLabel("����");
		JLabel label4=new JLabel("��ʷ");
		JLabel label5=new JLabel("����");
		frm.add(label1,"�γ�1");
		frm.add(label2);
		frm.add(label3);
		frm.add(label4);
		frm.add(label5);
		frm.setBounds(450, 230, 400, 100);
		frm.setVisible(true);
	}

}
