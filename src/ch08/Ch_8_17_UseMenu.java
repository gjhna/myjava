package ch08;
import javax.swing.*;
import java.awt.event.*;
public class Ch_8_17_UseMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frm=new JFrame("ʹ�ò˵�");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		final JLabel lb1=new JLabel("��ʾ�˵�����");
		lb1.setBounds(150,100,300,30);
		frm.add(lb1);
		
		JMenuBar mbar=new JMenuBar();
		frm.setJMenuBar(null);
		
		JMenu m1=new JMenu("�û�����");
		JMenu m2=new JMenu("�ɼ�����");
		JMenu m3=new JMenu("ϵͳ״̬");
		mbar.add(m1);
		mbar.add(m2);
		mbar.add(m3);
		
		JMenuItem mi11=new JMenuItem("������Ϣ����");
		JMenuItem mil2=new JMenuItem("�޸�����");
		JMenuItem mil3=new JMenuItem("ϵͳ�˳�");
		m1.add(mi11);
		m1.add(mil2);
		m1.add("ϵͳ�˳�");
		
		final JMenuItem mi13=m1.getItem(2);
		mil3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setText(mil3.getText());
				mil3.setText("�˳�");
			}
		});

			JMenuItem mi21=new JMenuItem("ѧ��������Ϣ¼��");
			JMenuItem mi22=new JMenuItem("�ɼ�¼��");
			JMenuItem mi23=new JMenuItem("�ɼ���ѯ");
			mi23.setEnabled(false);
			m2.add(mi21);
			m2.add(mi22);
			m2.add(mi23);
			
			ButtonGroup btnGroup=new ButtonGroup();
			JRadioButtonMenuItem mi31=new JRadioButtonMenuItem("��ʾ����");
			JRadioButtonMenuItem mi32=new JRadioButtonMenuItem("��ʾ¼�����");
			btnGroup.add(mi31);
			btnGroup.add(mi32);
			mi32.setSelected(true);
			JCheckBoxMenuItem mi33=new JCheckBoxMenuItem("��ʾ״̬��");
			final JCheckBoxMenuItem mi34=new JCheckBoxMenuItem("��ʾ��¼��Ϣ");
			mi33.setSelected(true);
			m3.add(mi31);
			m3.add(mi32);
			m3.addSeparator();
			m3.add(mi33);
			m3.add(mi34);
			//m3.add(m1);
			
			final JPopupMenu pm=new JPopupMenu("��ͼ");
			pm.add("����");
			pm.add("����");
			//pm.add(m2);
			
			mi34.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lb1.setText(mi34.getText());
				}
			});
			
			frm.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int mods=e.getModifiers();
					if((mods&InputEvent.BUTTON3_MASK)!=0)
						pm.show(frm,e.getX(),e.getY());
				}
			});
			frm.setBounds(400, 200, 450, 200);
			frm.setVisible(true);
			
				
		
	}

}

