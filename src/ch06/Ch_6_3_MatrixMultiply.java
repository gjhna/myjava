package ch06;
import java.io.*;

public class Ch_6_3_MatrixMultiply {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int j,k,m,aH=2,aL=3,bL=4,a[][],b[][],c[][];
		a=new int[aH][aL];
		b=new int[aL][bL];
		c=new int[aH][bL];
		for(j=0;j<aH;j++)
			for(k=0;k<aL;k++) {
				a[j][k]=(int)(Math.random()*10);
			}
		for(j=0;j<aL;j++)
			for(k=0;k<bL;k++) {
				b[j][k]=(int)(Math.random()*10);		
			}
		System.out.println("a����Ԫ�����£�");
		for(j=0;j<aH;j++) {
			for(k=0;k<aL;k++)
				System.out.print(a[j][k]+"\t");
			System.out.println();
		}
		System.out.println("b����Ԫ�����£�");
		for(j=0;j<aL;j++) {
			for(k=0;k<bL;k++)
				System.out.print(b[j][k]+"\t");
			System.out.println();
		}
		System.out.println("�����(c=a*b)����Ԫ�����£�");
		for(j=0;j<aH;j++) {
			for(m=0;m<bL;m++) {
				for(k=0;k<aL;k++)
					c[j][m]=c[j][m]+a[j][k]*b[k][m];
				System.out.print(c[j][m]+"\t\t");
			}
			System.out.println();
		}
	}
	

}
