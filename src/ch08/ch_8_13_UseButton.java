package ch08;
import javax.swing.*;
public class ch_8_13_UseButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("ʹ��4�ְ�ť");
		frm.setLayout(null);
		//������ͨ��ť������ λ�����С
		JButton btn=new JButton("��ͨ��ť");
		btn.setBounds(50,20,120,25);
		frm.add(btn);
		//�����л���ť������λ�����С
		JToggleButton tbtn=new JToggleButton("�л���ť");
		tbtn.setBounds(210,20,120,25);
		frm.add(tbtn);
		//�������ѱ�ǩ������λ�úʹ�С
		JLabel slabel=new JLabel("��      ��:");
		slabel.setBounds(50,60,120,25);
		frm.add(slabel);
		//������ѡ��ť�������
		ButtonGroup btnGroup=new ButtonGroup();
		
		//����������ѡ��ť��������λ�ô�С�����е�һ����ѡ��
		JRadioButton manRadioButton=new JRadioButton("����");
		manRadioButton.setBounds(110,60,80,25);
		manRadioButton.setSelected(true);
		JRadioButton womanRadioButton=new JRadioButton("Ů��");
		womanRadioButton.setBounds(210,60,80,25);
		//��ӵ�ѡ��ť������������Լ�������
		btnGroup.add(manRadioButton);
		btnGroup.add(womanRadioButton);
		frm.add(manRadioButton);
		frm.add(womanRadioButton);
		//�������ѱ�ǩ������λ�����С
		JLabel clabel=new JLabel("��Ŀ��");
		clabel.setBounds(50,90,120,25);
		frm.add(clabel);
		//����4����ѡ��ť��������λ�úʹ�С�����е�һ�����ĸ���ѡ��
		JCheckBox mCheckBox=new JCheckBox("�ߵ���ѧ");
		mCheckBox.setBounds(110,90,80,25);
		mCheckBox.setSelected(true);
		frm.add(mCheckBox);
		JCheckBox eCheckBox=new JCheckBox("��ѧӢ��");
		eCheckBox.setBounds(210,90,80,25);
		frm.add(eCheckBox);
		JCheckBox pCheckBox=new JCheckBox("��ѧ����");
		pCheckBox.setBounds(110,120,80,25);
		frm.add(pCheckBox);
		JCheckBox dCheckBox=new JCheckBox("�������");
		dCheckBox.setBounds(210,120,80,25);
		dCheckBox.setSelected(true);
		frm.add(dCheckBox);
		
		
		frm.setBounds(450,230,400,200);
		frm.setVisible(true);
		
	}

}
