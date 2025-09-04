package exceptionTest;

public class BadNicknameException extends Exception {
	public BadNicknameException() {;}

	public BadNicknameException(String msg) {
		super(msg);
	}

}
