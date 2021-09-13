package ch08;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class Ch_8_20_UseFileChooser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frm=new JFrame("使用文件对话框");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		JFileChooser fc=new JFileChooser();
		TxtFileFilter myff=new TxtFileFilter(".txt");
		fc.setFileFilter(myff);
		fc.showOpenDialog(frm);
		System.out.println("选中的文件为："+fc.getSelectedFile().getName());
		frm.setBounds(400, 200, 450, 300);
		frm.setVisible(true);
	}

}
class TxtFileFilter extends FileFilter{
	String condition=" ";
	public TxtFileFilter(String condition) {
		this.condition=condition;
	}
	public boolean accept(File pathname) {
		String filename=pathname.getName();
		if(filename.lastIndexOf(condition)!=-1) {
			return true;
		}else
			return false;
	}
	public String getDescription() {
		return null;
	}
}