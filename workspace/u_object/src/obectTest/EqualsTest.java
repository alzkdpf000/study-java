package obectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Customer customer = new Customer(1,"test");
		
		boolean isSame = customer.equals(new Customer(1,"test"));
		
		System.out.println(isSame);// 이렇게 하면 object의 equals를 쓰기 떄문에 주소값을 비교한다
		// 그래서 false가 나옴 그래서 재정의를 해줘야 한다.
	}
}
