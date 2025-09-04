package classTest;

public class Order {
	int orderNo;
	Product[] products;
	int total;

	Order(int orderNo, Product[] products) {
		this.orderNo = orderNo;
		this.products = products;
		for (int i = 0; i < products.length; i++) {
			Product pr = products[i];
			total += pr.price * pr.stock;
		}
	}
}
