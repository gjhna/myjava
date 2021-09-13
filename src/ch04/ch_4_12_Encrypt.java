package ch04;
import java.awt.*;
import javax.swing.JOptionPane;
public class ch_4_12_Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int[]digit;
		int c;
		int encryptedNumber;
		digit=new int[4];
		String inputNumber=JOptionPane.showInputDialog("Enter a four digit number:");
		number=Integer.parseInt(inputNumber);
		for(int i=0;i<inputNumber.length();i++) {
			digit[i]=Integer.parseInt((inputNumber.substring(i,i+1)));
			digit[i]=(digit[i]+7)%10;
			c=digit[0];digit[0]=digit[2];digit[2]=c;
			c=digit[1];digit[1]=digit[3];digit[3]=c;
			encryptedNumber=Integer.parseInt((Integer.toString(digit[2])+Integer.toString(digit[3])+Integer.toString(digit[0])+
					Integer.toString(digit[1])));
			
			JOptionPane.showMessageDialog(null,number+"加密之后是:"+encryptedNumber,"密文",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

}
