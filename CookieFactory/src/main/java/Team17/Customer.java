import java.util.ArrayList;

public class Customer {
	private int _customerId;
	private String _paymentCardCode;
	private boolean _loyalty;
	private boolean _loyaltyDiscount;
	public ArrayList<Order> _makes = new ArrayList<Order>();
	public ArrayList<CartElement> _unnamed_CartElement_ = new ArrayList<CartElement>();

	public int getId() {
		throw new UnsupportedOperationException();
	}

	public String getPaymentCardCode() {
		return this._paymentCardCode;
	}

	public boolean isLoyal() {
		throw new UnsupportedOperationException();
	}

	public void setLoyal(boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public boolean hasLoyaltyDiscount() {
		throw new UnsupportedOperationException();
	}

	public void setLoyaltyDiscount(boolean aValue) {
		this._loyaltyDiscount = aValue;
	}

	public CartElement[] getCart() {
		throw new UnsupportedOperationException();
	}

	public void updateCart(Cookie aRecipe, int aQuantity) {
		throw new UnsupportedOperationException();
	}

	private int quantityInCart(Cookie aRecipe) {
		throw new UnsupportedOperationException();
	}

	private void addCartElement(CartElement aCartElement) {
		throw new UnsupportedOperationException();
	}

	private void removeFromCart(Cookie aCookie) {
		throw new UnsupportedOperationException();
	}

	private void findCartElement(Cookie aCookie) {
		throw new UnsupportedOperationException();
	}
}