package castingTest;

public class Encryption {
   public static void main(String[] args) {
	   // 암호화를 위한 예시 변수 
      String password = "ehdtjrdl1234";
      // 암호화와 복호화를 저장할 변수 
      String encryptedPassword = "", decryptedPassword = "";
     // 암호화 복호화를 풀기 위한 키 값 이걸로 조절해서 암호화하거나 복호화를 한다.
      final int KEY = 3;
      
      // 반복문을 사용해서 패스워드를 문자 하나씩 뽑아서 위 KEY값을 이용해서 아스키코드를바꿔준다.
      // 그러고 나서 다시 문자로 바꾸고 합쳐준다
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      //암호화 된 값 출력 
      System.out.println(encryptedPassword);
      // 반복문을 사용해서 암호화된 패스워드를 뽑아서 위 KEY값을 이용해서 아스키코드를바꿔준다.
      // 그러고 나서 다시 문자로 바꾸고 합쳐준다
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      //복호화된 값 출력 
      System.out.println(decryptedPassword);
      
   }
}