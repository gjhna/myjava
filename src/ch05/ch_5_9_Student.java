package ch05;

public class ch_5_9_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 zhangGang=new Student1(19,"山西太原","张刚",350);
		Teacher missLiu=new Teacher(35,"beijing","刘老师",2000,"102198");
		missLiu.question(zhangGang);
	}

}
	class Student1{
		public int studentAge;
		protected String studentAddr;
		String studentName;
		private int studentAccount;
		
		public Student1(int studentAge,String studentAddr,String studentName,int studentAccount) {
			this.studentAge=studentAge;
			this.studentAddr=studentAddr;
			this.studentName=studentName;
			this.studentAccount=studentAccount;
		}
		public Student1() {
			this.studentAge=18;
		}
	}
	class Manger extends Student1{
		void getStudentInformation() {
			System.out.println("name is"+studentName);
			System.out.println("age is"+studentAge);
			System.out.println("addr is"+studentAddr);
			//System.out.println("account is"+studentAccount);//
			
		}
	}
		class Teacher{
			public int age;
			protected String addr;
			String name;
			private int account;
			String teacherID;
			
			public Teacher(int age,String addr,String name,int account,String teacherID) {
				this.age=age;
				this.addr=addr;
				this.name=name;
				this.account=account;
				this.teacherID=teacherID;
			}
			public void setInfo(String teacherID) {
				this.teacherID=teacherID;
			}
			public void question(Student1 s) {
				System.out.println(s.studentAddr+"\t"+s.studentAge+"\t"+s.studentName);
				//System.out.println("\t"+s.studentAccount);//
			}
		}
		
		
	
