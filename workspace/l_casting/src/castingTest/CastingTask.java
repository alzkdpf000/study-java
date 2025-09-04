package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스

// 사용자가 선택한 영상이
// 1. 애니메이션이라면, "자막 지원" 기능 사용
// 2. 영화라면, "4D" 기능 사용
// 3. 드라마라면, "굿즈" 기능 사용

// 위의 기능들은 각 클래스에 메소드로 선언하여 해당 문자열을 출력하라는 뜻이다.

public class CastingTask {

//	아래의 getService 메소드 1개로
//	영상 1개를 전달받아서
//	애니메이션인지, 영화인지, 드라마인지 검사한 뒤
//	그 고유 기능을 사용할 수 있게 구현한다.
//	반드시, up casting과 down casting을 활용한다.
	
//	매개변수로 Netflix타입으로 만들어주어서 자동으로 up casting을 해준다
	public void getService(Netflix netflix) {
		
//		instanceof를 통해 해당 매개변수의 값인 netflix 부분
//		에 어떤 자식 타입이 up casting되서 들어왔는지 확인을 위한 조건문
//		조건을 통과한 부분에서 다시 down casting을 통해 메소드를 실행
		if (netflix instanceof Animation) { 
			Animation a = (Animation) netflix; // down casting 부분 
			a.applyFeatureByContentType();
		} else if (netflix instanceof Film) {
			Film f = (Film) netflix; // down casting 부분
			f.applyFeatureByContentType(); 
		} else {
			Drama d = (Drama) netflix; // down casting 부분 
			d.applyFeatureByContentType();
		}
	}

	
//	========================Static 쓴 버전 =======================
	
//	매개변수로 Netflix타입으로 만들어주어서 자동으로 up casting을 해준다
	public static void getService_s(Netflix netflix) {
		
//		instanceof를 통해 해당 매개변수의 값인 netflix 부분
//		에 어떤 자식 타입이 up casting되서 들어왔는지 확인을 위한 조건문
//		조건을 통과한 부분에서 다시 down casting을 통해 메소드를 실행
		if (netflix instanceof Animation) { 
			Animation a = (Animation) netflix; // down casting 부분 
			a.applyFeatureByContentType();
		} else if (netflix instanceof Film) {
			Film f = (Film) netflix; // down casting 부분
			f.applyFeatureByContentType(); 
		} else {
			Drama d = (Drama) netflix; // down casting 부분 
			d.applyFeatureByContentType();
		}
	}

	public static void main(String[] args) {
		Animation animation = new Animation();
		Film film = new Film();
		Drama drama = new Drama();
		CastingTask castingTask = new CastingTask();
		
		
//		이렇게 배열을 만들어서 for문 돌려서 해도 가능함 
		Netflix[] arVideo = {
				new Animation(),
				new Film(),
				new Drama()
		}; 
		
//		up casting 없이 매개변수로 전달하면 자동으로 변환된다.
		castingTask.getService(drama);
		castingTask.getService(film);
		castingTask.getService(animation);
		
//		Static 사용한 버전 객체화할 필요가 없음 
		CastingTask.getService_s(drama);
		CastingTask.getService_s(film);
		CastingTask.getService_s(animation);
		
	}
}
