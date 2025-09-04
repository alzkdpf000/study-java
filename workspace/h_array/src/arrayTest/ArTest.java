package arrayTest;

public class ArTest {
	public static void main(String[] args) {
		/*
		 * int[] arData = { 2, 4, 5, 6, 8 };
		 * 
		 * System.out.println(arData); System.out.println(arData[0]); for (int i = 0; i
		 * < arData.length; i++) { System.out.println(arData[i]); }
		 */
//		5칸 배열 선언 후 5, 4, 3, 2, 1 넣고 출력
		int[] arData = new int[5];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 5 - i;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}

	}
}
