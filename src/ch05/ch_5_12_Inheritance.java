package ch05;

public class ch_5_12_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mrZhang=new Manager();
		mrZhang.setName("�Ÿ�");
		mrZhang.setDepartment("����");
		mrZhang.setSalary(2500);
		mrZhang.setSpecial("���񴦴���");
		mrZhang.setSubsidy(500);
		System.out.println("***********Ա����Ϣ*********");
		System.out.println();
		System.out.print(mrZhang.toString());
	}

}
	class Employee{
		protected String name;
		protected double salary;
		protected String department;
		public void setName(String name) {
			this.name=name;
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
		public void setDepartment(String department) {
			this.department=department;
		}
		public String getName() {
			return name;
		}
		public double getSalary()
		{
			return salary;
		}
		public String getDepartment() {
			return department;
		}
		public String toString() {
			return "����:"+name+"\t����:"+department+"\t��������:"+salary;
		}
	}
	class Manager extends Employee{
		private String special;
		private double subsidy;
		public void setSpecial(String special) {
			this.special=special;
		}
		public void setSubsidy(double subsidy) {
			this.subsidy=subsidy;
		}
		public String getSpecial() {
			return special;
	}
		public double getSubsidy() {
			return subsidy;
		}
		public String toString() {
			return "����:"+name+"\t����:"+department+"\tְ��:"+special+"\t��������:"+salary+"\t����:"+subsidy;
		}
	}
