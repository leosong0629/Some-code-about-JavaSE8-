package Miss;

public class miss2 {
	public static void main(String[]agr) {
		System.out.println(new miss2().new test1().play("ABC"));
		new miss2.sss().kkk();//staticクラスのインスタンス生成
		sss.mmm();//static メソッドの直接アクセス

	}
	public	abstract interface A{//interfaceはabstract定義できる

	}
	protected static abstract class test{//abstractクラスはprivateやfinalで宣言できない
		private int num=10;
		final int num0=20;
		private final int num1=100;
		private final void play() {}//privateなの隠されることになる
		public abstract void play(int a);
	}
	class test1 extends test{
		public int num1=200;
		//num1=200;//NG private
		//num0=200;//NG final
		public void play() {//Overriteではない、独自なメソッドである
			//System.out.println(num);//privateでアクセスできない
		}
		public int play(String a) {
			return a.length();
		}

		@Override
		public void play(int a) {//abstractクラス継承下実像クラスは、抽象メソッドのオーバーライドが必須

		}
	}

	abstract class test2 extends test1{//abstract classは実像クラス継承できる
		public void play() {

		}
	}
	
	static class sss{
		public void kkk() {
			System.out.println("Static ");
		}
		static void mmm() {
			System.out.println("static static");
		}
	}

}

abstract interface B{
	static void play() {;}//static メソッド実装可
	default void kiss() {;}//default可、static と併用不可
	abstract void hug() ;//staticと併用不可
}



