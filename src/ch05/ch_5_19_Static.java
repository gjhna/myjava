package ch05;

public class ch_5_19_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ŀǰ������������"+Person.totalNum);
		Person wang=new Person("Wang");
		Person liu=new Person("Liu");
		Person zhao=new Person("Zhao");
		System.out.println("Ŀǰ������������"+Person.totalNum);
		System.out.println("Ŀǰ������������"+wang.totalNum);
	}

}
	class Person{
		static long totalNum=10000;
		int age;
		String name;
		String id;
		public Person(String name) {
			totalNum++;
			this.name=name;
			age=1;
		}
	}
