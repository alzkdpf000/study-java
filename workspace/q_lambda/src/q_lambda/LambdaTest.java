package q_lambda;

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter lambdaInter = new LambdaInter() {
			
			@Override
			public boolean checkMultipleOf10(int number) {
				// TODO Auto-generated method stub
				return number % 10 == 0;
			}
		};
//		1. (매개변수 형식 나열...) -> 리턴값; 방식 
		LambdaInter lambdaInter2 = (number) -> number % 10 == 0;

//		2. (매개변수 형식 나열...) -> {실행할 문장; return 리턴값;}
		LambdaInter lambdaInter3 = n -> {System.out.println("hihi"); return n % 10 == 0;};
		
//		3, 4번은 매개변수는 한개만 사용 가능 그래서 항상 소괄호를 쓰는게 좋음
		
//		3. 매개변수 -> 리턴값;
		LambdaInter lambdaInter4 = n -> n % 10 == 0;
		
//		4. 매개변수 -> {실행할 문장; return 리턴값;}
		LambdaInter lambdaInter5 = n -> { System.out.println("hihi"); return n % 10 == 0;};
		
	}
}
