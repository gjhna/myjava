package ch04;

public class ch_4_4_testSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random=1+(int)(Math.random()*4);
		switch(random) {
		case 1:
			System.out.println("I feel fine");
			break;
		case 2:
			System.out.println("I've been better");
			break;
		case 3:
			System.out.println("I feel horrible");
			break;
		case 4:
			System.out.println("I feel terrific");
		}
	}

}
