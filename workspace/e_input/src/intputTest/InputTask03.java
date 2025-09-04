package intputTest;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
//		 3개의 정수를 한 번에 입력받은 후 덧셈 결과출력
//		 nextInt() 사용하기
//		입력 값이 무엇인지 알려주기
		String msg = "3개의 정수를 입력하세요.";
		int num1 = 0; // 첫 번째 값 저장할 공간 
		int num2 = 0;// 두 번째 값 저장할 공간
		int num3 = 0;//세 번째 값 저장할 공간 
		int result = 0; // 3개의 정수를 더하고 나서 저장할 공간 
//		   입력을 받기 위한 클래스 Scanner 선언 
		Scanner scanner = new Scanner(System.in);
//		사용자에게 어떤 내용을 입력하는 메시지 보여주기 
		System.out.print(msg);
//		next()로 받으면 스페이스바,공백 등으로 구분하기 떄문에 여기서는 3 정수를 적으므로 3번 적어준다
//		nextInt() 자동으로 int형으로 바꿔준다.
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
//		세 정수를 더하고 나서 result에 저장한다
		result = num1 + num2 + num3;
//		결과를 저장한 result를 값으로 사용하여 출력 
		System.out.println("3개의 정수 합 : " + result);
//		다 사용한 Scanner는 종료해주기 
		scanner.close();
	}
}