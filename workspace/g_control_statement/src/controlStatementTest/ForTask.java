package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		반복의 핵심은 반복횟수 최소화이다.
//		브
//		1 ~ 100
//		100 ~ 1
//		1 ~ 100 중 짝수
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + 1);
//		}

		/*
		 * for (int i = 100; i > 0; i--) { System.out.println(i); }
		 */

		/*
		 * for (int i = 1; i % 2 == 0 && i < 101; i++) {// 2 4 6 8 10 12 14 ...
		 * System.out.println(i); // 이거는 100번 반복
		 * 
		 * }
		 */

		/*
		 * for (int i = 0; i < 50; i++) { System.out.println((i + 1) * 2);// 이거는 50번 반복
		 * }
		 */

		/*
		 * // 이거도 50번 반복 for (int i = 0; i <= 98; i += 2) { System.out.println(i + 2); }
		 */

//		짝수 2의 배수
//		홀수 2의 배수가 아니다	
//		2의 배수란 2로 나누었을 때 나머지가 0인 수이다.
//		나머지 연산자 : %(모듈러스)
//		예시) 10 % 3 == 1

//		실
//		1 ~ 10까지 합 출력
//		1 ~ n까지 합 출력 

		/*
		 * int sum = 0;
		 * 
		 * for (int i = 1; i < 11; i++) { sum += i; }
		 * 
		 * System.out.println(sum);
		 */

		/*
		 * int num = 0; // 입력저장공간 int sum2 = 0; // 1~n의 합을 저장할 공간
		 * 
		 * Scanner scanner = new Scanner(System.in); num = scanner.nextInt(); // 자동 정수
		 * 변화
		 * 
		 * // 1부터 N까지 더하기 위해서 +1을 해준다. for (int i = 1; i < num + 1; i++) { sum2 += i; }
		 * 
		 * System.out.println(sum2);
		 * 
		 * scanner.close();
		 */

//		골

//		A ~  F까지 출력
		/*
		 * int A = "A".charAt(0); char a = ' ';
		 * 
		 * for (int i = 65; i < 71; i++) { a = (char) i; System.out.println(a); }
		 */

		/*
		 * 강사님 버전 for(int i =0; i< 6; i++) { System.out.println((char)(65+i)); }
		 */

//		A ~  F까지 중 C 제외하고 출력
//		65 66 67 68 69 70
//		A  B   C   D  E  F
		/*
		 * System.out.println(A); for (int i = 65; i < 71; i++) { if (i != 67) { a =
		 * (char) i; System.out.println(a); } }
		 */

//		강사님 버전 이거는 5번 반복 
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println((char) ((i > 1 ? 66 : 65)));
		 * }
		 */

//		다
//		0 1 2 3 0 1 2 3  0 1 2 3 출력
		for (int i = 0; i < 12; i++) {
			System.out.printf("%d ", i % 4);
		}

		for (int i = 0; i < 12; i++) {
			
		}
//		aBcDeFgH...Z출력
//		 A 65 a 97 Z 90
		System.out.println();
		for (int i = 0; i < 26; i++) {
			int idx = 65 + i;
			char c = (char) (idx % 2 == 0 ? idx : idx + 32);
			System.out.printf("%c ", c);
		}
	}
}
