package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
//		정수 입력받기 
//		5개까지만 입력 담을 수 있다.
//		6번째 정수가 담으면 오류가 발생
//		5칸 배열을 만들어서 해당 인덱스에 입력받은 정수를 받는다.
//		단, q를 입력하면 입력을 중단해준다.

//		if문은 딱 한 번만 사용하기 (q입력 시 나가기)
//		오류상황
//		6번째 정수 입력했을 때
//		정수가 아닌 다른 것을 입력했을 때(q 제외)
		int[] arNum = new int[5];
		Scanner scanner = new Scanner(System.in);
		String msg = "정수 5개 입력(q입력 시 나가기)";
		int idx = 0;
		String input = null;

		System.out.println(msg);
		
//			try {
//				while(true) {
//					input = scanner.next();
//					if(input.equals("q")) {
//						break;
//					}
//					arNum[idx++] = Integer.parseInt(input);	
//				}
//			} catch (NumberFormatException e) {
//				// TODO: handle exception
//				System.out.println("정수만 입력해주세요.");
//			}catch (IndexOutOfBoundsException e) {
//				// TODO: handle exception
//				System.out.println("5번만 입력해주세요");
//		}

		
		while (true) {
			try {
				input = scanner.next();
				if (input.equals("q")) {
					break;
				}
				arNum[idx++] = Integer.parseInt(input);
				System.out.println(idx +" 번재 정수 " + input);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요.");
				idx--;
			} catch (IndexOutOfBoundsException e) {
//				5개이상 입력했는데 6번째를 입력하면 입력한 수 보여주고 다시 입력하게 할건지 말건지 고민  
				System.out.println("5번만 입력해주세요");
				for (int i = 0; i < arNum.length; i++) {
					System.out.println(arNum[i]);
				}
//				idx = 0; 
			} catch (Exception e) {
				System.out.println("다시 시도해주세요.");
			}
		}
	}
}
