package ch10;

public class ch_10_1_CaseRunnable implements Runnable{
	String studentName;
	public ch_10_1_CaseRunnable(String studentName) {
		System.out.println(studentName+"������ʷ�����");
		this.studentName=studentName;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("��ǰ�ķ��������"+studentName+"ͬѧ");
		}
		try {
			Thread.sleep((int)(Math.random()*2000));
		}catch(InterruptedException ex) {
			System.out.println(ex.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new ch_10_1_CaseRunnable("����"));//���ݵ���ʵ����Runnable�ӿڵ�ʵ�������� 
		Thread t2=new Thread(new ch_10_1_CaseRunnable("����"));
		t1.start();
		t2.start();
	}

}
