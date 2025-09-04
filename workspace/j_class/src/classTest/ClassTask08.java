package classTest;

//	회원마다 여러 종류의 운동을 한다.
//	진행한 운동마다 칼로리 계산
//	운동한 칼로리를계산할 수 있다.

//	회원(User)
//	회원번호
//	이름
//	나이

//	운동(Exercise)
//	종목명
//	칼로리(정수)
public class ClassTask08 {
	public static void main(String[] args) {
		Exercise[] arExercise = { 
				new Exercise("벤치", 100), 
				new Exercise("프랭크", 250), 
				new Exercise("폴업", 210) 
				};
		Admin admin = new Admin(1, "jack", 10, arExercise);
		System.out.println(admin.totalCalorie);
	}
}
