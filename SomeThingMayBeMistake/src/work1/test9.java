package work1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test9 {
	public static void main(String[]agr) {
		Predicate<String> p=i->i.length()>=3;
		List<String> b=Stream.of("Abc","Cde","Ccc").filter(p.negate()).collect(Collectors.toList());
		boolean c=b.stream().anyMatch(p);
		Stream s=b.stream();
		//s.allMatch(p);
		//s.anyMatch(p);//同じStreamに２つ以上の終端操作があったら実行時エラー　IllegalStateException

		//System.out.println(b.stream().anyMatch(p));
		//IntUnaryOperator un=u->u+2;
		List<Integer> st=IntStream.iterate(1, u->u+2).limit(3).boxed().collect(Collectors.toList());
		long count =st.stream().count();
		//System.out.println(st.stream().count());
		System.out.println(c +" "+count);
		IntUnaryOperator uu= k->k+1;
		IntUnaryOperator uk =h->h*2;
		List<Integer> list1=IntStream.iterate(1, uu.compose(uk)).limit(7).boxed().filter(i->i%3!=0).collect(Collectors.toList());
		list1.parallelStream().forEach(System.out::print);
		System.out.println(list1);
		List <Integer> test=new ArrayList<Integer>();
		test.add(1);test.add(2);test.add(3);
		Map<Object, List<Integer>> map=test.stream().collect(Collectors.groupingBy(i->i*2));
		System.out.println(map);
		String str = "ABC DES AF";
		Function<String, Integer> f=a->a.length();
		List<String> ll=new ArrayList<>();
		ll.add("ACS");ll.add("CCSAAW");
		System.out.println(ll.parallelStream().map(f.andThen(i->i*31)).peek(System.out::print).findAny());
		System.out.println(ll.stream().collect(Collectors.collectingAndThen(Collectors.groupingBy(i->i.hashCode()), h->h.size())));
		System.out.println(Duration.ofDays(10));
		System.out.println(Period.ofDays(10));
		System.out.println(Duration.ofDays(10).toString());
		System.out.println(Period.ofDays(10).toString());
		System.out.println(Duration.ofDays(10).equals(Period.ofDays(10)));
		System.out.println(Duration.ofHours(10));
		LocalDateTime ld=LocalDateTime.now();
		ld.withYear(2018);
		System.out.println(ld);
	}

}
