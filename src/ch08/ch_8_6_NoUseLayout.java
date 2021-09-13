package ch08;
import javax.swing.*;

public class ch_8_6_NoUseLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm=new JFrame("未使用布局管理");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		//创建用户标签并设置显示信息及起始位置和大小
		JLabel userLabel=new JLabel();
		userLabel.setText("用户名：");
		userLabel.setBounds(40, 20, 80, 30);
		//创建用户名输入框，可编辑，左侧输入，20列，并设置起始位置与大小
		JTextField userText=new JTextField();
		userText.setEditable(true);
		userText.setHorizontalAlignment(SwingConstants.LEFT);
		userText.setColumns(20);
		userText.setBounds(100, 20, 120, 30);
		//创建登录按钮，并设置起始位置和大小
		JButton loginBtn=new JButton("登录");
		loginBtn.setBounds(130,60,60,30);
		//将标签，输入框，、和按钮添加到窗体的容器中
		frm.add(userLabel);
		frm.add(userText);
		frm.add(loginBtn);
		
		frm.setBounds(400, 200, 300, 160);
		frm.setVisible(true);
	}

}
