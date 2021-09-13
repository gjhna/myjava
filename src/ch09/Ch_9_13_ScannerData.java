package ch09;
import java.util.Scanner;

public class Ch_9_13_ScannerData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner("123 3.1415 true abcdef");
		System.out.println(s.nextInt());
		System.out.println(s.nextFloat());
		System.out.println(s.nextBoolean());
		System.out.println(s.next());
	}

}
