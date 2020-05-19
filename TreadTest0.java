package thread;

public class TreadTest0 {
	public static void main(String[] args) {
		System.out.println("Entering main" + Thread.currentThread().getId());

		try {
			Thread thread = new Thread(new Runnable() {
				public void run() {
					System.out.println("Hello! "
							+ Thread.currentThread().getId());
				}
			});
			thread.start();
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Exit main");
	}
}
