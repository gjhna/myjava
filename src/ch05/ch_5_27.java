package ch05;

public class ch_5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 circle=new Circle3(10);
		Cone<Circle3>oneCone=new Cone<Circle3>(circle);
		oneCone.height=10;
		oneCone.computeVolume();
		Rctangle3 rectangle=new Rctangle3(10,5);
		Cone<Rctangle3>anotherCone=new Cone<Rctangle3>(rectangle);
		anotherCone.height=30;
		anotherCone.computeVolume();
		
	}

}
	class Cone<E>{
		E bottom;
		double height;
		public Cone(E b) {
			bottom=b;
		}
		public void computeVolume() {
			String s=bottom.toString();//return""+area就是把返回值类型转化为字符串型，所以定义为String s
			double area=Double.parseDouble(s);//这是Double类，把字符串类型转化为浮点型
			System.out.println("体积是"+1.0/3.0*area*height);
		}
	}
	class Circle3{
		double area,radius;
		Circle3(double r){
			radius=r;
		}
		public String toString() {
			area=radius*radius*Math.PI;
			return ""+area;
		}
	}
		class Rctangle3{
			double sideA,sideB,area;
			Rctangle3(double sideA,double sideB){
				this.sideA=sideA;
				this.sideB=sideB;
			}
			public String toString() {
				area=sideA*sideB;
				return ""+area;
			}
		}
	