package arrayTest;

import java.util.Scanner;

public class ArTask03 {
	public static void main(String[] args) {
//		당신은 3칸 방이 있는 건물주이다.
//		각 방에는 세입자가 살고 있다.
//		방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램을 만들고자 한다.
		int[] house = new int[3];
		Scanner scanner = new Scanner(System.in);
		String msg = "월세를 입력해주세요. \n ex) 10 20 30";
		int monthRent = 0;
		int sum = 0;
		double avg = 0.0;

		System.out.println(msg);

		for (int i = 0; i < house.length; i++) {
			monthRent = scanner.nextInt();
			house[i] = monthRent;
//			sum += house[i];
		}

		for (int i = 0; i < house.length; i++) {
			sum += house[i];
		}

		avg = (double) sum / house.length;
		System.out.println("총액 : " + sum + ", " + "평균 : " + avg);

		/*
		 * Scanner scanner = new Scanner(System.in); String message = "호 월세: "; int
		 * total = 0; double average = 0.0;
		 * 
		 * for (int i = 0; i < arIncome.length; i++) { System.out.println("10" + (i + 1)
		 * + message); arIncome[i] = scanner.nextInt(); }
		 * 
		 * for (int i = 0; i < arIncome.length; i++) { total += arIncome[i]; }
		 * 
		 * average = (double)total / arIncome.length; average =
		 * Double.parseDouble(String.format("%.2f", average));
		 * 
		 * System.out.println("총 월세: " + total); System.out.println("평균 월세: " +
		 * average); }
		 */
	}
}
