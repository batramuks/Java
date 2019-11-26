package chainOfResponsibilty;

public class PresidentPurchaseHandler extends AbstractPurchaseHandler{

	@Override
	public void handleRequest(PurchaseRequest request) {
		if (request.getAmount() < THREE_HUNDERED) {
			System.out.println("President will Approve the amount : " + request.getAmount());
		} else if (successor != null) {
			successor.handleRequest(request);
		}

	}

}
