package ch07;
import java.io.*;

public class ch_7_6_ThrowsException {
public static int calc(int x)throws Exception{//�����ڷ�����ʹ����throw�����Է���ͷ�б�����������������
			int z=0;
			if(x==0)
				throw new Exception("����Ϊ�㣡");//��ʽ�׳��쳣
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
			System.out.println("���÷���calcʱ�����쳣��"+e.getMessage());
			e.printStackTrace();
		}
	}

}
