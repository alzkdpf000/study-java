package castingTest;

public class CastingTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	자동형변환
		System.out.println(5 / 2.0); // 이 경우  둘 중 하나만 실수이면 저절로 실수형으로 저장 
		System.out.println(5 / 2); // 원래는 기본적으로 2.5로 생각하지만 자바는 몫만 나옴 
		
//		강제형변환
		System.out.println(5/(double)2); // 위 방식처럼 2.0으로 가능하지만 강제적으로 변경 가능 
		System.out.println(2.9+5);  // 이 경우는 자동적으로 7.9로 출력 실수로 저절로 바뀜 
		System.out.println((int)2.9+5); // 실수에서 정수로 바꾸면 소수점부분은 날아감 그래서 7로 출력 
		
//		8.43 + 2.59 =10
		double fNum = 8.43; //첫 번째 숫자 
		double bNum = 2.59; //두 번째 숫자 
		int result = (int) fNum +(int) bNum; //그냥 더하고int로 바꾸면 11이 나오므로 둘다 소수점을 날려준 상태로 result에 넣어준다.
		System.out.println(result); //결과 출력
	}

}
