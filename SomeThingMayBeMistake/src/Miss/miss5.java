package Miss;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class miss5 {
	private static String s="100";
	public static void main(String []args) {
		Bar b=new Foo();
		Bar b1=new Foo() {String s;};
		Bar b2=new Foo("A") {String q;};
		List<Integer> l = IntStream.range(1, 6)
				   .mapToObj(i -> i).collect(Collectors.toList());
				l.forEach(System.out::println);//ListはIteableからforeachを実装している
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 2);
		map.put(1, 3);
		System.out.println("Mapsize"+map.size());
		Todo t1=new Todo("A");
		Todo t2=new Todo("B");
		System.out.println(t1.name.equals(t2.name));
		PriorityQueue<String> ap=new PriorityQueue<>();
		ap.add("2");
		ap.add("4");
		System.out.print(ap.peek()+" ");
		ap.offer("1");
		ap.add("3");
		ap.remove("1");
		System.out.print(ap.poll()+" ");
		if(ap.remove("2"))System.out.println(ap.poll()+" ");
		System.out.print(ap.poll()+" "+ap.peek());


	}
	final static int a=100;
	final static String b=" a";
	static void kiss(final int a,final String b) {//final変数は使える
		//enum book{NICE, PEAK}//メソッド内でenumを定義できない

	}
	void go() {
		//private class inner {}//public private NG
		abstract class member{
			String s=miss5.s+"100";
			}
	}


}

class Bar{
	Bar(){}
	Bar(String s){}
}

class Foo extends Bar{
	Foo(){}
	Foo(String s){super(s);}
	void Zoo() {}
}

class Todo{
	String name;
	Todo(String a){
		name=a;
	}
}

