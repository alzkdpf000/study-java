package classTest;

public class Cupang {

	int pricePerKg;
	int price;

	Cupang(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	void deliver(Box[] box) {
		for(int i = 0 ; i< box.length; i++) {
			this.price += box[i].kg * this.pricePerKg;
		}
	}
}
