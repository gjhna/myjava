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
			System.out.print("输入序号（输入end结束）：");
			try {
				index=inputReader.readLine();
				if(index.contentEquals("end"))
					break;
				position=Integer.parseInt(index);
				System.out.println("元素值为："+arr[position]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("数组下标越界！");
			}catch(NumberFormatException e) {
				System.out.println("请输入一个整数！");
			}catch(IOException e) {
				
			}
			System.out.println("程序运行结束.");
			
		}
		
	}
}
