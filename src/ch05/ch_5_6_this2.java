package ch05;

public class ch_5_6_this2 {
	int x=188,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch_5_6_this2 e=new ch_5_6_this2();
		e.f();
	}
	void f() {
		int x=3;
		y=x;
		System.out.println("y="+y);
		y=this.x;
		System.out.println("y="+y);
	}

}
