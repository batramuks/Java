package chainOfResponsibilty;

public abstract class AbstractPurchaseHandler {

	protected static final double ONE_HUNDERED = 100.0;
	protected static final double TWO_HUNDERED = 200.0;
	protected static final double THREE_HUNDERED = 300.0;

	protected AbstractPurchaseHandler successor;

	public void setSuccessor(AbstractPurchaseHandler successor) {
		this.successor = successor;
	}

	abstract public void handleRequest(PurchaseRequest request);

}
