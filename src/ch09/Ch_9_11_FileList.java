package ch09;
import java.io.File;
public class Ch_9_11_FileList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File files=new File(".\\");
		File newDir=new File("c:\\sub1\\sub2");
		newDir.mkdirs();
		System.out.println("��ǰĿ¼�ľ���·���ǣ�"+files.getAbsolutePath());
		fileList(files,1);
	}
public static void fileList(File file,int level) {
	String preStr=" ";
	int dcount=0,fcount=0,tsize=0;
	for(int i=0;i<level;i++) 
		preStr+="\t";
		File[]childs=file.listFiles();
		for(int i=0;i<childs.length;i++) {
			if(childs[i].isDirectory()) {
				System.out.println(preStr+"["+childs[i].getName()+"]");
				dcount++;
			}else {
				System.out.println(preStr+childs[i].getName());
				fcount++;
				tsize+=childs[i].length();
			}
			if(childs[i].isDirectory())
				fileList(childs[i],level+1);
		}
		if(file.isDirectory())
			System.out.println(preStr+"��["+file.getName()+"]Ŀ¼����"+dcount+"��Ŀ¼��"+fcount+"���ļ�����"+tsize+"�ֽ�");
	}
}

