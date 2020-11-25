package Miss;

public class miss3 {

	/*class inner{
		{}//initalは使える
		//static {}//innerクラスはstatic ブロック使用できない
	}*/
	public static void main(String[]args) {
		C c=new C();
		D d=new E();
		E e=new E();
		System.out.println("name:"+d.name+" name1:"+d.name1+" DD():"+d.DD()+" DDD:"+d.DDD());//変数はstaticを付けでも
		//親クラスに参照する場合に全部親変数である、メソッドはstaticじゃない場合に、子クラスに参照する、staticかつオーバライド
		//の場合は親クラスに参照、
		System.out.println(e.name+e.name1);

	}


}
class A{
	static {
		System.out.println("A static");
	}
	public A() {
		System.out.println("A class");
	}
	{System.out.println("A inital");}
}
class B21 extends A{

	static {System.out.println("B static1");}
	public B21() {
		System.out.println("B class");
	}
	static {System.out.println(" static2");}

}

class C extends B21{
	public C() {System.out.println("C class");}

}

class D{
	String name="DD";
	static String name1="static DD";//変数は親参照した
	protected D() {

	}
	public String DD() {
		return "parent";
	}

	public static String DDD() {
		return "static parent";
	}
}

class D1 extends D{

	private D1() {

	}
}

class E extends D{
	String name ="EE";
	static String name1="static EE";
	public E() {

	}
	public String DD() {
		return "chile";
	}

	public static String DDD() {
		return "static child";
	}
}