package ch07;
import java.io.*;
public class ch_7_4_ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=200;
		try {
			if(age<0||age>120)
				throw new Exception("�������ݳ�����Χ");//��Ϊ�׳��쳣��ExceptionΪThromable����
			System.out.println("age="+age);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
