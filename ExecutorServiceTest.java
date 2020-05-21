package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ExecutorService のコードサンプル
 * https://java.keicode.com/lang/multithreading-executor.php
 */

public class ExecutorServiceTest {
	public static void main(String[] args) {
		System.out.println("Entering main");

		ExecutorService exec = Executors.newFixedThreadPool(3);

		try {
			for (int i = 0; i < 10; i ++) {
				exec.execute(new Runnable(){
					public void run() {
						try {
							Thread.sleep(1 * 1000);
							System.out.println("Hello! - "
									+ Thread.currentThread().getId());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				});
			}
			System.out.println("Sleepin..."
					+ Thread.currentThread().getId());
			Thread.sleep(15 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Exit main");
	}
}
