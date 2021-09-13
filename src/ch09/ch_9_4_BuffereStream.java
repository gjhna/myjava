package ch09;
import java.io.*;

public class ch_9_4_BuffereStream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);//把字节流转为缓冲流
		FileWriter fout=new FileWriter(".\\buffer.txt");
		BufferedWriter bout=new BufferedWriter(fout);//把字符流转化为缓冲流
		String str;
		while(true) {
			str=br.readLine();
			if(str.contentEquals("end"))
				break;
			bout.write(str);
			bout.newLine();
		}
		bout.close();
		FileReader fin=new FileReader(".\\buffer.txt");//节点流
		BufferedReader bin=new BufferedReader(fin);//缓冲流
		while((str=bin.readLine())!=null)
			System.out.println(str);
		bin.close();
	}

}
