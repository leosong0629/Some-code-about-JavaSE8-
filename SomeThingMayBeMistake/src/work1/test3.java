package work1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class test3 {
	public static void main(String[]arhs) throws InterruptedException {
		BlockingQueue<String> bq=new ArrayBlockingQueue<>(10);
		bq.offer("A", 1, TimeUnit.SECONDS);
		bq.offer("D", 3, TimeUnit.SECONDS);
		bq.offer("B",0,TimeUnit.SECONDS);
		bq.poll(0, TimeUnit.MILLISECONDS);
		System.out.println(bq);
	}
}
