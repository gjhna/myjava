package ch06;
import java.io.*;
import javax.swing.*;
public class Ch_6_4_StudentScore {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int classCount=3;
		int[]studentCount= {2,3,5};
		double score[][]=new double[3][];
		boolean contiGo=true;
		for(int i=0;i<score.length;i++)
			score[i]=new double[studentCount[i]];
		String str;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<classCount;i++) {
			for(int k=0;k<studentCount[i];k++) {
				while(contiGo) {
					System.out.println("�������"+(i+1)+"�����"+(k+1)+"��ѧ���ĳɼ�:");
					str=buf.readLine();
					try {
						score[i][k]=Double.parseDouble(str);
						if(0>score[i][k]||100<score[i][k]) {
							JOptionPane.showMessageDialog(null, "�ɼ���Ӧ��<0�����������롣","��ʾ��Ϣ",JOptionPane.QUESTION_MESSAGE);
						}else
							break;
					}catch(Exception ne) {
						System.out.println(ne);
						JOptionPane.showMessageDialog(null,"����Ĳ������ݣ������Ϲ涨�����������롣","��ʾ��Ϣ",JOptionPane.QUESTION_MESSAGE);
					}
				}
			} 
		}
		double sumScore=0,avgScore=0;
		for(int i=0;i<score.length;i++) {
			sumScore=0;
			for(int k=0;k<studentCount[i];k++) {
				sumScore=sumScore+score[i][k];
			}
			avgScore=sumScore/studentCount[i];
			System.out.println("��"+(i+1)+"�����ƽ���ɼ�Ϊ"+avgScore);
		}
	}

}
