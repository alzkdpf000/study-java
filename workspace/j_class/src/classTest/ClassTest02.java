package classTest;

class Car {
	String brand;
	String color;
	int price;

	Car(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	Car(int price, String color) {
		this.price = price;
		this.color = color;
	}

	Car(String color) {
		this.color = color;
	}

	void printInfo() {
		System.out.println(brand + ", " + price + ", " + color);
	}
}

public class ClassTest02 {

	public static void main(String[] args) {
		Car mom = new Car("Benz", 15000, "Black");
		Car daddy = new Car("BMW", 20000, "White");
		Car mine = new Car(30000, "Blue");

		mom.printInfo();
		daddy.printInfo();
		mine.printInfo();
	}

}
