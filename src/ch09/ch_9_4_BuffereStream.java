package ch09;
import java.io.*;

public class ch_9_4_BuffereStream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);//���ֽ���תΪ������
		FileWriter fout=new FileWriter(".\\buffer.txt");
		BufferedWriter bout=new BufferedWriter(fout);//���ַ���ת��Ϊ������
		String str;
		while(true) {
			str=br.readLine();
			if(str.contentEquals("end"))
				break;
			bout.write(str);
			bout.newLine();
		}
		bout.close();
		FileReader fin=new FileReader(".\\buffer.txt");//�ڵ���
		BufferedReader bin=new BufferedReader(fin);//������
		while((str=bin.readLine())!=null)
			System.out.println(str);
		bin.close();
	}

}
