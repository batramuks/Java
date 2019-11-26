import java.util.HashMap;
import java.util.Map;

public class DemoJVMOutofMemory {
	private final static int NO_ITERATIONS = 5000000;
	private final static String LEAKING_DATA = "abc";
	private final static Map<String, String> leakingMap;

	static {
		leakingMap = new<String, String> HashMap();
	}

	public static void main(String str[]) {
		System.out.println("JVM Out of Memory Simulator");
		System.out.println();
		System.out.println();

		try {
			for (int i = 0; i < NO_ITERATIONS; i++) {
				String data=LEAKING_DATA+i;
				leakingMap.put(data, data);
			}

		} catch (Throwable e) {
			if(e instanceof java.lang.OutOfMemoryError){
				System.out.println("Out Of Memory Error :: " + e.getMessage());
			}else{
				System.out.println("Unexpected" + e.getMessage());
			}
		}
	}

}
