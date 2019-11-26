package decorator;

class Farmhouse extends Pizza {
	public Farmhouse() {
		description = "FarmHouse";
	}

	public int getCost() {
		return 200;
	}
}
