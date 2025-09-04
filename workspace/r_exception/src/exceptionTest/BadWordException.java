package exceptionTest;
// 우리가 정하는 예외클래스 우리만 쓰는 예외일 경우 
// Exception, RuntimeException 둘 중 하나를 상속 받아야한다.
// RuntimeException은 강제 종료를 원할 때
// Exception은 강제 종료가 아니라 처리를 해라는 방식 

// Exception 상속 : 컴파일러가 체크(컴파일 오류), try ~ catch문을 강제한다. 강제 종료 시키면 안된
// RuntimeException 상속 : 컴파일러가 체크하지 않음(빌드 오류 또는 런타임 오류), 강제 종료 시켜야 한다.  


public class BadWordException extends RuntimeException{
	public BadWordException() {;}
	public BadWordException(String msg) {super(msg);}
	
}
