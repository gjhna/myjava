package ch08;
import javax.swing.*;
import java.awt.Color;

public class Ch_8_19_UseOptionPaneAndColorChooser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frm=new JFrame("ʹ�����ֱ�׼�Ի���");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		String str=JOptionPane.showInputDialog(frm,"��ã���������Ի��������룺","����Ի���",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frm, "��������ǣ�"+str,"��Ϣ�Ի���",JOptionPane.PLAIN_MESSAGE);
		int t=JOptionPane.showConfirmDialog(frm, "��ѡ���Ƿ��˳���ѡ����ɫ��","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
		Color c;
		if(t==JOptionPane.NO_OPTION)
			c=JColorChooser.showDialog(frm, "��ɫѡ��Ի���" ,Color.blue);
		else
			JOptionPane.showMessageDialog(frm,"δ��ʾ��ɫѡ���","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
		frm.setBounds(400, 200, 450, 300);
		frm.setVisible(true);
	}

}
