package ch09;
import java.util.Scanner;
public class Ch_9_12_ScannerDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner("abcd efghijkl..mnop,qrst uvwxyz");
		s.useDelimiter(" |,|\\.");
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
