package ch09;

import java.io.*;
public class ch_9_1_FileInputOuputStream {

	public static void main(String[] args)throws IOException {//��������쳣���д���
		// TODO Auto-generated method stub
		FileOutputStream fos;
		fos=new FileOutputStream(".\\filestream.dat");//���ļ������
		byte[]array= {1,3,5,7,9,11,13,15,17,19};
		for(int i=0;i<array.length;i++)
			fos.write(array[i]);//д���ݵ������,д���ļ�
		fos.close();//�ر��ļ���������ر��ļ�
		FileInputStream fis;
		fis=new FileInputStream(".\\filestreamtext.dat");//���ļ�������
		int value;
		while((value=fis.read())!=-1)//�����ļ�
			System.out.print(value+" ");
		fis.close();//�ر��ļ����������ر��ļ�
		
			
	}

}
