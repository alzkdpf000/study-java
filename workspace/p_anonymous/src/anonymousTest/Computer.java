package anonymousTest;

public class Computer {
	public static void main(String[] args) {
		// 익명 클래스를 사용해야 할 떄
//	 매번 다르게 구현해야 할 때
//	코드가 간결할 때 

		
		
		Game game = new Game() {

			@Override
			public void play() {
				// TODO Auto-generated method stub

			}

			@Override
			public void exit() {
				// TODO Auto-generated method stub

			}
		};
	}
}
