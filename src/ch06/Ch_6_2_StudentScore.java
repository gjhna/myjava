package ch06;
import java.io.*;

public class Ch_6_2_StudentScore {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int k,count=5;
		double score[]=new double[count];
		boolean contiGo=true;
		String str;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		for(k=0;k<count;k++) {
			while(contiGo) {
				System.out.print("�������"+(k+1)+"��ѧ���ĳɼ���");
				str=buf.readLine();
				score[k]=Double.parseDouble(str);
				if(0>score[k]||100<score[k]) {
					System.out.println("�ɼ�Ӧ�ý���0��100֮�䣬���������롣");
				}
				else
					break;
			}
		}
		double[]scoreCopy=new double[count+1];
		double temp=0;
		System.arraycopy(score, 0, scoreCopy, 1, score.length);
		
		for(int m=1;m<=count-k;m++)
			if(scoreCopy[m]>scoreCopy[m+1]) {
				temp=scoreCopy[m];
				scoreCopy[m]=scoreCopy[m+1];
				scoreCopy[m+1]=temp;
			}
		System.out.println("��"+score.length+"��ͬѧ�ĳɼ����£�");
		for(int j=0;j<score.length;j++) {
			System.out.print(score[j]+"\t");
		}
		System.out.println("\n��"+score.length+"��ͬѧ�ĳɼ��ӵ͵����������£�");
		for(int j=1;j<scoreCopy.length;j++) {
			System.out.print(scoreCopy[j]+"\t");
		}
	}

}
