package ch09;
import java.io.*;
public class Ch_9_8_RandomAccess {

	
		// TODO Auto-generated method stub
		final static int DoubleSize=8;
		void randomFileTest(String filename)throws IOException{
			RandomAccessFile rf=new RandomAccessFile(filename,"rw");
			for(int i=0;i<5;i++)
				rf.writeDouble(i*10.0);
			rf.seek(2*DoubleSize);
			rf.writeDouble(110.0001);
			rf.seek(0);
			for(int i=0;i<5;i++)
				System.out.println("Value"+i+":"+rf.readDouble());
			rf.close();
		}
		public static void main(String[] args) {
			BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
			String fileName=null;
			Ch_9_8_RandomAccess obj=null;
			try {
				System.out.print("输入一个文件名:");
				fileName=stdin.readLine();
				obj=new Ch_9_8_RandomAccess();
				obj.randomFileTest(fileName);
			}catch(IOException e) {
				System.out.println("文件找不到："+e);
				e.printStackTrace();
			}
	}
		

}
