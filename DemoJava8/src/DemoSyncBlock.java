class Print {

	void print(String name) throws InterruptedException {
		synchronized (this) {
			for (int i = 1; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(name + " :: " + i);
			}
		}

	}

}

class MyThread11 extends Thread {

	private Print d;
	private String name;

	public MyThread11(Print d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	public void run() {
		try {
			d.print(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DemoSyncBlock {

	public static void main(String[] args) throws InterruptedException {
		Print d = new Print();

		MyThread11 th = new MyThread11(d, "Thread 1");
		MyThread11 th1 = new MyThread11(d, "Thread 2");
		th.start();
		th1.start();

	}

}
