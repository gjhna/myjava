package ch05;

import ch05_10_course.Course;

public class ch_5_10_Assitanter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination exam;
		Student1 zhangGang=new Student1(19,"山西太原","张刚",350);
		Teacher missLiu=new Teacher(35,"beijing","刘老师",2000,"102198");
		ComputerCourse c1=new ComputerCourse(missLiu,"12345",3.5f,"必修","JAVA语言程序设计技术","5");
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
				System.out.println("通过考试，实际学分为"+c);
			}
			if(score<60) {
				c=0;
				System.out.println("未通过考试，实际学分为"+c);
			}
			//System.out.println("课程性质"+courseCharacter);
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
			System.out.println("课程编号"+courseID);
			System.out.println("学分"+credit);
			System.out.println("课程性质"+courseCharacter);
		}
	}


