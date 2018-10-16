import java.util.ArrayList;
import java.time.LocalDateTime;

public class COD {
	public ArrayList<Order> _knows = new ArrayList<Order>();
	public ArrayList<Cookie> _offers = new ArrayList<Cookie>();
	public Cookie _offers_monthly;

	public void order(int aCustomerId, int aShopId, LocalDateTime aRetrievingDate) {
		throw new UnsupportedOperationException();
	}

	public void deliverAnOrder(int aOrderId) {
		throw new UnsupportedOperationException();
	}

	public void updateCart(int aCustomerId, int aRecipeId, int aQuantity) {
		throw new UnsupportedOperationException();
	}

	private Customer findCustomerById(int aCustomerId) {
		throw new UnsupportedOperationException();
	}

	private Shop findShopById(int aShopId) {
		throw new UnsupportedOperationException();
	}

	private Cookie findRecipeById(int aRecipeId) {
		throw new UnsupportedOperationException();
	}

	private Order findOrderById(int aOrderId) {
		throw new UnsupportedOperationException();
	}

	private LocalDateTime getCurrentTime() {
		throw new UnsupportedOperationException();
	}
}
