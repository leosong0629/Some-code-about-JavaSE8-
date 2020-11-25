package Miss;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class miss6 {
	public static void main(String[]arfs) {
		Set<car> set =new TreeSet<>() ;
		set.add(new car(100,"Ford"));
		set.add(new car(200,"Toyota"));
		System.out.println(set);

	}

}

class car implements Comparator<car>{//Comparableを実装しないと実行時エラーになる java.lang.ClassCastException
	String name;
	int speed;
	car(int speed,String name){
		this.speed=speed;
		this.name=name;
	}
	@Override
	public int compare(car car1,car car2) {
		return car1.speed-car2.speed;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
