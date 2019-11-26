import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NewClass1 {

	private int i;

	NewClass1() {
		i = 10;
	}

	int getVal() {
		return i;
	}

	void setVal(int i) {
		this.i = i;
	}
}

class DemoSerialization extends NewClass1 implements Serializable {

	private String s;
	private NewClass1 n;

	DemoSerialization(String s) {
		this.s = s;
		setVal(20);
	}

	public String toString() {
		return s + " " + getVal();
	}

	public static void main(String args[]) {
		DemoSerialization m = new DemoSerialization("Serial");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"));
			oos.writeObject(m); // writing current stat
			oos.flush();
			oos.close();
			System.out.print(m); // display current state object value
		} catch (IOException e) {
			System.out.print(e);
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"));
			DemoSerialization o = (DemoSerialization) ois.readObject();
		   
																		// saved
																		// object
			ois.close();
			System.out.print("DeS"+o); // display saved object state
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
