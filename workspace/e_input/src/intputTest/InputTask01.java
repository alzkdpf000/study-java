package intputTest;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {

//		반려동물 이름을 입력받고 출력하기
		String petMsg = "반려동물 이름을 입력하세요 : ";
//		반려동물 이름 저장할 공간 확보 
		String petName = "";
//		결과 메시지 공간 확보 
		String resultMsg = "";
//	   입력을 받기 위한 클래스 Scanner 선언 
		Scanner sc = new Scanner(System.in);
//		출력해서 입력하라고알려주기 
		System.out.print(petMsg);
//	   입력받은 반려동물 이름 저장하기 
		petName = sc.next();
//		결과 메시지를 저장해주기 
		resultMsg = petName + "라고 합니다.";
//		결과 메시지 출력 
		System.out.println(resultMsg);
//		다 사용한 Scanner는 종료해주기 
		sc.close();
	}
}
