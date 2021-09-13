package ch04;

import java.util.Scanner;

public class ch_4_2_testIFEles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩");
		int score=sc.nextInt();
		if(score>=0&&score<=100) {
			System.out.println("成绩："+score);
		}
		else {
			System.out.println("输入的成绩应在0-100之间！");
		}
		sc.close();
	}

}
