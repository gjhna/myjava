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
			System.out.println("������̳еķ���f()");
		}
		void g() {
			System.out.println("���,n="+n+"m="+m);
		}
	}
	class D extends C{
		int n=12;
		int w;
		void g() {
			System.out.println("������д����g(),n="+n+"m="+m);
		}
		void cry() {
			System.out.println("���������ķ���"); 
		}
	}
