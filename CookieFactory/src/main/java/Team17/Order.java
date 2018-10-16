import java.util.ArrayList;
import java.time.LocalDateTime;

public class Order {
	private int _orderId;
	private LocalDateTime _retrievingDate;
	private boolean _discount;
	private boolean _retrieved;
	public Customer _makes;
	public ArrayList<OrderElement> _unnamed_OrderElement_ = new ArrayList<OrderElement>();
	public Shop _concerns;

	public int getId() {
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getRetrievingDate() {
		return this._retrievingDate;
	}

	public void setDiscount(boolean aValue) {
		this._discount = aValue;
	}

	public void setRetrieved() {
		throw new UnsupportedOperationException();
	}

	public void addElement(OrderElement aElement) {
		throw new UnsupportedOperationException();
	}

	public String getPurchaseOrder() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public int quantityOfCookies() {
		throw new UnsupportedOperationException();
	}
}
