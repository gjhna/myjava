package ch08;
import javax.swing.*;

import java.awt.event.*;

public class ch_8_12_UseMouseEvent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("���������¼�����");
		frm.setLayout(null);
		JLabel label1=new JLabel("���ڴ������ƶ����");
		label1.setBounds(15,5,200,25);
		frm.add(label1);
		JLabel label2=new JLabel("��ס�������϶���꣡");
		label2.setBounds(15,30,200,25);
		frm.add(label2);
		
		//�����ı������
		JTextField text=new JTextField(30);
		text.setBounds(15,55,200,30);
		frm.getContentPane().add(text);
		
		//ע�������������Ϊ�¼������Ŷ���
		MouseListenerImp1 mouse=new MouseListenerImp1(text);
		frm.addMouseListener(mouse);
		frm.addMouseMotionListener(mouse);
		frm.addWindowListener(mouse);
		
		frm.setBounds(500,250,250,150);
		frm.setVisible(true);
	}

}
class MouseListenerImp1 extends WindowAdapter implements MouseMotionListener,MouseListener{//ͨ���̳��¼��������࣬��ʵ�����µ������ӿ�
	JTextField text;
	public MouseListenerImp1(JTextField text) {
		this.text=text;
	}
	public void mouseDragged(MouseEvent e){
		String s="��ҷ��꣬���꣺X="+e.getX()+",Y="+e.getY();
		text.setText(s);
	}
	public void mouseEntered(MouseEvent e) {
		String s="�������˴���";
		text.setText(s);
	}
	public void mouseExited(MouseEvent e) {
		String s="����뿪��";
		text.setText(s);
	}
	public void windowClosing(WindowEvent e) {
		//Ϊ��ʹ�����������رգ����������˳�
		System.exit(1);
	}
	//������ʵ���¹��ܵ��㷨���÷�����Ϊ�ռ��ɣ�������û����Щ�շ���
		public void mouseMoved(MouseEvent e) {
			
		}
		public void mouseClicked(MouseEvent e) {
			
		}
		public void mousePressed(MouseEvent e) {
			
		}
		public void mouseReleased(MouseEvent e) {
			
		}
			//δ�г��������¼���صĿշ���
			
}
