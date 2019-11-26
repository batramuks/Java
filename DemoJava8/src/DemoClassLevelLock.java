class Display1 {
	
	static synchronized void display(String name) throws InterruptedException {
		for (int i = 1; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(name + " :: " + i);
		}

	}
	

	
}
class MyThread2 extends Thread {

	private Display1 d;
	private String name;

	public MyThread2(Display1 d, String name) {
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

public class DemoClassLevelLock {
	
	public static void main(String[] args) throws InterruptedException {
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread2 th = new MyThread2(d1, "Thread 1");
		MyThread2 th1 = new MyThread2(d2, "Thread 2");
		th.start();
		th1.start();
		
		
		
		}

}


