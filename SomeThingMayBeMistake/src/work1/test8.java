package work1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class test8 {
	public static void main(String[]args) {
		LocalDate ld=LocalDate.of(2018, 12, 8);
		Period p=Period.ofYears(5).ofDays(5);//最後のofしか識別しない
		ld=ld.minus(p);
		System.out.println(ld);
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
		for(Integer item: list) {
		   System.out.print(item+" ");
		   list.add(9);//ArrayListだったら例外発生
		}
		System.out.println();
		//System.out.println(list);
		//System.out.println("Size: "+list.size());
	}

}
