package ch05;

public class ch_5_16_Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new D();
		c.n=3.1415926;
		c.m=186;
		c.f();
		c.g();
		D d=(D)c;
		d.n=555;
		d.f();
		d.g();
		d.cry();
	}

}
	class C{
		int m;
		double n;
		void f() {
			System.out.println("被子类继承的方法f()");
		}
		void g() {
			System.out.println("你好,n="+n+"m="+m);
		}
	}
	class D extends C{
		int n=12;
		int w;
		void g() {
			System.out.println("子类重写方法g(),n="+n+"m="+m);
		}
		void cry() {
			System.out.println("子类新增的方法"); 
		}
	}
