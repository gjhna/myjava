package ch08;
import java.awt.*;
import javax.swing.*;
public class ch_8_2_UsePanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("使用JPanel");//创建窗体并设置窗口标题
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式
		JPanel topPanel=new JPanel();//创建面板并放在窗体上半部分
		frm.add(topPanel,BorderLayout.NORTH);
		JLabel show=new JLabel();//创建提示标签并设置显示信息
		show.setText("请输入姓名：");
		JTextField input=new JTextField();//创建输入框，设置为可编辑，左侧输入，20列
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(20);
		JButton myBtn=new JButton("提交");//创建提交按钮
		topPanel.add(show);//添加显示标签，输入框和按钮
		topPanel.add(input);
		topPanel.add(myBtn);
		
		
		JPanel bottomPanel=new JPanel();//创建面板并放在窗体下半部分
		frm.add(bottomPanel,BorderLayout.CENTER);
		JLabel againshow=new JLabel();//创建提示标签并设置显示信息
		againshow.setText("显示所有输入的姓名：");
		JTextArea output=new JTextArea();//创建输出框，5行32列，不可编辑
		output.setRows(5);
		output.setColumns(32);
		output.setEditable(false);
		bottomPanel.add(againshow);//添加提示标签和输出框
		bottomPanel.add(output);
		frm.setBounds(400,200,400,200);//设置窗体位置和大小并显示
		frm.setVisible(true);
		
		
	}

}
