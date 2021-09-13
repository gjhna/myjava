package ch06;
import java.io.*;

public class Ch_6_7_PhoneValidation {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		boolean contiGo=true;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String regex="(13\\d|15[036-9]|18[689])\\d{8}";
		String phoneNumber="";
		while(contiGo) {
			System.out.println("请输入手机号码");
			phoneNumber=buf.readLine();
			boolean match=phoneNumber.matches(regex);
			if(match) {
				System.out.println(phoneNumber+"是合法手机号码");
				break;
			}else{
				System.out.println(phoneNumber+"不是合法手机号码");
		}
	}

}}
