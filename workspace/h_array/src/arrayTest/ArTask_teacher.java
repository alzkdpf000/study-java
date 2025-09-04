package arrayTest;

public class ArTask_teacher {
	public static void main(String[] args) {

		// 버전 1
		String[] arData = new String[10];

		for (int i = 0; i < 10; i++) {
//       매 반복마다 이전 값을 초기화 해준다.
			String fileName = "";
			String zero = "";

//       1의 자리수는 앞에 0을 2개 붙인다.
			if ((i + 1) / 10 < 1) {
				zero = "00";
			} else if ((i + 1) / 10 < 10) {
//          10의 자리수는 앞에 0을 1개 붙인다.
				zero = "0";
			}

//       만약 위의 조건식이 모두 false이면 zero에는 초기값인 ""이 들어있다.
//       100의 자리수는 앞에 0을 붙이지 않는다.

//       앞에 붙여야 할 0을 붙여준다.
			fileName += zero;
//       이미지 번호를 붙여준다.
			fileName += i + 1;
//       확장자를 붙여준다.
			fileName += ".png";
//       각 파일의 이름을 배열에 담아준다.
			arData[i] = fileName;
		}
//		버전2 문자열의 길이로 표현해서 하는 방법 
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}

		for (int i = 0; i < 10; i++) {
			arData[i] = i + 1 + ".png";
		}

		for (int i = 0; i < arData.length; i++) {
			switch (arData[i].length()) {
			case 5:
				arData[i] = "00" + arData[i];
				break;
			case 6:
				arData[i] = "0" + arData[i];
				break;
			default:
				break;
			}
		}
// 		버전3 더 간단하고 간결한 방법 
		String[] ex4Array = new String[10];

		for (int i = 0; i < ex4Array.length; i++) {
			ex4Array[i] = String.format("%03d%s", i + 1, ".png");
		}

		for (int i = 0; i < ex4Array.length; i++) {
			System.out.print(ex4Array[i] + " ");
		}

	}
}
