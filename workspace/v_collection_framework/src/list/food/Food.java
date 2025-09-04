package list.food;

public class Food {
	private String name;
	private int price;
	private String type;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Food(Food food) {
		this(food.getName(),food.getPrice(),food.getType());
	}
	public Food(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	
}
