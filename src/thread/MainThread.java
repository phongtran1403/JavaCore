package thread;

public class MainThread {
	public static void main(String[] args) {

		test2();
		System.out.println("luồng chính");
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void test1() {
		MyThreadExtenThread myThreadExtenThread = new MyThreadExtenThread();
		myThreadExtenThread.start();
	}
	public static void test2() {
		MyThreadImplementRunnable implementRunnable = new MyThreadImplementRunnable();
		Thread thread = new Thread(implementRunnable);
		thread.start();
		
		Thread thread2= new Thread(implementRunnable);
		thread2.setName("luồng 3");
		thread2.start();
	}
	
}
