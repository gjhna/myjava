package ch05;

public class ch_5_8_this4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annimal a=new Annimal(10,20);
		System.out.println("����С����");
		System.out.println("����="+a.age+"\t����="+a.weight+"��\t���="+a.height+"cm");
	}

}
	class Annimal{
		int age;
		String furColor;
		String eyeColor;
		String name; 
		float height;
		float weight;
		public Annimal(float height) {
			this.age=1;
			this.height=height;
		}
		public Annimal(String name) {
			this.age=1;
			this.name=name;
		}
		public Annimal(float height,float weight) {
			this(height);
			this.weight=weight;
		}
	}
