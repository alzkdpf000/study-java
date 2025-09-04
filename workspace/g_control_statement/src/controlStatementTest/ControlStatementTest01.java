package controlStatementTest;

import java.util.Scanner;

public class ControlStatementTest01 {
	public static void main(String[] args) {

//		두 정수 입력받기(nextInt())
		Scanner scanner = new Scanner(System.in); // 입력받기 위한 scanner 생성
		String msg = "두 정수를 입력하세요 \n 예)2 5"; // 예시 이미지
		int num1 = 0; // 저장공간
		int num2 = 0; // 저장공간
//		int result = 0; // 삼항연산자 결과 저장공간 
		String result = "";
		System.out.println(msg); // 메시지 출력
		num1 = scanner.nextInt(); // 정수로 자동변환
		num2 = scanner.nextInt(); // 정수로 자동변환

		System.out.println(num1); // 확인 용
		System.out.println(num2); // 확인 용

		if (num1 > num2) { // num1이 더 큰 경우
			System.out.println("큰 값: " + num1);
		}else if(num1 < num2) { // num2가 큰 경우
			System.out.println("큰 값: " + num2);
		}else { // num1 num2가 같은 경우 
			System.out.println("두 수는 같습니다 ");			
		}

	}
}
