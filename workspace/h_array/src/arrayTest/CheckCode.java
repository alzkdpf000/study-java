package arrayTest;

public class CheckCode {
	public static void main(String[] args) {
//		코드 분석
		int[] arOriginalData = { 9, 1, 9, 2, 9 }; // 데이터 저장 공간 
		boolean[] arCheck = new boolean[5]; // 값이 맞는지 체크 
		int[] arData = null; // 길이와 값을 모르므로 null저장 
		int count = 0, index = 0; // 중복되어 있는 데이터 수, arData에 인덱스를 위한 변수

		// 중복 체크하는 코드 같음 예를 들어 0에 있는 데이터가  1보다 큰 인덱스에 다시 나오면 카운터를 증가시키고 check를 참으로 바꿔준다 그 후 안 쪽 for문 벗어나기 (굳이 뒤에거를 할 필요없어서) 
		for (int i = 0; i < arOriginalData.length - 1; i++) {
			for (int j = i + 1; j < arOriginalData.length; j++) {
				if (arOriginalData[i] == arOriginalData[j]) {
					count++;
					arCheck[i] = true;
					break;
				}
			}
		}
//		arCheck는 참 거짓 참 거짓 거짓 으로 저장 
		arData = new int[arOriginalData.length - count]; // 현재 코드에서 크기가 3인 배열  count = 2이므로 
		for (int i = 0; i < arCheck.length; i++) {
			if (!arCheck[i]) { // 거짓이 참으로 되므로 그 부분은 중복이 없다는 말, 그래서 arData에 해당 중복이 아닌 수 넣기 
				arData[index++] = arOriginalData[i];
			}
		}
// 		자기 위치를 제외한 나머지 데이터에서 같은 값을 가지는지 체크하는거 같은데 
//		그 값을 출력  중복을 제거 
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}
