package ch05;

public class ch_5_3_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1,s2;
		s1=new Student();
		s2=new Student();
		s1.setInfo("��ǿ","20100038","ɽ��̫ԭ");
		s2.setInfo(23.5f,"20100089");
		s2.getInfo(23.5f);
		s1.getInfo("ɽ��̫ԭ");
		}

}
	class Student{
		public String name;
		public String studentID;
		private String address;
		public String mobilePhone;
		protected String major;
		private float gpa;
		
		public void register() {
			
		}
		public float getgpa() {
			return gpa;
		}
		public void setgpa() {
			gpa=23.5f;
		}
		public void setInfo(String n,String ID) {
			name=n;
			studentID=ID;
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
		public void getInfo(float g) {
			System.out.println("ѧ�ţ�"+studentID+"\tƽ���ɼ�������"+g);
		}
		public void getInfo(String add) {
			System.out.println("ѧ�ţ�"+studentID+"\t������"+name+"\t��ַ��"+add);
			
		}
	}
