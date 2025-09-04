package intputTest;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//		사용자에게 어떤 내용을 입력해야하는지 보여줄 메시지
		String msg = " 두 정수의 곱";
		String example = "예)4 5";
//		출력물을 서식표현을 사용하여 선언 
		String format = "%d * %d = %d";
//		입력받을 두 수를 저장할 공간 확보 이런 식으로 선언도 가능  
		int num1 = 0, num2 = 0;
//		두 수의 곱을 저장할 공간 확보 
		int result = 0;
//		   입력을 받기 위한 클래스 Scanner 선언 
		Scanner sc = new Scanner(System.in);
//		사용자에게 어떤 내용을 입력하는 메시지 보여주기 
		System.out.println(msg);
		System.out.println(example);
//		next()로 받으면 스페이스바,공백 등으로 구분하기 떄문에 여기서는 두 수를 적으므로 2번 적어준다 
//		그리고 입력은 문자열로 들어오기 때문에 정수로 바꿔줘야한다.
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
//		두 수의 곱을 저장 
		result = num1 * num2;
//		곱을 출력  printf를 사용하여 위에 미리 선언한 서식표현을 사용하여 출력 
		System.out.printf(format, num1, num2, result);
//		다 사용한 Scanner는 종료해주기 
		sc.close();
	}
}
