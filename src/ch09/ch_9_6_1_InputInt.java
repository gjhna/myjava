package ch09;
import java.io.*;

public class ch_9_6_1_InputInt {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("输入一个整数：");
		String str=br.readLine();
		int x=Integer.parseInt(str);
		System.out.println("输入的整数是："+x);
		//要从键盘读取数据，只能先读取字符串，然后用包装类转化为整数或其他类型
	}

}
