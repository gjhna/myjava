package ch05;

import ch05_10_course.Course;

public class ch_5_10_Assitanter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination exam;
		Student1 zhangGang=new Student1(19,"ɽ��̫ԭ","�Ÿ�",350);
		Teacher missLiu=new Teacher(35,"beijing","����ʦ",2000,"102198");
		ComputerCourse c1=new ComputerCourse(missLiu,"12345",3.5f,"����","JAVA���Գ�����Ƽ���","5");
		c1.putInfo();
		exam=new Examination(zhangGang,c1,55f);
		exam.putCredit();
		System.out.println();
	}

}
	class Examination{
		Student1 student;
		float score;
		Course course;
		public Examination(Student1 student,Course course,float score) {
			this.student=student;
			this.course=course;
			this.score=score;
		}
		public float putCredit() {
			float c=0.0f;
			if(score>=60) {
				c=course.credit;
				System.out.println("ͨ�����ԣ�ʵ��ѧ��Ϊ"+c);
			}
			if(score<60) {
				c=0;
				System.out.println("δͨ�����ԣ�ʵ��ѧ��Ϊ"+c);
			}
			//System.out.println("�γ�����"+courseCharacter);
			return c;
		}
	}
	class ComputerCourse extends Course{
		Teacher teacher;
		public ComputerCourse(Teacher teacher,String courseID,float credit,String courseCharacter,String description,String term) {
			super(courseID,credit,courseCharacter,description,term);
			this.teacher=teacher;
		}
		public void putInfo() {
			System.out.println("�γ̱��"+courseID);
			System.out.println("ѧ��"+credit);
			System.out.println("�γ�����"+courseCharacter);
		}
	}


