package exceptionTest;

import java.util.Scanner;

public class Chatting {
//  throws: 메소드 내에서 해당 예외를 처리하지 않고
//  메소드를 사용한 부분에서 처리할 때 사용한다.
//  하나의 메소드 내에 같은 예외가 반복해서 발생하면,
//  매번 try ~ catch문을 사용하는 것은 번거롭기 때문에
//  throws를 작성한 뒤 해당 메소드를 사용한 부분에서 
//  딱 1번만 try ~ catch문을 사용한다.
	public void chatRuntimeException(String msg) {
		if (msg.contains("바보")) {
			throw new BadWordException(); // 강제 종료 
		}
	}

	public void chatException(String msg) {
		if (msg.contains("바보")) {

			try {
				throw new BadWordException();
			} catch (Exception e) {
				msg = "bad word"; // 예외를 처리해주기 
				// TODO: handle exception
			}
		}
		System.out.println(msg);
	}

	public void chat(String msg) throws BadWordException {
		if (msg.contains("바보")) { 
			throw new BadWordException("나쁜 단어"); // 사용하는 곳에서 예외를 처리해라 
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Chatting chatting = new Chatting();
		String message = "메시지: ";
		String data = null;

		while (true) {
			System.out.print(message);
			data = scanner.nextLine();
			try {
				chatting.chat(data);
				System.out.println(data);

			} catch (BadWordException e) {
				e.printStackTrace();
				System.out.println("으응~ 안돼 나쁜말");

			}
		}
		

	}
}
