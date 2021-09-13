package ch08;
import java.awt.*;
import javax.swing.*;

public class ch_8_1_UnderstandGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame();//创建容器
		frm.setTitle("理解GUI编程");//设置标题
		frm.setLayout(new BorderLayout());//设置布局
		JButton myBtn=new JButton("按钮");//创建按钮组件
		frm.add(myBtn);//将按钮组件对象添加到容器中
		//无事件
		frm.setBounds(500,200,400,200);//设置窗口初始位置与大小并显示
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭方式
		frm.setVisible(true);//让窗体显示
	}

}
 