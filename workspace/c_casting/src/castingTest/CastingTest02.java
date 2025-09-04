package castingTest;

public class CastingTest02 {
	public static void main(String[] args) {
		System.out.println("" + 3 + 8);// 이 경우 좌에서 우로 ""+ 3이 문자열로 바뀌면서  11이 아닌 38로 출력 

//		아래 코드를 수정하여 결과가 11이 나오도록 한다.
//		System.out.println("" + 3 + 8);
		System.out.println(3 + 8 + ""); // 이 경우 좌에서 우로 3+8이 먼저실행되서 11로 나오고 다시 ""를 만나서 문자열로 바뀐다
//		"1 + 3 = 4"
//		위의 문자열에서 4를 변수로 사용한다.
//		변수 선언 
//		아래 출력 메소드에서 사용한다.
		System.out.println("1 + 3 =");
//		출력 결과 : "1 + 3 = 4"
		int sum = 4; 
		System.out.println("1 + 3 = " + sum); // 변수는 값으로 사용가능하다.
	}
}
