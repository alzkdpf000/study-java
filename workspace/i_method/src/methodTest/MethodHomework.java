package methodTest;

public class MethodHomework {

//	1. 문자열을 입력받고 뒤집어서 출력하는 메소드
	String reverseString(String content) {
		String result = "";
//	뒤집어서 출력하므로 끝에서 부터 시작해야한다 우리는 배열이 0부터 시작이므로 길이에서 -1 한 값으로 시작해야 한다. 그래야 인덱스 범위 오류가 안남 
		for (int i = content.length() - 1; i >= 0; i--) {
			result += content.charAt(i);
		}
		return result;
	}

//	2. 정수 배열에서 가장 큰 값을 반환하는 메소드
	int getMaxNum(int[] nums) {
		int max = nums[0]; // 첫 번째 값 저장 하기
		for (int i = 1; i < nums.length; i++) {
			max = max < nums[i] ? nums[i] : max; // max의 값이 더 크면 그대로 유지하고 반대의 경우 값을 갱신 해주기
		}
		return max;
	}

//	3. 문자열 배열을 입력받아 각 문자열의 길이를 출력하는 메소드
	void measureLength(String[] strings) {

		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i] + "의 길이는 " + strings[i].length() + "입니다."); // 문자열 length()메서드를 사용해서 문자열 길이
																						// 출력해주기
		}
	}

//	4. 정수를 입력받아 짝수면 true, 홀수면 false를 반환하는 메소드
	boolean isEven(int x) {
		return x % 2 == 0; // 2로 나누었을 때 나머지가 0이면 짝수 0이 아니면 홀수
	}

//	5. 문자열 배열에서 문자열에서 특정 값이 존재하는 인덱스를 출력
	void findIndex(String[] strings, String target) {
		// 문자열 배열만큼 for문 돌아주기
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].contains(target)) { // String에 contains()메소드를 통해 값의 존재 여부를 판단하고 존재하면 해당 인덱스 출력
				System.out.println(i);
			}
		}
	}

	/*
	 * void test() { String a = "leel"; String b = "racecar"; int line = a.length()
	 * / 2; for (int i = 0; i < line; i++) { if (a.charAt(i) == a.charAt((a.length()
	 * - 1) - i)) { System.out.println(true); } else { System.out.println(false); }
	 * } }
	 */
	public static void main(String[] args) {
		MethodHomework methodHomework = new MethodHomework();
		System.out.println("=========================1번 문제 결과 입니다.============================");

		System.out.println(methodHomework.reverseString("asd"));

		System.out.println("====================================================================\n");

		System.out.println("=========================2번 문제 결과 입니다.============================");

		int[] nums = { 1, 100, 29, 40, 30 };

		System.out.println(methodHomework.getMaxNum(nums));

		System.out.println("====================================================================\n");

		System.out.println("=========================3번 문제 결과 입니다.============================");

		String[] strings = { "LG Twins", "KT Wiz", "Doosan Bears", "SSG Landers", "NC Dinos", "Lotte Giants",
				"KIA Tigers", "Samsung Lions", "Hanwha Eagles", "Kiwoom Heroes" };

		methodHomework.measureLength(strings);

		System.out.println("====================================================================\n");

		System.out.println("=========================4번 문제 결과 입니다.============================");

		System.out.println(methodHomework.isEven(100));

		System.out.println("====================================================================\n");

		System.out.println("=========================5번 문제 결과 입니다.============================");

		String[] greetings = { "Hello, John! Welcome back.", "Good morning, Emily! Have a great day.",
				"Hi, John! How are you today?", "Nice to see you, Sarah!", "Hey, Emily! Let's catch up soon." };
		methodHomework.findIndex(greetings, "Emily");
		System.out.println("====================================================================\n");
//		methodHomework.test();
	}
}
