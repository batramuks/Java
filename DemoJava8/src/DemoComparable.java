import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1> {
	private int empId;
	private String name;
	private String address;

	public Employee1(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public int compareTo(Employee1 e) {
		return name.compareTo(e.getName());
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
	public String toString() {
		return "Employee1 [empId=" + empId + ", name=" + name + ", address=" + address + "] \n";
	}
	
	}

public class DemoComparable {

	public static void main(String[] args) {

		Employee1 e = new Employee1(1, "Mukesh", "HCL-126");
		Employee1 e1 = new Employee1(2, "Yash", "");
		Employee1 e2 = new Employee1(3, "Shikha", "VLCC");

		ArrayList<Employee1> lst = new ArrayList<Employee1>();
		lst.add(e);
		lst.add(e1);
		lst.add(e2);
		
		Collections.sort(lst);
		System.out.println(lst);
		

	}

}
