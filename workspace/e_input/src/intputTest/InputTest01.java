package intputTest;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
//		사용자에게 어떤 내용을 입력해야하는지 보여줄 메시지
		String nameMsg = "이름을 입력해주세요:";
//		이름 저장할 공간 확보 
		String name = "";
//		결과 메시지 공간 확보 
		String resultMsg = " ";
//		입력을 받기 위한 클래스 Scanner 선언 
		Scanner sc = new Scanner(System.in);
//		출력해서 입력하라고알려주기 
		System.out.print(nameMsg);
//		입력받은 이름 저장하기 
		name = sc.next();
//		결과 메시지를 저장해주기 
		resultMsg = name + "환영합니다.";
//		결과 메시지 출력 
		System.out.println(resultMsg);
//		다 사용한 Scanner는 종료해주기 
		sc.close();
	}
}
