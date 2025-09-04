package arrayTest;

public class ArTask01 {
	public static void main(String[] args) {
//		1 ~ 10까지 배열에 담고 출력

		int[] ex1Array = new int[10];

		for (int i = 0; i < ex1Array.length; i++) {
			ex1Array[i] = i + 1;
		}
		for (int i = 0; i < ex1Array.length; i++) {
			System.out.print(ex1Array[i] + " ");
		}

		System.out.println("\n================================");
//		10 ~ 1까지 중 짝수만 배열에 담고 출력
		int[] ex2Array = new int[10];

		for (int i = ex2Array.length; i >= 2; i -= 2) {
			ex2Array[ex2Array.length - i] = i;
//			System.out.println(ex2Array.length - i + "ss");
		}
		for (int i = 0; i < ex2Array.length; i += 2) {
			System.out.print(ex2Array[i] + " ");
		}

		int[] tArray = new int[5];
		for (int i = 0; i < tArray.length; i++) {
			tArray[i] = (5 - i) * 2;
		}

		for (int i = 0; i < tArray.length; i++) {
			System.out.println(tArray[i]);
		}

		System.out.println("\n================================");
//		1 ~ 100까지 배열에 담은 후 홀수만 출력 

		int[] ex3Array = new int[100];

		for (int i = 0; i < ex3Array.length; i++) {
			ex3Array[i] = i + 1;
		}
		for (int i = 0; i < ex3Array.length; i += 2) {
			System.out.println(ex3Array[i]);
		}
		System.out.println("\n================================");
//		001.png ~ 010.png를 배열에 담고 출력
		String[] ex4Array = new String[10];

		for (int i = 0; i < ex4Array.length; i++) {
			ex4Array[i] = String.format("%03d%s", i + 1, ".png");
		}

		for (int i = 0; i < ex4Array.length; i++) {
			System.out.print(ex4Array[i] + " ");
		}
	}
}
