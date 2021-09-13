package ch08;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class Ch_8_21_StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
class MainWindow extends JFrame{
	static JLabel submit;
	MainWindow(){
		setTitle("学生成绩录入系统");
		setBounds(400,200,200,120);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLayout(null);
		createMenu();
		submit=new JLabel();
		submit.setBounds(5,5,400,20);
		add(submit);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitSystem();
			}
		});
	}
	void exitSystem() {
		int ret=JOptionPane.showConfirmDialog(this,"退出系统吗？","退出系统吗？",JOptionPane.YES_NO_OPTION);
		
		System.exit(0);
		
	}
	void createMenu() {
		JMenuBar mbar=new JMenuBar();
		setJMenuBar(mbar);
		JMenu m1=new JMenu("系统管理");
		JMenu m2=new JMenu("成绩管理");
		mbar.add(m1);
		mbar.add(m2);
		JMenuItem mil1=new JMenuItem("基本信息管理");
		JMenuItem mil2=new JMenuItem("修改密码");
		JMenuItem mil3=new JMenuItem("退出系统");
		mil1.setEnabled(false);
		mil2.setEnabled(false);
		m1.add(mil1);
		m1.add(mil2);
		m1.add(mil3);
		mil3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitSystem();
			}
		});
		JMenuItem mi21=new JMenuItem("成绩录入");
		JMenuItem mi22=new JMenuItem("成绩查询");
		mi22.setEnabled(false);
		m2.add(mi21);
		m2.add(mi22);
		mi21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inputScores();
			}
		});
		}
	void inputScores() {
		InputScoreDialog isd=new InputScoreDialog();
		isd.setVisible(true);
	}
	static void setSubmit(String str) {
		submit.setText(str);
	}
	
}
class InputScoreDialog extends JDialog{
	JComboBox name;
	JTextField maths;
	JComboBox englishs;
	InputScoreDialog(){
		setTitle("成绩录入");
		setBounds(500,250,240,180);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setLayout(null);
		setModal(true);
		createGUIElements();
		
	}
	void createGUIElements() {
		JLabel namelb1=new JLabel("姓名：");
		namelb1.setBounds(10,20,60,25);
		add(namelb1);
		JLabel mathsib1=new JLabel("数学：");
		add(mathsib1);
		JLabel englishlb1=new JLabel("英语：");
		englishlb1.setBounds(10,80,80,25);
		add(englishlb1);
		name=new JComboBox();
		name.setBounds(100, 20, 120, 25);
		name.addItem("孙文轩");
		name.addItem("孙文迪");
		add(name);
		maths=new JTextField();
		maths.setBounds(100,50,120,25);
		maths.setText("100");
		add(maths);
		String[]ranks= {"优秀","良好","中等","及格","不及格"};
		
		JButton submitBtn=new JButton("提交");
		submitBtn.setBounds(20, 120, 80, 25);
		add(submitBtn);
		JButton cancleBtn=new JButton("放弃");
		cancleBtn.setBounds(130, 120, 80, 25);
		add(cancleBtn);
		for(int i=0;i<this.getContentPane().getComponentCount();i++) {
			Component comp=this.getContentPane().getComponent(i);
			comp.setFont(new Font("宋体",Font.BOLD,20));
			
		}
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="姓名："+name.getSelectedItem().toString()+"数学："+maths.getText();
				MainWindow.setSubmit(str);
			}
		});
		cancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
}