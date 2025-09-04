package operTest;

import java.util.Scanner;

public class OperTest02 {
	public static void main(String[] args) {
//		두 정수 입력받기(nextInt())
		Scanner scanner = new Scanner(System.in); // 입력받기 위한 scanner 생성 
		String msg = "두 정수를 입력하세요 \n 예)2 5"; // 예시 이미지 
		int num1 = 0;  // 저장공간 
		int num2 = 0; // 저장공간 
//		int result = 0; // 삼항연산자 결과 저장공간 
		String result = "";
		System.out.println(msg); // 메시지 출력 
		num1 = scanner.nextInt(); // 정수로 자동변환 
		num2 = scanner.nextInt(); // 정수로 자동변환 
		
		
		System.out.println(num1); // 확인 용
		System.out.println(num2); // 확인 용

//		두 정수 비교
//		더 큰 값을 출력한다
//		추가할 부분 두 수가 같을 경우 "두 수가 같습니다." 출력
		result = num1 > num2 ? ""+num1 : num1 == num2  ? "같습니다." : ""+ num2; // 결과저장 
		System.out.println(result); // 결과 출력 
		
		
	}
}
