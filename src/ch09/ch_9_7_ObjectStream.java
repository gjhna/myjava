package ch09;
import java.io.*;

public class ch_9_7_ObjectStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Employee e1=new Employee(1001,"Wang",5678.50);
		FileOutputStream fos=new FileOutputStream("c:\\object.dat");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		out.writeObject(e1);
		out.close();
		FileInputStream fis=new FileInputStream("c:\\object.dat");
		ObjectInputStream in=new ObjectInputStream(fis);
		Employee e2=(Employee)in.readObject();
		System.out.println("Id:"+e2.id);
		System.out.println("Name:"+e2.name);
		System.out.println("Salary:"+e2.salary);
	}

}
class Employee implements Serializable{
	int id;
	String name;
	double salary;
	Employee(int i,String n,double s){
		id=i;
		name=n;
		salary=s;
	}
}