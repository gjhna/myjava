package ch07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ch_7_7_ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一行文本：");
		InputStreamReader isr=new InputStreamReader(System.in);//节点流
		BufferedReader inputReader=new BufferedReader(isr);//处理流
		try{
			String inputLine=inputReader.readLine();
			System.out.println("输入的文本是："+inputLine);
		}catch(IOException e) {
			System.out.println("发生异常："+e);
		}
		
	}

}
