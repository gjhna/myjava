package ch07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch_7_7_ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ���ı���");
		InputStreamReader isr=new InputStreamReader(System.in);//�ڵ���
		BufferedReader inputReader=new BufferedReader(isr);//������
		try{
			String inputLine=inputReader.readLine();
			System.out.println("������ı��ǣ�"+inputLine);
		}catch(IOException e) {
			System.out.println("�����쳣��"+e);
		}
		
	}

}
