package ch05;

public class ch_5_4_ConstructorOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point();
		Point p2=new Point(3,4);
		System.out.println("p1的原点为("+p1.x+","+p1.y+")");
		System.out.println("p2的原点为("+p2.x+","+p2.y+")");
	}

}
