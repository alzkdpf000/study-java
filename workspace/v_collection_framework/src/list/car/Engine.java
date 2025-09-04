package list.car;

public class Engine {
	private String model;
	private int	hp;
	private String fuelType;
	public Engine() {;}
	public Engine(Engine engine) {
		this(engine.getModel(),engine.getHp(),engine.getFuelType());
	}
	public Engine(String model, int hp, String fuelType) {
		super();
		this.model = model;
		this.hp = hp;
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", hp=" + hp + ", fuelType=" + fuelType + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
