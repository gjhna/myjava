package ch08;
import javax.swing.*;
import java.awt.event.*;

public class Ch_8_18_UseDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frm=new JFrame("ʹ����ͨ�Ի���");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		final JDialog dlg=new JDialog(frm,"��ͨ�Ի���");
		dlg.setBounds(470, 220, 200, 150);
		dlg.setLayout(null);
		dlg.setModal(true);
		
		JButton obtn=new JButton("�򿪶Ի���");
		obtn.setBounds(60, 60, 100, 30);
		obtn.addActionListener(new ActionListener(){
		@Override
			public void actionPerformed(ActionEvent e) {
				dlg.setVisible(true);
			}
		});
		frm.add(obtn);
	
	
	JButton btn=new JButton("�˳�");
	btn.setBounds(50,50,80,30);
	btn.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			dlg.setVisible(false);
		}
	});
	dlg.add(btn);
	frm.setBounds(450,200,250,200);
	frm.setVisible(true);
}
}