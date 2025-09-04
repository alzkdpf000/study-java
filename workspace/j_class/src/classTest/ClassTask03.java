package classTest;

//회원의 정보를 저장할 클래스 선언
//아이디, 비밀번호

//아이디 중복검사
//아이디는 항상 "test"이며, 전달받은 아이디와 검사하여 결과를 리턴한다.

//로그인
//아이디와 비밀번호는 항상 "test", "1234"이다.
//로그인 성공 혹은 실패에 대한 결과를 리턴한다.

class User{
	String id;
	String passwd;
	
	User(String id, String passwd){
		this.id = id;
		this.passwd = passwd;
	}
	
	boolean duplicateId(String id) {
		return "test".equals(id);
	}
	
	boolean login(String id, String passwd) {
		return id.equals("test") && passwd.equals("1234");
	}
}
public class ClassTask03 {
	public static void main(String[] args) {
		User user = new User("tset", "1234");
		user.login("test", "1234");
		user.duplicateId("test");
	}

}
