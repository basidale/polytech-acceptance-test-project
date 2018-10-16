import java.util.ArrayList;

public class Cookie {
	private double _price;
	private String _name;
	public Ingredient _has_dough;
	public Ingredient _has_cooking;
	public OrderElement _unnamed_OrderElement_;
	public Ingredient _has_flavour;
	public ArrayList<Ingredient> _has_topping = new ArrayList<Ingredient>();
	public Ingredient _has_mix;

	public double getPrice() {
		return this._price;
	}
}