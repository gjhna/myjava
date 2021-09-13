package ch09;

import java.io.*;
public class ch_9_1_FileInputOuputStream {

	public static void main(String[] args)throws IOException {//如果出现异常进行处理
		// TODO Auto-generated method stub
		FileOutputStream fos;
		fos=new FileOutputStream(".\\filestream.dat");//打开文件输出流
		byte[]array= {1,3,5,7,9,11,13,15,17,19};
		for(int i=0;i<array.length;i++)
			fos.write(array[i]);//写数据到输出流,写入文件
		fos.close();//关闭文件输出流，关闭文件
		FileInputStream fis;
		fis=new FileInputStream(".\\filestreamtext.dat");//打开文件输入流
		int value;
		while((value=fis.read())!=-1)//读入文件
			System.out.print(value+" ");
		fis.close();//关闭文件输入流，关闭文件
		
			
	}

}
