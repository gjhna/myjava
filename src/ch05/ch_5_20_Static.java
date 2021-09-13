package ch05;

public class ch_5_20_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(staticTestFunction.addUp(10,5));
		staticTestFunction test=new staticTestFunction();
		System.out.println(test.sub());
	}

}
	class staticTestFunction{
		int x=10,y=6;
		static int z=9;
		public static int addUp(int a,int b) {
			return a+b+z;
		}
		public int sub() {
			return x-y;
		}
		//public static int addUp() {
		//	return x+y;
		//}
	}
