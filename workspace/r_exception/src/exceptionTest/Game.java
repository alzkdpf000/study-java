package exceptionTest;

import java.util.Scanner;

public class Game {

//	캐릭터 이름을 입력받고,
//	"멍청이","바보","똥개"가 포함된 이름에 예외를 발생시켜
//	사용자에게 경고 메세지를 출력해준다.
//	강제 종료하지 않는다.

//	출력 종류 예시
//	종류1 : 캐릭터명: 홍길동
//	종류2 : 사용할 수 없는 닉네입니다.

	void checkNickname(String nickname) throws BadNicknameException {
		String[] arBadNickname = {"똥개", "바보","멍청이"};
		boolean result = false;
		for(int i = 0; i < arBadNickname.length; i++) {
			result = nickname.contains(arBadNickname[i]);
			if(result) {
				throw new BadNicknameException("닉네임에" + arBadNickname[i] + "포함되어 있습니다.");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nickname = null;
		String msg = "닉네임을 입력해주세요.";
		Game game = new Game();
		System.out.println(msg);
		try {
			nickname = scanner.next();
			game.checkNickname(nickname);
			System.out.println("캐릭터명 : " + nickname);
		} catch (BadNicknameException e) {
			// TODO: handle exception
//			무슨 오류인지, 어디서 발생했는지 알고 싶을 때에는 반드시 작성
			e.printStackTrace();
			System.out.println("사용할 수 없는 닉네임입니다.");
		}
	}
}
