package decorator;

class PizzaStore {
	public static void main(String args[]) {
		// create new margherita pizza
		Pizza pizza = new Margherita();
		System.out.println(pizza.getDescription() + " Cost :" + pizza.getCost());
		// create new FarmHouse pizza
		Pizza pizza2 = new Farmhouse();
		System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());

		// decorate it with freshtomato topping
		pizza = new FreshTomato(pizza);

		// decorate it with paneer topping
		pizza = new Paneer(pizza);

		System.out.println(pizza.getDescription() + " Cost :" + pizza.getCost());

		// decorate it with freshtomato topping
		pizza2 = new FreshTomato(pizza2);

		// decorate it with paneer topping
		pizza2 = new Paneer(pizza2);

		System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());

	}
}
