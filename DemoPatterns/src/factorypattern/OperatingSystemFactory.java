package factorypattern;

public class OperatingSystemFactory {
	public OperatingSystem getInstance(String str) {

		OperatingSystem os = null;

		if (str.equalsIgnoreCase("Andriod"))
			os = new Android();
		else if (str.equalsIgnoreCase("IOS"))
			os = new IOS();
		else
			os = new Windows();

		return os;
	}

}
