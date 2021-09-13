package ch05;

public class Ch_5_18_Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lady missLiu=new Lady();
		missLiu.pet=new Dog2();
		missLiu.petEnjoy();
		Lady missWang=new Lady();
		missWang.pet=new Bird();
		missWang.petEnjoy();
	}

}
	class Lady{
		Pet pet;
		void petEnjoy() {
			pet.enjoy();
		}
	}
	class Pet{
		int name;
		void enjoy() {
			System.out.println("³èÎï¸ßĞË");
		}
	}
	class Bird extends Pet{
		void enjoy() {
			System.out.println("ÔûÔû~~~");
		}
	}
	class Dog2 extends Pet{
		void enjoy() {
			System.out.println("ÍôÍô~~~");
		}
	}
