package ch05;

public class ch_5_24_AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher2 zhang=new Teacher2();
		Student3 liu=new Student3(){
			void speak() {
				System.out.println("这是匿名类中的方法");//类似子类赋值给父类，上转型
			}
			
		};
		zhang.look(liu);
	}

}
	abstract class Student3 {
		abstract void speak();
	}
	class Teacher2{
		void look(Student3 s) {
			s.speak();
		}
	}
