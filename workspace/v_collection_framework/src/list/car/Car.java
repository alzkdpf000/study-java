package list.car;

public class Car {
	private String name;
	private int price;
	private String type;
	private Engine engine;
	public Car() {
	}
	public Car(Car car) {
		this(car.getName(),car.getPrice(),car.getType(),new Engine(car.getEngine()));
	}
	public Car(String name, int price, String type, Engine engine) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.engine = engine;
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
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", type=" + type + ", engine=" + engine + "]";
	}
	
}
