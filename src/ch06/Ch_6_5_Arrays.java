package ch06;
import java.util.Arrays;
public class Ch_6_5_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k, baka[]=new int[11], a[]= {19,22,15,13,1,0,10,8,2,4,36};
		System.out.println("\t\t排序前a数组各元素为：");
		for(k=0;k<a.length;k++) {
			System.out.print(a[k]+"\t");
			baka[k]=a[k];
		}
		System.out.println();
		Arrays.parallelSort(a);
		System.out.println("\t\t完全排序后a数组各元素为：");
		for(k=0;k<a.length;k++)
			System.out.print(a[k]+"\t");
		System.out.println();
		
		int key=Arrays.binarySearch(a, 10);//在已经排序的数组中查找元素
		System.out.println("排序前，10位于a数组的"+key+"个元素");
		for(k=0;k<baka.length;k++) {
			a[k]=baka[k];
		}
		Arrays.parallelSort(a,3,8);//特定位置端进行排序
		System.out.println("部分(第3个至第7个元素）排序后a数组各元素为:"); 
		for(k=0;k<a.length;k++)
			System.out.print(a[k]+"\t");
			System.out.println();
			
			
	}

}
