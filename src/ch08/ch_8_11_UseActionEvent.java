package ch08;
//import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class ch_8_11_UseActionEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("理解事件处理");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		//创建按钮对象
		JButton btn=new JButton("请单击本按钮");
		btn.setBounds(120,60,120,30);
		frm.add(btn);
		//创建按钮的监听器并注册，参数为事件的处理者对象
		ButtonHandler btnHandler=new ButtonHandler();
		btn.addActionListener(btnHandler);//与单击事件相关的授权处理方法
		frm.setBounds(400,200,400,200);
		frm.setVisible(true);
	}

}
//编写按钮的事件处理着，即实现ActionListner接口
class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("单击一次按钮");
	}
}
