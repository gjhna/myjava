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
	class Chorous2<E,F>implements Compute<E,F>{             //implements��ʾ��ʵ��ĳ���ӿ�
		public void makeChorus(E x,F y) {                  //�ӿ��еķ�������Ϊ���󷽷�������������Ҫ����ʵ�ֽӿڷ����Ĵ��룬�����
															//106ҳ,�ҷ���������Ҫƥ��
			x.toString();
			y.toString();			//�Ѳ���صĶ����ۼ���һ�𣬷�װ�ڷ������У�
		}
	}
	class Singer2{
		public String toString() {
			System.out.println("��һ������������");
			return "";//�����̫����,���ͷ��ڴ��𣬵���java �����Զ��ͷ���ΪɶҪ����һ�����ַ���
		}
	}
	class MusicalInstruments2{
		public String toString() {
			System.out.println("|3 34 61 16 |5 56 5-|");
			return "";
		}
	}