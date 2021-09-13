package ch10;

public class Ch_10_4_seatorderedCase {
	private int seatResource;
	private boolean empty=true;
	public void setEmpty() {
		empty=true;
	}
	public synchronized void push(int pubResource) {
		while(!empty) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		seatResource=pubResource;
		empty=false;
		notify();
	}
	public synchronized int pop() {
		while(empty) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		int popResource=seatResource;
		seatResource=0;
		empty=true;
		notify();
		return popResource;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch_10_4_seatorderedCase so=new Ch_10_4_seatorderedCase();
		SeatProcedure sp=new SeatProcedure(so);
		sp.start();
		SeatConsumer sc=new SeatConsumer(so);
		sc.start();
		SeatRelease sr=new SeatRelease(so);
		sr.start();
		
	}

}
class SeatProcedure extends Thread{
	private Ch_10_4_seatorderedCase so;
	public SeatProcedure(Ch_10_4_seatorderedCase so) {
		this.so=so;
	}
	public void run() {
		for(int i=1;i<=30;i++) {
			int pubResource=i;
			so.push(pubResource);
			System.out.println("��"+pubResource+"����λΪ��");
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class SeatConsumer extends Thread{
	private Ch_10_4_seatorderedCase so;
	public SeatConsumer(Ch_10_4_seatorderedCase so) {
		this.so=so;
	}
	public void run() {
		for(int i=1;i<=50;i++) {
			synchronized(so) {
				int sh=so.pop();
				if(sh!=0) {
					System.out.println("ѧ��"+i+" "+"ռ�˵�"+sh+"����λ");
				}else {
					System.out.println("û�п�������ȴ���");
				}
			}
			try {
				sleep(200);
			}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
class SeatRelease extends Thread{
	private Ch_10_4_seatorderedCase so;
	public SeatRelease(Ch_10_4_seatorderedCase so) {
		this.so=so;
	}
	public void run() {
		try {
			sleep(20000);
			this.so.setEmpty();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=30;i++) {
			int pubResource=i;
			so.push(pubResource);
			System.out.println("��"+pubResource+"����λȡ��Ԥ��");
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}