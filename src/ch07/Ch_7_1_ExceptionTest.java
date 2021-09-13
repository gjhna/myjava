package ch07;
import java.io.*;

public class Ch_7_1_ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String str[]= {"One","Two","Three"};
		while(i<=3) {
			System.out.println(str[i]);
			i++;
		}
		System.out.println("程序正常结束");
	}

}