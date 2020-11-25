package Miss;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class miss8 {
	public static void main(String[]args) {
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		CyclicBarrier c1=new CyclicBarrier(3,()->System.out.println("starting"));
		Runnable a=()->{
			System.out.println("start");
			try {
				c1.await();
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		};
		
		service.execute(a);
		service.execute(a);
		service.execute(a);
		service.shutdown();
		
			
	}
	
	

}

class myThread extends Thread{
	@Override
	public void run() {
		System.out.println("start!");
	}
}
