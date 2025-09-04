package constantTest;

public class ConstantTest {
	public static void main(String[] args) {
//		상수 부분으로 절대 변하지 않는 부분을 선언할 때는 final을 사용
//		사용하면 나중에 다시 선언할 수 없음 오류가 생기도록 나옴 
//		보통 대문자를 사용하고 뛰어쓰기는 언더바(_)로 표현한
		final int ON = 187568;
		final int OFF = 187455;
// 		ON = 123;
 		System.out.println(ON);
		System.out.println(OFF);

//		로그인 실패 : 0
//		로그인 성공 : 1
//		관리자 : 2
		final int LOGIN_SUCCESS = 1;
		final int LOGIN_FAIL = 0;
		final int ADMIN = 2;
//		상수도 다른 변수와 동일하게 출력 가능 
		System.out.println(LOGIN_SUCCESS);
		System.out.println(LOGIN_FAIL);
		System.out.println(ADMIN);
	}
}
