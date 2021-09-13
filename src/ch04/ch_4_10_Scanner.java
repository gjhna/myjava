package ch04;

import java.util.Scanner;

public class ch_4_10_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个正整数:");
		int n=sc.nextInt();
		boolean flag=true;
			for(int i=2;i<n;i++) {
				if(n%2==0) {
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("是素数");
			else
				System.out.println("不是素数");
	}

}
