package ch04;

import java.util.Scanner;

public class ch_4_3_testIfElseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ�:");
		int score=sc.nextInt();
		
		char grade;
		if(score>=90) {
			grade='A';
		}
		else if(score>=80) {
			grade='B';
		}
		else if(score>=70) {
			grade='C';
		}
		else if(score>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("�ɼ��ĵȼ���:"+grade);
		sc.close();
	}

}