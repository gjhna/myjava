package ch06;
import java.util.Arrays;
public class Ch_6_5_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k, baka[]=new int[11], a[]= {19,22,15,13,1,0,10,8,2,4,36};
		System.out.println("\t\t����ǰa�����Ԫ��Ϊ��");
		for(k=0;k<a.length;k++) {
			System.out.print(a[k]+"\t");
			baka[k]=a[k];
		}
		System.out.println();
		Arrays.parallelSort(a);
		System.out.println("\t\t��ȫ�����a�����Ԫ��Ϊ��");
		for(k=0;k<a.length;k++)
			System.out.print(a[k]+"\t");
		System.out.println();
		
		int key=Arrays.binarySearch(a, 10);//���Ѿ�����������в���Ԫ��
		System.out.println("����ǰ��10λ��a�����"+key+"��Ԫ��");
		for(k=0;k<baka.length;k++) {
			a[k]=baka[k];
		}
		Arrays.parallelSort(a,3,8);//�ض�λ�ö˽�������
		System.out.println("����(��3������7��Ԫ�أ������a�����Ԫ��Ϊ:"); 
		for(k=0;k<a.length;k++)
			System.out.print(a[k]+"\t");
			System.out.println();
			
			
	}

}
