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
			System.out.println("出现被0除的异常情况");
		}catch(Exception e) {
			System.out.println("异常类型为"+e);
		}finally {
			System.out.println("除数="+a);
			System.out.println("被除数="+b);
		}
		a=110;
		b=10;
		try {
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
		}catch(ArithmeticException e) {
			System.out.println("出现被0除的异常情况");
		}catch(Exception e ){
			System.out.println("异常类型为"+e);
		}finally {
			System.out.println("除数="+a);
			System.out.println("被除数="+b);
		}

	}

}
