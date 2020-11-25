package Miss;

public class miss4 implements ii {
	public static void main(String[]args) {
	
		ii t=new test();
		ii m=new miss4();
		//System.out.println(kiss());//NGインスタンスメンバーなので
		System.out.println(ii.play());
		System.out.println(t.kiss());
		//System.out.println(t.play());//NG
		System.out.println(m.kiss());
		//System.out.println(ii.kiss());//NG
		
	}
	public void go() {
		System.out.println(kiss());//OK インスタンスメソッドでアクセスできる
		//System.out.println(play());//NG static 変数は多態性適用しない
		System.out.println(ii.super.kiss());
	}
}

interface ii{
	static int play() {
		return 10;
	}
	default String kiss() {
		return "Kiss";
	}
}

class test implements ii{
	
}
