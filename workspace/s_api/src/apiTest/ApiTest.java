package apiTest;

public class ApiTest {
	static class test{
		int x;
		int y;
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 24);
		System.out.println(result);
	}
}
