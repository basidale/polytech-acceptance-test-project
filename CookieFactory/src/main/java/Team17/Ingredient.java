import java.util.ArrayList;

public class Ingredient {
	private double _price;
	private String _name;
	public ArrayList<Cookie> _has_flavour = new ArrayList<Cookie>();
	public ArrayList<Cookie> _has_topping = new ArrayList<Cookie>();
	public ArrayList<Cookie> _has_mix = new ArrayList<Cookie>();
	public IngredientType _has;
	public ArrayList<Cookie> _has_dough = new ArrayList<Cookie>();
	public ArrayList<Cookie> _has_cooking = new ArrayList<Cookie>();
}