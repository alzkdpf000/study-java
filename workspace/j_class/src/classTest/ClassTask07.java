package classTest;

//	상품을 여러개 주문한다.
//	상품 클래스
//	상품명
//	상품 가격 
//	상품 재고

//	주문 클래스
//	주문 번호
//	상품들 

// 주문할 때 결제할 총 금액 계산 
public class ClassTask07 {
	public static void main(String[] args) {
		Product[] products = { new Product("사과", 100, 1), new Product("바나나", 200, 2), new Product("배", 300, 3) };
		Order order = new Order(124223, products);
		System.out.println(order.total);

	}
}
