package ch06;

import java.io.*;

public class ch_6_1_StudentScore {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int k,count=10;
		double[]score=new double[count];
		double doubleSum=0.0,doubleAver=0.0,maxScore=0.0;
		boolean contiGo=true;
		String str;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		for(k=0;k<count;k++) {
			while(contiGo) {
				System.out.print("�������"+(k+1)+"��ѧ���ĳɼ���");
				str=buf.readLine();
				score[k]=Double.parseDouble(str);
				if(0>score[k]||100<score[k])
					System.out.println("�ɼ�Ӧ�ý���0��100֮�䣬���������롣");
				else
					break;
				
			}
			doubleSum+=score[k];
			if(score[k]>maxScore)
				maxScore=score[k];
		}
		doubleAver=doubleSum/count;
		System.out.println("��"+count+"��ͬѧ��ƽ���ɼ��ǣ�"+doubleAver);
		System.out.println("��"+count+"��ͬѧ����óɼ��ǣ�"+maxScore);
	}

}
