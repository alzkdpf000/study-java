package classTest;

class A {
	// 전역 변수 (global variable) 
	// 자동 초기화가 된다.
	// 프로그램이 종료 시 메모리 해제 
	int data; 

	void printData() {
		// 지역 변수(local variable) 
		// 직접 초기화를 해줘야 한다. 
		// 해당 영역이 끝날 때  
		int data = 10; 
		System.out.println(data); // 이거는 지역 변수 값을 가져오고 
		System.out.println(this.data); // 이거는 전역 변수 값을가져온다 . 
	}

}

public class ClassTest01 {
//	프로그램을 만들어 주는 메소드 
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();
		A a2 = new A();

		
		a.printData();
		a1.printData();
		a2.printData();
	}
}
