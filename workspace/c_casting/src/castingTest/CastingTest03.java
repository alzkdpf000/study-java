package castingTest;

public class CastingTest03 {
	public static void main(String[] args) {
		//정수처럼 문자열을 정수로 바꾸어서 14로 나오게 한다  
		System.out.println(Integer.parseInt("10") + 4);
		// 실수처럼 보이는 문자열을 실수로 바꾸기 위한 메소드 따라서 이 결과는 5.55가 나온다.
		System.out.println(Double.parseDouble("2.55") + 3);
	}
}
