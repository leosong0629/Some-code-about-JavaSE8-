package work1;

import java.util.Arrays;

public class fok {
	public static void main(String[]a) {
		System.out.println(Arrays.asList(1,2,3,4,5).parallelStream().findAny().get());
		Integer ax=10;
		ax++;
		assert ax>10;
		assert ax++>10;
		assert ax+10>10;
	}

}
