package chainOfResponsibilty;

public class ManagerPurchaseHandler extends AbstractPurchaseHandler{

	@Override
	public void handleRequest(PurchaseRequest request) {
		if (request.getAmount() < ONE_HUNDERED) {
			System.out.println("Manager will Approve the amount : " + request.getAmount());
		} else if (successor != null) {
			successor.handleRequest(request);
		}

	}

}
