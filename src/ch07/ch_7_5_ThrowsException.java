package ch07;
import java.io.*;
public class ch_7_5_ThrowsException {
public static int calc(int x) {
			int z=0;
			z=100/x;
			return z;   //隐式异常，不需要throws子句声明，声明也可以
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try {
			a=calc(0);
			System.out.println("a="+a);
		}catch(ArithmeticException e) {
			System.out.println("调用方法calc时发生异常"+e.getMessage());
			e.printStackTrace();
			
		}
		
		
	}

}
