package ch09;
import java.io.*;

public class ch_9_6_InputInt {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream din=new DataInputStream(System.in);
		System.out.print("����һ������:");
		int x=din.readInt();
		System.out.println("����������ǣ�"+x);
	}

}
