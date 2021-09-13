package ch08;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch_8_10_UseCardLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("使用卡片布局管理器");
		CardLayout cardlayout=new CardLayout();//创建卡片布局管理器
		frm.setLayout(cardlayout);
		
		JLabel label1=new JLabel("英语");
		JLabel label2=new JLabel("数学");
		JLabel label3=new JLabel("地理");
		JLabel label4=new JLabel("历史");
		JLabel label5=new JLabel("音乐");
		frm.add(label1,"课程1");
		frm.add(label2,"课程2");
		frm.add(label3,"课程3");
		frm.add(label4,"课程4");
		frm.add(label5,"课程5");
		
		cardlayout.show(frm.getContentPane(),"课程4");
		
		
		frm.setBounds(450, 230, 200, 100);
		frm.setVisible(true);
		
	}

}
