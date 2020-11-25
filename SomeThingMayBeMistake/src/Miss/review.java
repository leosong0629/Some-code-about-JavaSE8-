package Miss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class review {
	public static void main(String[]args) {
		Set<String> hset=new HashSet<String>();
		hset.add("A");
		hset.add("B");
		hset.add(null);
		Iterator<String> i1=hset.iterator();
		//hset.add("C");//iteatorの直後追加だったらjava.util.ConcurrentModificationException
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

		hset.forEach(System.out::println);

		Map<String,Integer> tmap=new TreeMap<>();
		//tmap.put(null,null);//java.lang.NullPointerException



		Map<List<String>,List<Integer>> tmap1=new TreeMap<>();
		//tmap1.put(null,null);//java.lang.NullPointerException

		List<Map<List<String>,List<Integer>>> list = new ArrayList<>();
		list.add(null);//OK
		list.add(tmap1);

		Predicate<String> p=i->{
			System.out.println("Testing");
			return i.contains("Bob");
		};

		System.out.println(Stream.of("Bob","Bobo","Booo").filter(i->i.length()>3).allMatch(p));
		
	}
	Integer i=0;
	public void play() {
		synchronized(this) {
			for(int i=0;i<3;i++) {
				System.out.println(i);
			}
		}
	}
	synchronized void dance() {
		
	}
	
	

}
