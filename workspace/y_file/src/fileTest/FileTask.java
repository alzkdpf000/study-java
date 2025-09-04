package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
//	생선 종류를 작성한 뒤
//	전체 생선 종류를 콘솔에 출력한다.
//	생선은 최대 3개까지만 작성한다.
//	파일 이름 : fish.txt
//	경로 : ./
	public static void main(String[] args) throws IOException {
//
//		BufferedWriter bw = new BufferedWriter(new FileWriter("fish.txt"));
//
//		bw.write("도미\n");
//		bw.write("고등어\n");
//		bw.write("참돔");
//		bw.close();
//
//		BufferedReader br = null;
//		String line = null;
//		try {
//			br = new BufferedReader(new FileReader("fisadsh.txt"));
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
////				System.out.println(br.readLine()); 
//			}
//		} catch (IOException e) {
//			System.out.println("no File ");
//		} finally {
//			if (br != null) {
//				br.close();
//			}
//		}

//		수정
//		날치를 꽁치로 예를 들어
//		BufferedReader br1 = new BufferedReader(new FileReader("fish.txt"));
//		String line1 = null;
//		String temp = null;
//		StringBuilder sb = new StringBuilder();
//		BufferedWriter bw1 = null;
//		while ((line1 = br1.readLine()) != null) {
//			if (line1.equals("도미")) {
//				sb.append("꽁치\n");
//				continue;
//			}
//			sb.append(line1 + "\n");
//			
//		}
//		br1.close();
//		temp = sb.toString();
//		bw1 = new BufferedWriter(new FileWriter("fish.txt"));
//		bw1.write(temp);
//		bw1.close();
		
//		삭제
//		꽁치(본인이 원하는 생선 삭제.
		BufferedReader br1 = new BufferedReader(new FileReader("fish.txt"));
		String line1 = null;
		String temp = null;
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw1 = null;
		while ((line1 = br1.readLine()) != null) {
			if (line1.equals("고등어 ")) {
				continue;
			}
			sb.append(line1 + "\n");
			
		}
		br1.close();
		temp = sb.toString();
		bw1 = new BufferedWriter(new FileWriter("fish.txt"));
		bw1.write(temp);
		bw1.close();
	}
	

}
