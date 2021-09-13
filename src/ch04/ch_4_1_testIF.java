package ch04;

import java.util.Scanner;

public class ch_4_1_testIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨£º");
		int score=sc.nextInt();
		
		if(score>=0&&score<=100) {
			System.out.println("³É¼¨£º"+score);
		}
		sc.close();
	}

}
