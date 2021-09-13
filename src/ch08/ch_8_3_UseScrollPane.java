package ch08;
import java.awt.BorderLayout;
import javax.swing.*;

public class ch_8_3_UseScrollPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame();//创建窗体，设置窗体标题和关闭方式
		frm.setTitle("使用JScrollPane");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建三个输出框，均为2行32列，并设置默认内容
		JTextArea toutput=new JTextArea();
		toutput.setRows(2);
		toutput.setColumns(32);
		toutput.setText("这是JScrollPane使用示例！\n\r请在一行输入较多字符观察显示区的变化！");
		
		JTextArea coutput=new JTextArea();
		coutput.setRows(2);
		coutput.setColumns(32);
		coutput.setText("这是JScrollPane使用示例！\\n\\r请输入多行字符和一行许多字符观察显示区的变化！");
		
		JTextArea boutput=new JTextArea();
		boutput.setRows(2);
		boutput.setColumns(32);
		boutput.setText("这是JScrollPane使用示例！\\n\\r请输入多行字符观察显示区的变化！");
		
		JScrollPane toutputScrollPane=new JScrollPane();//创建三个滚动面板
		JScrollPane coutputScrollPane=new JScrollPane();
		JScrollPane boutputScrollPane=new JScrollPane();
		
		toutputScrollPane.setViewportView(toutput);//为每个滚动面板添加各自的组件
		coutputScrollPane.setViewportView(coutput);
		boutputScrollPane.setViewportView(boutput);
		
		toutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//为每个滚动面板设置水平和垂直显示策略
		toutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		coutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		coutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		boutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		boutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		
		frm.add(toutputScrollPane,BorderLayout.NORTH);//在窗体中添加三个滚动面板
		frm.add(coutputScrollPane,BorderLayout.CENTER);
		frm.add(boutputScrollPane,BorderLayout.SOUTH);
		
		frm.setBounds(450,230,400,180);//设置窗体的位置与大小并显示
		frm.setVisible(true);
	}

}
