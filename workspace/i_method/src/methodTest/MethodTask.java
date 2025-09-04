package methodTest;

public class MethodTask {
//		1 ~ 10까지 println()으로 출력하는 메소드
	void countNumTen() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	"홍길동"을 n번 println()으로 출력하는 메소드
	void printName(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}

//	이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}

//  세 정수의 뺄셈 메소드
	int subtraction(int x, int y, int z) {
		return x - y - z;
	}

	int subtraction(int[] data) {
		int result = data[0];
		for (int i = 1; i < data.length; i++) {
			result -= data[i];
		}
		return result;
	}

//	두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드
//	return 값은 반드시 1개만 가능하다.	
	int[] divide(int x, int y) {
		int[] result = new int[2];

		if (y != 0) {
			result[0] = x / y;
			result[1] = x % y;
			return result;
		}
		return null;
	}

	// 1 ~ n 까지의 합을 구해주는 메소드
	int sum(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
		}

		return result;
	}

	int sum(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += i + 1;
		}
		return result;
	}

//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String upperLowerCase(String data) {
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			System.out.println(c);
			if (64 < c && c < 90) {
				System.out.println(c + " upper");
				c += 32;
				result += c;
			} else if (96 < c && c < 123) {
				System.out.println(c + " lower");
				c -= 32;
				System.out.println(c + " lower2");
				result += c;
			}
		}
		return result;
	}

//	한글을 정수로 바꿔주는 메소드
//	일공이사 -> 1024  char 버전 
	String krToNum(String content) {
		String result = "";
		char[] charArr = { '공', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구' };
		for (int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
//			System.out.println(c);
			for (int j = 0; j < charArr.length; j++) {
//				System.out.println(c);
				if (c == charArr[j]) {
					result += j;
				}
			}
		}
//		System.out.println(result);
		return result;
	}

	String krToNum1(String content) {
		String result = "";
		String krNum = "공일이삼사오육칠팔구";
		for (int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			result += krNum.indexOf(c);
		}
//		System.out.println(result);
		return result;
	}

// 정수를 한글로 바꿔주는 메소드
//	1024 -> 한글 ---> 좀 더 복잡하게 푼 거 
	String numToKr(int content) {
		String result = "";
		String krNum = String.valueOf(content);
		String hangeul = "공일이삼사오육칠팔구";
		for (int i = 0; i < krNum.length(); i++) {
			String s = String.valueOf(krNum.charAt(i));
			int idx = Integer.parseInt(s);
//			System.out.println(id);
			result += hangeul.charAt(idx);
		}
		return result;
	}

//  정수를 한글로 바꿔주는 메소드
//  1024 -> 일공이사 --> 강사님은 연산을 사용해서 더 간단하게 
	String changeToHangeul(int number) {
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";
//	먼저 10으로 나머지 값을 인덱스로 뽑아서 사용 그래서 일의 자리를 계속 뽑아주고 그 값을 위 hangeul이라는 배열에 인덱스로 넣어줘서 값을 가져온다.
		while (number != 0) {
			result = hangeul.charAt(number % 10) + result;
			number /= 10;
		}

		return result;
	}

// 문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//	입력 예) banana, a
//	출력 예) 3
	int countChar(String content, char c) {
		int cnt = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == c) {
				cnt++;
			}
		}
		return cnt;
	}

//	1 ~ 100을 입력받고 짝수만 리턴하는 메소드 
	int[] getEven(int[] nums) {
		int[] evens = new int[50];
		for (int i = 0; i < evens.length; i++) {
			evens[i] = nums[i*2 + 1];
		}
		return evens;
	}

	public static void main(String[] args) {

//		메소드를 선언했다면, 반드시 사용해서 테스트한다.
		MethodTask methodTask = new MethodTask();
//		methodTask.countNumTen();
//		methodTask.printName(10);
//		methodTask.printName("홍길동", 10);
//		methodTask.subtraction(1, 2, 3);
//		int[] nums = { 1, 2, 3 };
//		System.out.println(methodTask.subtraction(nums));
//
//		int[] result = methodTask.divide(1, 2);
//
//		System.out.println(result[0] + " " + result[1]);
////		System.out.println(3%2);
//		for (int i = 1; i < 0; i++) {
//			System.out.println(i);
//		}
//
//		System.out.println(methodTask.sum(10));
//		System.out.println(methodTask.upperLowerCase("asSDSAa"));
//		System.out.println(methodTask.krToNum("일공이사"));
//		System.out.println(methodTask.krToNum1("공공사사사"));
//		System.out.println(methodTask.numToKr(456));
//		System.out.println(methodTask.countChar("banana", 'a'));
////		System.out.println(String.valueOf(null));
//		System.out.println();
		int[] nums = new int[100];
		for(int i = 0; i<100; i++) {
			nums[i] = i+1;
		}
		int[] result = methodTask.getEven(nums);
		for(int i= 0; i< result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
