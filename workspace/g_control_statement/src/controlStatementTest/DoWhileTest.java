package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		// 한 번은 일단 실행하고 나서 해야 하는 것들은 do-while을 쓰지만 거의 안쓴다. 
		String msg = "1.통신요금조회\n2.번호변경\n3.통신사 변경\n0.상담원연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println(msg);
			choice = sc.nextInt();
		} while (choice != 0);
	}
}
