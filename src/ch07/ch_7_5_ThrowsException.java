package ch07;
import java.io.*;
public class ch_7_5_ThrowsException {
public static int calc(int x) {
			int z=0;
			z=100/x;
			return z;   //��ʽ�쳣������Ҫthrows�Ӿ�����������Ҳ����
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try {
			a=calc(0);
			System.out.println("a="+a);
		}catch(ArithmeticException e) {
			System.out.println("���÷���calcʱ�����쳣"+e.getMessage());
			e.printStackTrace();
			
		}
		
		
	}

}
