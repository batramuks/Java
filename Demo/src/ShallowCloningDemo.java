class School {
	int i = 0;
	Address add;
}

class Address {
	int j = 0;

}

public class ShallowCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		School s= new School();
		//School s1=(School) s.clone();
	}

}
