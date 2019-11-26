class SharedPrinter {

	public volatile boolean isOdd;
	private Integer count = 1;

	synchronized void oddPrint() throws InterruptedException {

		while (count < 100) {
			if (!isOdd) {
				System.out.println("Odd Thread :: " + count);
				this.wait();
			}
			count++;
			isOdd = false;
			this.notify();
		}
	}

	synchronized void evenPrint() throws InterruptedException {

		while (count < 100) {
			if (isOdd) {
				this.wait();
			}
			count++;
			System.out.println("Even Thread :: " + count);
			isOdd = true;
			this.notify();
		}

	}
}

class EvenThread extends Thread {

	private String name;
	private SharedPrinter sp;

	public EvenThread(String name, SharedPrinter sp, boolean isOdd) {
		super();
		this.name = name;
		this.sp = sp;
		sp.isOdd = isOdd;
	}

	public void run() {
		try {
			sp.evenPrint();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class OddThread extends Thread {

	private String name;
	private SharedPrinter sp;

	public OddThread(String name, SharedPrinter sp, boolean isOdd) {
		super();
		this.name = name;
		this.sp = sp;
		sp.isOdd = isOdd;
	}

	public void run() {
		try {
			sp.oddPrint();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class DemoEvenOddThread {

	public static void main(String[] args) {
		SharedPrinter sp = new SharedPrinter();

		EvenThread eth = new EvenThread("Even Thread", sp, true);
		OddThread oth = new OddThread("Odd Thread", sp, false);

		eth.start();
		oth.start();

	}

}
