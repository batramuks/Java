package chainOfResponsibilty;

public class Client {

	public static void main(String[] args) {

		ManagerPurchaseHandler manager = new ManagerPurchaseHandler();
		DirectorPurchaseHandler director = new DirectorPurchaseHandler();
		PresidentPurchaseHandler president = new PresidentPurchaseHandler();
		
		manager.setSuccessor(director);
		director.setSuccessor(president);
		
		manager.handleRequest(new PurchaseRequest(50));
		manager.handleRequest(new PurchaseRequest(100));
		manager.handleRequest(new PurchaseRequest(250));
	}

}
