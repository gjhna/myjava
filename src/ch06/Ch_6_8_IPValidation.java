package ch06;
import java.io.*;
public class Ch_6_8_IPValidation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean contiGo=true;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String number="((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|25[0-5]))";
		String regex="("+number+"\\.){3}"+number;
		String ipNumber="";
		while(contiGo) {
			System.out.println("������IP��ַ");
			ipNumber=buf.readLine();
			boolean match=ipNumber.matches(regex);
			if(match) {
				System.out.println(ipNumber+"�ǺϷ�IP��ַ");
				break;
			}else
				System.out.println(ipNumber+"\n���ǺϷ�IP��ַ");
		}
	}

}
