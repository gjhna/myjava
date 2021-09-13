package ch08;
import javax.swing.*;
public class ch_8_4_ScrollPaneWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame();//创建窗体，设置窗体标题和窗体关闭方式
		frm.setTitle("带滚动条的窗体");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea ta=new JTextArea();//创建一个5行32列的文本框，并设置默认内容
		ta.setRows(5);
		ta.setColumns(32);
		ta.setText("这是一个5行32列的文本框，\n\r请拉动窗体以及输入多行观察效果!");
		
		JButton btn=new JButton("按钮");//创建一个按钮
		
		JPanel p=new JPanel();//创建一个放置组件的面板，并添加文本框和按钮
		p.add(ta);
		p.add(btn);
		
		JScrollPane sp=new JScrollPane();//创建滚动面板，并设置上面创建的面板为组件
		sp.setViewportView(p);
		frm.setContentPane(sp);//将滚动面板设置为窗体的内容面板
		
		frm.setBounds(450,230 , 300, 150);
		frm.setVisible(true);
		
	}

}
