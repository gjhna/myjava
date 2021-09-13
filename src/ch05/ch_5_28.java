package ch05;

public class ch_5_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chorous<Singer,MusicalInstruments>model=new Chorous<Singer,MusicalInstruments>();
		model.makeChorus(new Singer(), new MusicalInstruments());
	}

}
	interface Compute<E,F>{
		void makeChorus(E x,F y);
	}
	class Chorous2<E,F>implements Compute<E,F>{             //implements表示类实现某个接口
		public void makeChorus(E x,F y) {                  //接口中的方法必须为抽象方法，所以类体中要加入实现接口方法的代码，详见书
															//106页,且方法各方面要匹配
			x.toString();
			y.toString();			//把不相关的东西聚集在一起，封装在泛型类中，
		}
	}
	class Singer2{
		public String toString() {
			System.out.println("好一朵美丽的茉莉花");
			return "";//这个不太明白,是释放内存吗，但是java 不是自动释放吗，为啥要返回一个空字符串
		}
	}
	class MusicalInstruments2{
		public String toString() {
			System.out.println("|3 34 61 16 |5 56 5-|");
			return "";
		}
	}