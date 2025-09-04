package arrayTest;

import java.util.Scanner;

public class ArTask02 {
	public static void main(String[] args) {
////		1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		int[] intArr = new int[100];
//		int sum = 0;
//		int test = 0;
//
//		for (int i = 0; i < intArr.length; i++) {
//			intArr[i] = i + 1;
//		}
//
//		for (int i = 0; i < 50; i++) {
//			sum += intArr[i * 2 + 1];
//		}
////		0 1 2 3 4 5 6  ... 99
//		for (int i = 0; i < intArr.length; i += 2) {
//			test += intArr[i + 1];
//		}
//		System.out.println(sum);
//		System.out.print(test);
//		System.out.println("\n===============================");
////      A ~ F까지 배열에 담고 출력
//		char[] cArr = new char[6];
//
//		for (int i = 0; i < cArr.length; i++) {
//			cArr[i] = (char) (65 + i);
//		}
//
//		for (int i = 0; i < cArr.length; i++) {
//			System.out.print(cArr[i] + " ");
//		}
////      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
////		A B C D E F
////		0  1 2  3  4 5
//
//		System.out.println("\n===============================");
//		char[] chArr = new char[5];
////		강제 형변환
//		for (int i = 0; i < chArr.length; i++) {
//			chArr[i] = i < 2 ? (char) (65 + i) : (char) (66 + i);
//		}
//
//		for (int i = 0; i < chArr.length; i++) {
//			System.out.print(chArr[i] + " ");
//		}
//		System.out.println("\n===============================");
////		자동 형변환으로 
//		for (char i = 'A'; i < 'G'; i++) {
//			if (i == 'C')
//				continue;
//			System.out.print(i + " ");
//		}
////		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
////		단, 같은 수는 없다고 가정한다.
//
//		System.out.println("\n===============================");
//
//		int[] scArr = new int[5];
//		String msg = "5개의 정수를 입력해주세요.";
//		String exMsg = "0 이상 999이하인 정수";
//		Scanner scanner = new Scanner(System.in);
//		int max = 0; // 큰 값을 저장하기 위한 공간 초기값을 최소로 적용해야 값이 들어오기 때문에 저장
//		int min = 999; // 작은 값을 저장하기 위한 공간 초기값을 최대로 적용해야 값이 들어오기 때문에 저장
//		System.out.println(msg);
//		System.out.println(exMsg);
//
//		// 길이만큼 정수를 받기 위해서 for문을 사용해서 입력 받기
//		for (int i = 0; i < scArr.length; i++) {
//			scArr[i] = scanner.nextInt();
//		}
//
////		길이만큼 배열을 검사해서 조건마다 값 각 변수 max, min값을 변경해주기 
//		for (int i = 0; i < scArr.length; i++) {
//			max = scArr[i] > max ? scArr[i] : max;
//			min = scArr[i] < min ? scArr[i] : min;
//		}
//		System.out.print("max : " + max + ", min :  " + min);
//
//		System.out.println("\n===============================");
//
////		사용자에게 칸 수를 입력받고, 그 칸 수 만큼 정수를 다시 입력 받는다.
////		입력한 정수들의 평균값을 구한다.
//		int length = 0; // 입력받을 길이 저장공간
//		int[] scArr1 = null; // 입력 값과 길이를 모르기때문에 일단 Null
//		int total = 0; // 합 저장 공간
//		double avg = 0.0; // 평균이므로 실수로 선언
//		String infoMsg = "사용할 배열의 길이를 입력해주세요.";
//		String inputMsg = "입력한 길이만큼 정수를 입력해주세요.";
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println(infoMsg);
//
////		길이를 입력받기 
//		length = sc.nextInt();
////		입력받은 길이를 넣어서 배열 생성하기 
//		scArr1 = new int[length];
//
//		System.out.println(inputMsg);
////		입력받은 길이만큼 배열에 값 넣어주기 
//		for (int i = 0; i < length; i++) {
//			scArr1[i] = sc.nextInt();
//		}
//
////		입력받은 길이만큼 for문 실행해서 다 더해주기 		
//		for (int i = 0; i < length; i++) {
//			total += scArr1[i];
//		}
//
////		총합에다가 길이를 나누어서 평균 구하기 
//		avg = (double) total / length;
//
//		System.out.print("평균 : " + avg);
//
////		sc.close();
		
		System.out.println("\n===============================");

//		1 ~ 100까지 중 홀수만 배열에 담기
//		1 ~ 100까지 중 짝수만 배열에 담기
//		두 배열을 합쳐서 1 ~ 100까지 담긴 배열의 각 요소 출력하기 
		int[] evenArr = new int[50];
		int[] oddArr = new int[50];
		int[] numArr = new int[100];

		for (int i = 0; i < 50; i++) {
			evenArr[i] = (i + 1) * 2;
			oddArr[i] = (i + 1) * 2 - 1;
		}
//		1 2 3 4 5 6 7 ... 100
		for (int i = 0; i < 50; i ++) {
			numArr[i*2] = oddArr[i];
			numArr[i*2+1] = evenArr[i];
		}
		for(int i =0; i<100; i++) {
			System.out.println(numArr[i]);
		}
	}
}
