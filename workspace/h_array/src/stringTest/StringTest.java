package stringTest;

public class StringTest {
	public static void main(String[] args) {
//		String의 초기값은 ""이 아니라 null이다.
//		선언 후 문자열 연결을 사용하고자 한다면 ""(빈 문자열)로 초기화한다. 
//		String data = "";  밑에서 연결을 할려고하면 이런 식으로 해야한다.

//		선언 후 문자열 연결을 사용하지 않으면, null로 초기화한다.
//		String data = null; 밑에서 연결할려고하면 ex) data += "sdsd" 라고하면 같이 붙어서 나온다. 하지만 기본으로 초기값은 이거다.

		String data = "ABC";
		System.out.println(data.length()); // 문자열 길이
		System.out.println(data.charAt(0)); // 인덱스로 원하는 값 가져오기
		System.out.println(data.indexOf('C')); // 특정 문자에 인덱스 번호 찾기 하지만 너가 전달한 시작 인덱스부터해서 가장 처음 나온 값이 출력된다.
		System.out.println(data.lastIndexOf('C')); // 이거는 뒤 부터 시작한다.
		data = "CASCC";
		System.out.println(data.indexOf('C', 1)); // 특정 문자에 인덱스 번호 찾기 하지만 너가 전달한 시작 인덱스부터해서 가장 처음 나온 값이 출력된다. 이 경우 3이 출력
		System.out.println(data.indexOf('C')); // 없으면 자동으로 0으로 시작해서 0이 출력된다 .
		System.out.println(data.contains("C")); // 포함 여부만 출력
		System.out.println(data.substring(1)); // 1번 부터 끝가지 출력
		System.out.println(data.substring(1, 2)); // 1번 부터 2-1 번까지 출력
		System.out.println(data.replace('A', 'Z')); // A를 전부 Z로 바꿔줘
		System.out.println(data.replaceAll("SCC", "ASD")); // 이 친구는 문자열을 바꿔줌 위에는 문자만

//		문자열 값 비교
		String data1 = "ABC";
		String data2 = "ABC";

		System.out.println(data1 == data2); // 이거는 주소를 검사
		System.out.println(data1.equals(data2)); // 무조건 이걸로 비교 문자열은

		String data3 = "1, 2, 3, 4 , 5";
		String[] ardata = data3.split(","); // 문자열을 분리했으므로 문자배열로 담아준다.
		for (int i = 0; i < ardata.length; i++) {
			System.out.println(ardata[i]);
		}
		String data4 = "가 나 다 라 마 바 사 ";
		String[] ardata1 = data4.split(" "); // 문자열을 분리했으므로 문자배열로 담아준다.
		for (int i = 0; i < ardata1.length; i++) {
			System.out.println(ardata1[i]);
		}
//		"www.naver.com/news";
		String url = "www.naver.com/news";
		String[] urlArr = url.split("/");
		System.out.println(urlArr[urlArr.length - 1]);

	}
}
