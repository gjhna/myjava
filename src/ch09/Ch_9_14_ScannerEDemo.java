package ch09;
import java.util.Scanner;

public class Ch_9_14_ScannerEDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		double sum=0.0,average,x;
		Scanner scan=new Scanner(System.in);
		x=scan.nextDouble();
		while(Math.abs(x)>1e-5) {
			sum+=x;
			count++;
			x=scan.nextDouble();
		}
		average=sum/count;
		System.out.println("ƽ��ֵ="+average);
	}

}
