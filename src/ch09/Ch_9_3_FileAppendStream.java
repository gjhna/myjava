package ch09;
import java.io.*;

public class Ch_9_3_FileAppendStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String str="Welcome to Java!";
		FileWriter fw;
		fw=new FileWriter(".\\filestream.txt",true);
		fw.write(str);
		fw.close();
		FileReader fr;
		fr=new FileReader(".\\filestream.txt");
		int value;
		while((value=fr.read())!=-1)
			System.out.print((char)value);
		fr.close();
	}

}
