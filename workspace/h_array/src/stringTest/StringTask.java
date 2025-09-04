package stringTest;

public class StringTask {
	public static void main(String[] args) {
//		자바같은 경우는 swap이 없음 파이썬에 있음
//		사용자에게 입력받은 문자열 중
//		소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
		/*
		 * String msg = "문자열을 입력해주세요."; Scanner scanner = new Scanner(System.in); String
		 * inputData = null; int test = 0; String result = ""; System.out.println(msg);
		 * 
		 * inputData = scanner.nextLine();
		 * 
		 * // inputData.toLowerCase(); for (int i = 0; i < inputData.length(); i++) {
		 * test = (int) inputData.charAt(i); if (64 < test && test < 91) { result +=
		 * (char) (test + 32); } else if (96 < test && test < 123) { result += (char)
		 * (test - 32); } else { System.out.println("잘못 입력했습니다."); } }
		 * System.out.println(result);
		 * 
		 */

//		사용자에게 입력받은 문자열 중 
//		소문자의 총 개수를 출력한다.
		/*
		 * String msg = "문자열을 입력해주세요."; Scanner scanner = new Scanner(System.in); String
		 * inputData = null; int codeNum = 0; int cnt = 0; // String result = "";
		 * System.out.println(msg);
		 * 
		 * inputData = scanner.nextLine();
		 * 
		 * // inputData.toLowerCase(); for (int i = 0; i < inputData.length(); i++) {
		 * codeNum = (int) inputData.charAt(i); if (96 < codeNum && codeNum < 123) {
		 * cnt++; } } System.out.println(cnt);
		 */
//      아래의 주소에서 "/samsung"만 분리하여 출력한다.
//      www.naver.com/baseball/samsung
		/*
		 * String url = "www.naver.com/baseball/samsung"; int idx =
		 * url.lastIndexOf("/"); // 마지막 '/'의 인덱스를 알고 싶으므로 해당 메소드 사용
		 * System.out.println(url.substring(idx)); // '/'의 인덱스를 입력해주고 그 위치부터 마지막까지 자르기
		 */

//      아래의 주소들을 배열에 담고, 마지막 경로가 samsung인 것만 출력한다.
//      www.naver.com/baseball/samsung
//      www.naver.com/baseball/lg
//      www.naver.com/baseball/lotte
//      www.naver.com/baseball/kt
//      www.naver.com/phone/samsung
		String url1 = null;
		String checkTeam = null;  // 이거는 다른 방법에서 사용함 ;
		String[] teamName = { "samsung", "lg", "lotte", "kt", "samsung" };
		String[] urlTeamName = new String[5]; // 주소 저장할 공간 
		String[] splitString = null; // 스플릿하고 나서 잠깐 저장할 공간 
		int length = 0; //스플릿한 데이터 길이 저장하기 위한 공간 
		
//		이거는 url을 저장하기 위한 for 문 
		for (int i = 0; i < urlTeamName.length; i++) {
			url1 = "www.naver.com/baseball/";
			url1 += teamName[i];
			urlTeamName[i] = url1;
		}

//		이 경우는 중간에 있는 경우가 있어서 다르게 한다. 
		/*
		 * for (int i = 0; i < urlTeamName.length; i++) { checkTeam = urlTeamName[i]; if
		 * (checkTeam.contains("samsung")) { System.out.println(urlTeamName[i]); } }
		 */
		
		for (int i = 0; i < urlTeamName.length; i++) {
			splitString = urlTeamName[i].split("/");
			length = splitString.length;
			if (splitString[length - 1].equals("samsung")) {
				System.out.println(urlTeamName[i]);
			}
		}
	}
}
