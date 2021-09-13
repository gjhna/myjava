package ch10;

public class ch_10_3_deadlockCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadlockRisk dead=new DeadlockRisk();
		ClassThread ct1=new ClassThread(dead);
		ClassThread ct2=new ClassThread(dead);
		ClassThread ct3=new ClassThread(dead);
		ClassThread ct4=new ClassThread(dead);
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		
	}

}
	class ClassThread extends Thread{
		private DeadlockRisk dead;
		ClassThread(DeadlockRisk dead){
			this.dead=dead;
		}
		public void run() {
			int k=(int)(10*Math.random());
			if(k>5) {
				this.dead.projectorBorrow();
			}else {
				this.dead.roomOrder();
			}
		}
	}
	class DeadlockRisk{
		private static class ClassRoom{
			public boolean value;
		}
		private static class Projector{
			public boolean value;
		}
		private ClassRoom room=new ClassRoom();
		private Projector pr1=new Projector();
		public void roomOrder() {
			synchronized(room) {
				room.value=true;
				System.out.println(Thread.currentThread().getName()+"Ԥ���˽���");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ex) {
					System.err.println(ex.toString());
				}
				synchronized(pr1) {
					pr1.value=true;
					System.out.println(Thread.currentThread().getName()+"�赽��ͶӰ��");
				}
			}
		}
		public void projectorBorrow() {
			synchronized(pr1) {
				pr1.value=true;
				System.out.println(Thread.currentThread().getName()+"�赽��ͶӰ��");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ex) {
					System.err.println(ex.toString());
				}
				synchronized(room) {
					room.value=true;
					System.out.println(Thread.currentThread().getName()+"Ԥ���˽���");
				}
			}
		}
	}