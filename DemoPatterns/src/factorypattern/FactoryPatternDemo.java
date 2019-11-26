package factorypattern;
public class FactoryPatternDemo {

	public static void main(String[] args) {

		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OperatingSystem os= osf.getInstance("IOS");
		os.getSpecification();
	}

}
