package ch08;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch_8_8_UseFlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("使用顺序布局管理器");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建顺序管理器并设置
		FlowLayout flowlayout=new FlowLayout();
		frm.setLayout(flowlayout);
		//创建四个组件并添加到窗体中
		JLabel label1=new JLabel("组件1");
		JLabel label2=new JLabel("组件2");
		JLabel label3=new JLabel("组件3");
		JLabel label4=new JLabel("组件4");
		frm.add(label1);
		frm.add(label2);
		frm.add(label3);
		frm.add(label4);
		
		frm.setBounds(450,230,150,100);
		frm.setVisible(true);
		
	}

}
