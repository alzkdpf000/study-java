package fileTest;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileTest{
//	절대 경로
//	어디서든지 찾아갈 수 있는 경로 
//	이거는 드라이브부터 
//	상대 경로 
//	내 위치를 기준으로 찾아갈 수 있는 경로 
//	./ : 현재 내 위치  ../ : 현재 위치에서 전 위치  현재 경로는 생략 가능 
	public static void main(String[] args) throws IOException {
//		false면 덮어 쓰기 true면 이어 쓰기 
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
		bw.write("파일 테스트 연습 중입니다.");
		bw.flush();

		bw.close(); // 자동으로 flush가 된다.

		BufferedReader br = null; // FM 작성 방식
//		br.readLine 줄 바꿈 문자는 가져오지 않음
		String line =null;
		try {
			br = new BufferedReader(new FileReader("test.txt"));
			while ((line = br.readLine())!= null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file위치 확인 바람");
		}finally {
			if(br != null)
			br.close();
		}

	}
}
