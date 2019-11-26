class Display {
	
	synchronized void display(String name) throws InterruptedException {
		for (int i = 1; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(name + " :: " + i);
		}

	}
	
}
class MyThread1 extends Thread {

	private Display d;
	private String name;

	public MyThread1(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	public  void run() {
		try {
			d.display(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DemoSyncronization {
	
	public static void main(String[] args) throws InterruptedException {
		Display d = new Display();

		MyThread1 th = new MyThread1(d, "Thread 1");
		MyThread1 th1 = new MyThread1(d, "Thread 2");
		th.start();
		th1.start();
		
		}

}
