package decorator;

class Paneer extends ToppingsDecorator {
	Pizza pizza;

	public Paneer(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Paneer ";
	}

	public int getCost() {
		return 70 + pizza.getCost();
	}
}
