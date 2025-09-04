package intputTest;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력을 위한 스캐너를 생성 
		String msg = "이름을 입력해주세요."; // 입력할 값 알려주기 
		String name = ""; // 입력 값  저장공간 
		
//		 nextLine은 앞에서의 엔터(\n)을 먹기 때문에 기존 입력 알고리즘에 문제가 생김 
//		따라서 nextLine()으로 입력 받기 전 다른 입력이 실행되었다면,
//		반드시 \n을 먹어줄 nextLine()을 사용해준다 
		System.out.println(msg); // 메시지보여주기 
 		name = scanner.nextLine(); // 이름 입력 받고 공백을 구분점으로 취급 안함 
		
 		
		System.out.println(name); // 입력받은 이름 보여주기 
		scanner.close();
	}
}
