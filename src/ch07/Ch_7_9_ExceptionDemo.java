package ch07;
import java.io.*;

public class Ch_7_9_ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,200,300,400,500,600};
		String index;
		int position;
		BufferedReader inputReader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("������ţ�����end��������");
			try {
				index=inputReader.readLine();
				if(index.contentEquals("end"))
					break;
				position=Integer.parseInt(index);
				System.out.println("Ԫ��ֵΪ��"+arr[position]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�����±�Խ�磡");
			}catch(NumberFormatException e) {
				System.out.println("������һ��������");
			}catch(IOException e) {
				
			}
			System.out.println("�������н���.");
			
		}
		
	}
}
