package ch09;
import java.io.*;

public class ch_9_6_InputInt {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream din=new DataInputStream(System.in);
		System.out.print("输入一个整数:");
		int x=din.readInt();
		System.out.println("输入的整数是："+x);
	}

}
