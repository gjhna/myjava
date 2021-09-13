package ch10;

public class ch_10_1_CaseThread extends Thread {
	String studentName;
	public ch_10_1_CaseThread(String studentName) {
		System.out.println(studentName+"申请访问服务器");
		this.studentName=studentName;
	}
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("当前的服务对象是"+studentName+"同学");
		try {
		Thread.sleep((int)(Math.random()*2000));
	}catch(InterruptedException ex) {
		System.out.println(ex.toString());
	}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch_10_1_CaseThread t1=new ch_10_1_CaseThread("张三");
		ch_10_1_CaseThread t2=new ch_10_1_CaseThread("李四");
		t1.start();
		t2.start();
		
	}

}
