package chainOfResponsibilty;

public class DirectorPurchaseHandler extends AbstractPurchaseHandler {

	@Override
	public void handleRequest(PurchaseRequest request) {
		if (request.getAmount() < TWO_HUNDERED) {
			System.out.println("Director will Approve the amount : " + request.getAmount());
		} else if (successor != null) {
			successor.handleRequest(request);
		}

	}

}
