import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employe {
	private int empId;
	private String name;
	private int salary;
	private int age;
	private String  dept;
	
	public Employe(int empId, String name, int salary, int age, String dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dept=" + dept
				+ "]\n";
	}
	
	
	}
public class DemoComparator {

	public static void main(String[] args) {
		/**
	     * Comparator to sort employees list or array in order of Salary
	     */
	    Comparator<Employe> salaryComparator = new Comparator<Employe>() {

	        @Override
	        public int compare(Employe e1, Employe e2) {
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    };

	    /**
	     * Comparator to sort employees list or array in order of Age
	     */
	    Comparator<Employe> ageComparator = new Comparator<Employe>() {

	        @Override
	        public int compare(Employe e1, Employe e2) {
	            return e1.getAge() - e2.getAge();
	        }
	    };


	    Comparator<Employe> nameComparator=(e1,e2)->e1.getName().compareTo(e2.getName());
	    
	    
		Employe e = new Employe(1, "Mukesh", 10000,37,"Admin");
		Employe e1 = new Employe(2, "Yash Seth", 20000,2,"IT");
		Employe e2 = new Employe(3, "Lokesh", 3000,37,"Admin");
		
		Employe e3 = new Employe(4, "Mukesh", 10000,37,"Infra");
		Employe e4 = new Employe(5, "Yash Batra", 20000,2,"IT");
		Employe e5 = new Employe(6, "Daksh", 3000,37,"IT");
		
		ArrayList<Employe> lst = new ArrayList<Employe>();
		
		lst.add(e);
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		
		Collections.sort(lst,nameComparator);
		System.out.println(lst);
		Collections.sort(lst,ageComparator);
		System.out.println(lst);
		Collections.sort(lst,salaryComparator);
		System.out.println(lst);
		
		Comparator groupCompare=Comparator.comparing(Employe::getDept).thenComparing(Employe::getName);
		
		Collections.sort(lst,groupCompare);
		System.out.println(lst);
	}

}
