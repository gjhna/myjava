package ch05_10_course;

public class Course {

	
		// TODO Auto-generated method stub
		public String courseID;
		public float credit;
		protected String courseCharacter;
		String description;
		private String term;
		public Course() {
			
		}
		public Course(String courseID,float credit,String courseCharacter,String description,String term) {
			this.courseID=courseID;
			this.credit=credit;
			this.courseCharacter=courseCharacter;
			this.description=description;
			this.term=term;
		}
	}


