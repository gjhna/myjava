package ch08;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class ch_8_15_UseTextComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("ʹ���ı����");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);//����Ϊ��ʹ�ò��ֹ�����
		//�����ı�������λ�ô�СĬ�����ֵ�����
		JTextField text=new JTextField("�����ʲô�أ�");
		text.setBounds(10,10,200,25);
		frm.add(text);
		
		//�������������λ�ô�СĬ�����ֵ�����
		JPasswordField password=new JPasswordField("�ҵ�����");
		password.setBounds(10,35,200,25);
		frm.add(password);
		
		//�������������λ�ã���СĬ�����ֵ�����
		final JTextArea textarea=new JTextArea("��ϲ����̣�\n\r��ϲ��Java��");
		textarea.setBounds(10,65,200,75);
		textarea.setEditable(true);
		textarea.setColumns(80);
		textarea.append("\n\r���Ϊ"+textarea.getWidth()+"���ء�\n\r");
		frm.add(textarea); 
		textarea.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//���ǰ�治������������ʾΪ0
				textarea.append("����:"+textarea.getColumns()+"������"+textarea.getRows()+";");
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
		});
		frm.setBounds(450,200,230,180);
		frm.setVisible(true);
		
	}

}
