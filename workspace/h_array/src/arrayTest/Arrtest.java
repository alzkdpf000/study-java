package arrayTest;

public class Arrtest {
	public static void main(String[] args) {
		int[][] arrData = { { 3, 4, 5 }, { 7, 8, 9 } };

		int rowLength = arrData.length;
		int colLength = arrData[0].length;
		int length = rowLength * colLength;

		System.out.println(colLength);
		System.out.println(rowLength);

//		이중 for문이 아니면 이렇게 해야함 복잡함 
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i / 3][i % 3]);
		}
//		[0][0]
//		[0][1]
//		[0][2]

//		[1][0]
//		[1][1]
//		[1][2]
//		행은  0 1 0 1로 반복 열은 0 1 2 0 1 2 0 1 2로 반복한다.
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
	}
}
