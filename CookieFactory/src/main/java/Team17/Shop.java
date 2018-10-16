import java.util.ArrayList;

public class Shop {
	private int _shopId;
	private String _address;
	public ArrayList<Order> _concerns = new ArrayList<Order>();
	public State _located;
	public ArrayList<Schedules> _has = new ArrayList<Schedules>();

	public void addOrder(Object aOrder) {
		throw new UnsupportedOperationException();
	}
}