interface MyInterf{
	
	public DemoMethodRef print();
}

public class DemoMethodRef {

	DemoMethodRef() {
		System.out.println("Hello Constructor");
	}

	public static void refMethod() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child Thread");
	}

	public static void main(String str[]) {

		/***
		 * run() method of Runnable is referred by refMethod(), only argument must match
		 ***/
		//Method Reference
		Runnable r = DemoMethodRef::refMethod;
		new Thread(r).start();
		
		//Constructor reference
		MyInterf mi=DemoMethodRef::new;
		mi.print();

	}

}
