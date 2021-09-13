package ch07;
import java.io.*;

public class ch_7_6_ThrowsException {
public static int calc(int x)throws Exception{//由于在方法中使用了throw，所以方法头中必须增加这个语句声明
			int z=0;
			if(x==0)
				throw new Exception("除数为零！");//显式抛出异常
			z=110/x;
			return z;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try {
			a=calc(0);
			System.out.println("a="+a);
		}catch(Exception e) {
			System.out.println("调用方法calc时发生异常："+e.getMessage());
			e.printStackTrace();
		}
	}

}
