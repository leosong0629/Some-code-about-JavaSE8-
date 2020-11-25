package Miss;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class miss {
	public static void main(String[]args) {
		LocalDateTime lcd=LocalDateTime.now();
		ZonedDateTime zone=ZonedDateTime.of(lcd, ZoneId.systemDefault());
		DateTimeFormatter form = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

		System.out.println(zone.format(form));
		
		new C1();

		Function<Integer, Double > f=i->i*0.5;//引数と結果は転換できる必要がある
		IntFunction<String> ifu=i->""+i;
		DoubleFunction<String> dfu=i->""+i;
		ToIntFunction<Double> tif=i->i.hashCode();//Functioninterfaceにキャスト転換適用しない、参照型のラッパ型はもともと適用しない
		double dd=3.1;
		int ii=(int)dd;
		List<? super IOException> exceptions = new ArrayList<Exception>();
		 //exceptions.add(new Exception());	//ExceptionはNG？
		 exceptions.add(new FileNotFoundException());//superなのにサブクラスを使える？
		 Stream<String> s = Stream.generate(() -> "meow").limit(10).peek(i->System.out.println(i));
		 boolean match = s.allMatch(String::isEmpty);
		 System.out.println(match);

		 for(int i=0;i<3;++i) {//i++と同じ結果
			 System.out.println(i);
			 try {
				Thread.currentThread().sleep(1000);//sleepにthrowsかtry/catchが必要
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		 }
		 for(int j=0;j<3;j++ ) {
			 System.out.println(j);
		 }

		 System.out.println(food.rice.weight);
		 food[] a=food.values();//valuesメソッドで配列を生成する
		 System.out.println(a[1]);//enmu要素名だけ出力

	}

	public static enum food{//Innerは修飾子を追加できる、enumは内外に宣言できるが、メソッドに宣言できない
		rice(10),noodles(5),meat(5);
		int weight;
		private food(int a){//enmuのコンストラクタのアクセス修飾子はprivateのみ
			 weight=a;
		 }
	 }

}

enum food1{//Outerのenumは修飾子追加できない


}
class A1{
	static {
		System.out.println("A static");
	}//クラスが呼び出される時に呼び出される
	public A1() {
		System.out.println("A class");
	}
	{System.out.println("A inital");}//コンストラクタがsuperを呼び出した後呼び出される
}
class B1 extends A1{
	
	static {System.out.println("B static1");}
	public B1() {
		System.out.println("B class");
	}
	static {System.out.println("B static2");}
	
}

class C1 extends B1{
	public C1() {System.out.println("C class");}
	
}
