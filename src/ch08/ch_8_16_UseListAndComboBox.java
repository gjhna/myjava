package ch08;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class ch_8_16_UseListAndComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("ʹ���б����Ͽ�");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		//�����б���������
		String[]likes = {"�ߵ���ѧ","��ѧӢ��","��ѧ����","�������","�˹�����","�Ƽ���"};
		JList list=new JList(likes);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setFixedCellHeight(20);
		list.setVisibleRowCount(5);
		JScrollPane scrollpane=new JScrollPane();
		scrollpane.setViewportView(list);
		scrollpane.setBounds(50, 30, 130, 110);
		frm.add(scrollpane);
		//������Ͽ���������
		JComboBox comboBox=new JComboBox(likes);//ֱ�ӳ�ʼ����
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);//����ѡ�������ʾ������Ĭ��Ϊ8��
		comboBox.insertItemAt("������뿪������", 3);//��ѡ���б�ָ��λ�����ѡ��
		comboBox.setBounds(230, 30, 130, 25);
		frm.add(comboBox);
		
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
		}

}
