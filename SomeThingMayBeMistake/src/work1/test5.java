package work1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class test5 {

	public static void main(String[]args) throws InterruptedException, BrokenBarrierException {
		Predicate<String> p=i->i.length()>3;
		Predicate<String> p1=i->i.contains("B");
		Stream.of("AAA","ABA","cBd","PBBB","CCC")
				.filter(p.and(p1).negate()).forEach(System.out::print);;
				System.out.println();
				
	Thread A=new Thread(new myT());
	Thread B=new Thread(new myT1());
	
	
	final CyclicBarrier c1=new CyclicBarrier(2, A);
	CyclicBarrier c2=new CyclicBarrier(2,B);
	perform(c1, c2);
	
	}
	
	static void perform(CyclicBarrier c1,CyclicBarrier c2) throws InterruptedException, BrokenBarrierException {
		System.out.println("Start!");
		System.out.println("Start");
		c1.await();
		System.out.println("Start2");
		c2.await();
		System.out.println("End!");
	}
}

class myT extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("i: "+i);
		}
	}
}

class myT1 extends Thread{
	
	@Override
	public void run() {
		for (int j=0;j<5;j++) {
			System.out.println("j: "+j);
		}
	}
}