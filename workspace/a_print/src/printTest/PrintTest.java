package printTest;

public class PrintTest {

	public static void main(String[] args) {
//		주석(command + /)
//		1. 소스코드에 설명할 때
//		2. 지금 당장 사용하지 않는 코드를 번역하고 싶지 않을 때 
//		범위 주석(command + shift + /, command + shift + \)  단 마우스로 범위 지정해서 
		/*
		 * 코드 중간에 있는 부분을 주석처리 할 때 사용한다.
		 */

//		 이름을 출력하는 부분
//		System.out.println("한동석");
//		System.out.println("20살ㄴㄴ");

//		 제어 문자
//		반드시 따옴표 안에서 작성한다.
//		\n new line, 줄바꿈, 개행문
//		\t  tab위 아래 줄 간격 맞춰 띄
//		\"  큰 따옴표 표시
//		 \' 작은 따옴표 표시
//		\\ \ 표현              
//		System.out.print("\"한동석\"\n"); 따옴표가 나오게 하기 위한 표현 
//		System.out.print("\\20살\\"); 역 슬래쉬가 나오게 하기 위한 표현 
		
//		서식문자
//		반드시 따옴표안에서 작성한다.
//		%d : decimal 10진수 정수
//		%o : octal 8진수 정수
//		%x : hexa decimal 16진수 정수
//		%f : float 실수
//		%c : character 문자 
//		%s : String 문자열
		String name = "qwe";
		int age = 20;
		
		System.out.printf("이름: %s\n",name); 
		System.out.printf("나이: %d\n",age);
	}
}
