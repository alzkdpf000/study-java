package methodTest;

public class MethodHomeworkTeacher {
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] getMaxMin(int[] nums) {

		int[] maxMinAr = new int[2];
		maxMinAr[0] = nums[0];
		maxMinAr[1]= nums[0];

		for (int i = 1; i < nums.length; i++) {
			maxMinAr[0]  = maxMinAr[0]  < nums[i] ? nums[i] : maxMinAr[0] ;
			maxMinAr[1] = maxMinAr[1] > nums[i] ? nums[i] : maxMinAr[1];
			System.out.println(i + " 번 " + "현재 max : " + maxMinAr[0] + "\t현재 min :" + maxMinAr[1]);
		}

//		maxMinAr[0] = max;
//		maxMinAr[1] = min;

		return maxMinAr;
	}
	
	// 주소 값을 보내주는 경우 
	// 주소값을 보내주면 저절로 바뀜 그래서 return이 필요없음 대신 매개변수 하나를 더 써줘야 한다.
	// 다른 영역의 값을 변경해주기 위해서 
	void getMaxMin(int[] nums, int[] result) {
		
		int[] maxMinAr = new int[2];
		maxMinAr[0] = nums[0];
		maxMinAr[1]= nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			maxMinAr[0]  = maxMinAr[0]  < nums[i] ? nums[i] : maxMinAr[0] ;
			maxMinAr[1] = maxMinAr[1] > nums[i] ? nums[i] : maxMinAr[1];
			System.out.println(i + " 번 " + "현재 max : " + maxMinAr[0] + "\t현재 min :" + maxMinAr[1]);
		}
		
//		maxMinAr[0] = max;
//		maxMinAr[1] = min;
		
	}
	

	public static void main(String[] args) {
		MethodHomeworkTeacher methodHomeworkTeacher = new MethodHomeworkTeacher();
		
//		int[] arData = { 100, 29, 30, 120, -9 };
//		int[] resultAr = new int[2];
//
//		resultAr = methodHomeworkTeacher.getMaxMin(arData);
//		for (int i = 0; i < 2; i++) {
//			System.out.println(resultAr[i]);
//		}
		
		
	}
}
