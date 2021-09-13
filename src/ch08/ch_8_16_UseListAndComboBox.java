package ch08;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class ch_8_16_UseListAndComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("使用列表和组合框");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		//创建列表及设置属性
		String[]likes = {"高等数学","大学英语","大学物理","程序设计","人工智能","云计算"};
		JList list=new JList(likes);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setFixedCellHeight(20);
		list.setVisibleRowCount(5);
		JScrollPane scrollpane=new JScrollPane();
		scrollpane.setViewportView(list);
		scrollpane.setBounds(50, 30, 130, 110);
		frm.add(scrollpane);
		//创建组合框及设置属性
		JComboBox comboBox=new JComboBox(likes);//直接初始化了
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);//设置选项最大显示行数，默认为8行
		comboBox.insertItemAt("软件代码开发技术", 3);//向选项列表指定位置添加选项
		comboBox.setBounds(230, 30, 130, 25);
		frm.add(comboBox);
		
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
		}

}
