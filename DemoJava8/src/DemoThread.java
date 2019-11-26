
class MyThread extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("MyThread :" + i);
		}
	}
}

public class DemoThread {

	public static void main(String[] args) throws InterruptedException {
		MyThread th = new MyThread();
		th.start();

		Runnable r = () -> {
			for (int i = 1; i < 10; i++)
				System.out.println("Runnable Thread :" + i);
		};

		Thread th1 = new Thread(r);
		th1.start();

		th.join();
		th1.join();

		for (int i = 1; i < 10; i++)
			System.out.println("Main Thread :" + i);

		System.out.println("Name of th:" + th.getName());
		System.out.println("Name of th1:" + th1.getName());

	}

}
