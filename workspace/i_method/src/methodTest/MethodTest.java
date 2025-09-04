package methodTest;

public class MethodTest {

	int f(int x) {
		return 2 * x + 1;
	}

	
	int subtract(int[] arNumber){
	int result = 0;
	
	arNumber[0] *= -1;
	
	for (int i = 0; i < arNumber.length; i++) {
		result -= arNumber[i];
	}
	return result;
}
// 		static ->  컴파일러가 가장 먼저 메모리에 할당해준다.
//		일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//		1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리에 올려준다.
//		2. 일반 메소드가 소속된 클래스를 Heap 메모리에 할당(new)하여 static이 찾을 수 있도록 한다.
//		즉, 메소드의 소속을 알려준다. 
	public static void main(String[] args) {
//		static을 사용하는 방법도 있지만 이 방식으로 힙 메모리에 올려서 사용한다. 
		MethodTest methodTest = new MethodTest();
//		int a = methodTest.f(2);
//		System.out.println(a);
		int[] c = {-1,-2,-3};
		methodTest.subtract(c);
		
	}
}
