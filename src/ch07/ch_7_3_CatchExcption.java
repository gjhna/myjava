package ch07;
import java.io.*;

public class ch_7_3_CatchExcption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=110;
		b=0;
		try {
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
		}catch(ArithmeticException e) {
			System.out.println("���ֱ�0�����쳣���");
		}catch(Exception e) {
			System.out.println("�쳣����Ϊ"+e);
		}finally {
			System.out.println("����="+a);
			System.out.println("������="+b);
		}
		a=110;
		b=10;
		try {
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
		}catch(ArithmeticException e) {
			System.out.println("���ֱ�0�����쳣���");
		}catch(Exception e ){
			System.out.println("�쳣����Ϊ"+e);
		}finally {
			System.out.println("����="+a);
			System.out.println("������="+b);
		}

	}

}
