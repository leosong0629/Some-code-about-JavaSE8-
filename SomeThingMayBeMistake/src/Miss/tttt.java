//package Miss;

import java.util.Arrays;
import java.util.List;

public class tttt {
	public static void main(String[]arfs) {
		List<String> list=Arrays.asList(arfs);
		list.stream().map(i->i.toUpperCase()).filter(i->i.length()>3)
		.forEach(i->{
			System.out.print(i.length()+" ");
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {

			}
		});
		
		double d=arfs[0].length();
	}

}
