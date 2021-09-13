package ch10;

public class ch_10_2_SynchronizedCase {
	CardAccount cardaccount;
	Thread messConsume,schoolingConsume;
	Thread mobileConsume,libraryConsume,marketConsume;
	ch_10_2_SynchronizedCase(){
		cardaccount=new CardAccount();
		messConsume=new Thread(cardaccount);
		schoolingConsume=new Thread(cardaccount);
		mobileConsume=new Thread(cardaccount);
		libraryConsume=new Thread(cardaccount);
		marketConsume=new Thread(cardaccount);
		messConsume.setName("messConsume");
		schoolingConsume.setName("schoolingConsume");
		mobileConsume.setName("mobileConsume");
		marketConsume.setName("marketConsume");
		libraryConsume.setName("libraryConsume");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch_10_2_SynchronizedCase ex=new ch_10_2_SynchronizedCase();
		ex.caserun();
	}
	public void caserun() {
		try {
			messConsume.start();
			libraryConsume.start();
			marketConsume.start();
			mobileConsume.start();
			schoolingConsume.start();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
	class CardAccount implements Runnable{
		int fund=1000;
		String accessType;
		public void setFund(int num) {
			fund=num;
		}
		public synchronized void accountAccess(int num,boolean k) {
			for(int i=0;i<3;i++) {
				accessType=Thread.currentThread().getName();
				if(k)
					fund+=num;
				else {
					fund-=num;
				}
				try {
					System.out.println("��ǰ�߳���"+accessType+"���˻�ʣ���ʽ�Ϊ"+fund+"��");
					Thread.sleep(2000);
				}catch(InterruptedException ex) {
					System.err.println(ex.toString());
				}
			}
		}
		public void run() {
			accessType=Thread.currentThread().getName();
			if(accessType.equals("messConsume"))
				accountAccess(5,false);
			else if(accessType.equals("schoolingConsume"))
				accountAccess(100,false);
				else if(accessType.equals("mobileConsume"))
					accountAccess(20,false);
					else if(accessType.equals("libraryConsume"))
						accountAccess(2,false);
						else if(accessType.equals("marketConsume"))
							accountAccess(6,false);
		}
	}
