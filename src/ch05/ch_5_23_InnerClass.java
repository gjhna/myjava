package ch05;

public class ch_5_23_InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel p=new Parcel();
		Parcel.Contents c=p.new Contents(33);
		Parcel.Destination d=p.new Destination("ɽ����ͬ");
		//Destination d=new Destination("ɽ��̫ԭ");
		p.setValue(c, d);
		p.ship();
		p.testShip();
	}

}
	class Parcel{
		private Contents c;
		private Destination d;
		private int contentsCount=0;
		class Contents{
			private int i;
			Contents(int i){
				this.i=i;
				contentsCount++;
			}
			int value() {
				return i;
			}
		}
		class Destination{
			private String label;
			Destination(String wheroTo){
				label=wheroTo;
			}
			String readLabel() {
				return label;
			}
		}
			void setValue(Contents c,Destination d) {
				this.c=c;
				this.d=d;
			}
			void ship() {
				System.out.println("����"+c.value()+"��"+d.label);
			}
			public void testShip() {
				c=new Contents(22);
				d=new Destination("ɽ��̫ԭ");
				ship();
			}
		}
	
