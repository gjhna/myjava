package ch09;
import java.io.*;
public class Ch_9_2_FileReaderWriterStream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw;
		fw=new FileWriter(".\\filestream.txt");
		char array[]= {'��','��','��','��','��','��','ʾ','��','��'};
		for(int i=0;i<array.length;i++)
			fw.write(array[i]);
		fw.close();
		FileReader fr;
		fr=new FileReader(".\\filestream.txt");
		int value;
		while((value=fr.read())!=-1)
			System.out.print((char)value);
		fr.close();
	}

}
