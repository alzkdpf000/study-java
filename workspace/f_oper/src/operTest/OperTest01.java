package operTest;

public class OperTest01 {
	public static void main(String[] args) {
		
		boolean isTrue = 10 == 11; // 같지 않으므로 거짓 값으로 사용해서 대입 가능
		boolean result = isTrue && 10 <=20; // &&는 앞에 식이 참이면 뒤 조건은 다 무시함
		
		System.out.println(10 == 11); // 거짓을 출력 
		System.out.println(10 > 3); // 참을 출력 
		System.out.println(isTrue); // 거짓을 출력 
		System.out.println(result); // 참을 출력 
//		isTrue && 10 <=  20의 결과를 true가 나오도록 변경하기
//		단 숫자는 변경하지 않는다.
		
		System.out.println(!(isTrue && 10 <=20)); // not 연산자 사용   
		System.out.println(isTrue || 10 <=20); // or 연산자 사용
	}
}
