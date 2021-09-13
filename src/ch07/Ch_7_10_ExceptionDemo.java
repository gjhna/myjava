package ch07;


public class Ch_7_10_ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Bank ba=new Bank(50);
			ba.withdrawal(100);
			System.out.println("取款成功！");
		}catch(InsufficientFundsException e) {
			System.out.println(e.toString());
			System.out.println(e.excepMessage());
		}
	}

}
class Bank{
	double balance;
	Bank(double balance){
		this.balance=balance;
	}
	public void deposite(double dAmount) {
		if(dAmount>0.0)
			balance+=dAmount;
	}
	public void withdrawal(double dAmount)throws InsufficientFundsException{
		if(balance<dAmount)
			throw new InsufficientFundsException(this,dAmount);
		balance-=dAmount;
	}
	public void showBalance() {
		System.out.println("The balance is"+(int)balance);
	}
}

class InsufficientFundsException extends Exception{
	private Bank excepbank;
	private double excepAmount;
	InsufficientFundsException(Bank ba,double dAmount){
		super("取款异常！");
		excepbank=ba;
		excepAmount=dAmount;
	}
	public String excepMessage() {
		String str="银行取款是："+excepbank.balance+"\n"+"要取的钱是："+excepAmount;
		return str;
	}
}