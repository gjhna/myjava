package ch05;

public class ch_5_15_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d=new Doctor("wang",1,"wu");
	}

}
	class Doctor{
		String name;
		int ID;
		String address;
		public Doctor(String name1,int ID1,String address1) {
			name=name1;
			ID=ID1;
			address=address1;
			System.out.println("����:"+name);
			System.out.println("���:"+ID);
			System.out.println("��ַ:"+address);
		}
		public Doctor() {
	         	}
		}
	class Specialist extends Doctor {
		public Specialist(String name1,int ID1,String address1) {
			super(name1,ID1,address1);
		}
		public Specialist() {
			super();
			name="10";
		}
		
	}
	
	
