package work1;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class test2 {
	public static void main(String[]args) {
		ScheduledExecutorService ser=null;
		try {
		Runnable task1=()->{
			System.out.println("Task1:START!");
			for(int i=0;i<5;i++) {
				System.out.print(" * ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			System.out.print("100%!");
			System.out.println("\nTask1:END! at TIME:"+LocalDateTime.now());
		};
		
		Runnable task2=()->{
			System.out.println("Task2:START!");
			for(int i=0;i<5;i++) {
				System.out.print(" * ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			System.out.print("100%!");
			System.out.println("\nTask2:END at TIME:!"+LocalDateTime.now());
		};
		ser=Executors.newSingleThreadScheduledExecutor();
		//ser=Executors.newSingleThreadExecutor();//NG
		ser.schedule(task1, 0, TimeUnit.SECONDS);
		ser.schedule(task2, 3, TimeUnit.SECONDS);
		
		}
		finally {
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			System.out.println("TASK FINISHED!");
		}
		}

}

class myThreadA extends Thread{
	
}

class myThreadB extends Thread{
	
}
