package ch06;

public class Ch_6_6_StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
		String message1="ABCd001";
		String message2="Abcd001";
		boolean result1=message1.matches(regex);
		boolean result2=message2.matches(regex);
		if(result1)
			System.out.println(message1+"是合法的数据");
		else
			System.out.println(message1+"不是合法的数据");
		if(result2)
			System.out.println(message2+"是合法的数据");
		else
			System.out.println(message2+"不是合法的数据");
	} 

}
