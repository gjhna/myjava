package ch05;

public class ch_5_11_setGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1;
		s1=new Student2();
		s1.setgpa(26.5f);
		s1.setInfo("��ǿ","20100038","ɽ��̫ԭ");
		s1.getInfo();
	}

}
	class Student2{
		public String name;
		public String studentID;
		private String address;
		public String mobliePhone;
		protected String major;
		private float gpa;
		public float getgpa() {
			return gpa;
		}
		
		public void setgpa(float gpa) {
			this.gpa=gpa;
		}
		public void setInfo(String n,String ID,String add) {
			name=n;
			studentID=ID;
			address=add;
		}
		public void setInfo(float g,String ID) {
			gpa=g;
			studentID=ID;
		}
		public void getInfo() {
			System.out.println("ѧ��:"+studentID+"\t����:"+name+"\t��ַ:"+address+"\t��ѧ�ּ���:"+gpa);
		}
		
		
	}
