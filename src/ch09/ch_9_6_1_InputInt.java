package ch09;
import java.io.*;

public class ch_9_6_1_InputInt {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("����һ��������");
		String str=br.readLine();
		int x=Integer.parseInt(str);
		System.out.println("����������ǣ�"+x);
		//Ҫ�Ӽ��̶�ȡ���ݣ�ֻ���ȶ�ȡ�ַ�����Ȼ���ð�װ��ת��Ϊ��������������
	}

}
