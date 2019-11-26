import java.util.HashMap;
import java.util.Map;

class Employee {
	private int empId;
	private String name;
	private String address;

	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class DemoCustomKey {

	public static void main(String str[]) {

		Employee e = new Employee(1, "Mukesh", "HCL-126");
		Employee e1 = new Employee(2, "Mukesh", "");
		Employee e2 = new Employee(3, "Shikha", "VLCC");

		Map hm = new HashMap<Employee, String>();
		
		hm.put(e, "Nice");
		hm.put(e1, "Average");
		hm.put(e2, "Good");

		System.out.println(hm.values());

	}
}
