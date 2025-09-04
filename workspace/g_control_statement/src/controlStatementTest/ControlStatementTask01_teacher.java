package controlStatementTest;

import java.util.Scanner;

public class ControlStatementTask01_teacher {
	public static void main(String[] args) {

//      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.

		Scanner sc = new Scanner(System.in); // 입력 받기위한 Scanner 생성 
		String title = "Q. 당신이 좋아하는 색을 선택하세요."; // 질문 
		String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색"; // 선택지 
		int choice = 0; // 몇 번 선택했는지 받은 입력을 저장할 공간 
		String redMessage = "불같고 열정적이고 적극적이다."; 
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "잘못 입력하셨습니다.";
		String resultMessage = ""; // 결과 메시지 

		// boolean는 초기값이 false이다 
		boolean condition1 = false, condition2 = false;
		boolean condition3 = false, condition4 = false; 

		//먼저 질문과 선택지를 출력해준다. 
		System.out.println(title);
		System.out.println(menu);
		// 입력을 받아서 저장 nextInt로 자동 형변환 
		choice = sc.nextInt();
		// 조건 1, 2, 3, 4에 각각 같은 경우를 구분해준다.
		condition1 = choice == 1;
		condition2 = choice == 2;
		condition3 = choice == 3;
		condition4 = choice == 4;

		// 조건문을 통해 각 해당되는 조건에 따라 결과 메시지를 저장하고 만약 위에서 참이 나오면 아래 나오는 것들은 실행하고 넘어감 
		if (condition1) {
			resultMessage = redMessage;

		} else if (condition2) {
			resultMessage = yellowMessage;

		} else if (condition3) {
			resultMessage = blackMessage;

		} else if (condition4) {
			resultMessage = whiteMessage;

		} else {
			resultMessage = errorMessage;
		}
//		결과 메시지 출력 
		System.out.println(resultMessage);

	}
}
