package ch05;

public class ch_5_24_AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher2 zhang=new Teacher2();
		Student3 liu=new Student3(){
			void speak() {
				System.out.println("�����������еķ���");//�������ำֵ�����࣬��ת��
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
