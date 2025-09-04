package controlStatementTest;

/**
 * OperTest.java
 *
 * break 와 continu 사용법
 * 
 *
 * @author jeongchunghyo
 */
public class OperTest {
	public static void main(String[] args) {
		
//		1 ~ 10까지 중 4까지만 출력한다.
		for (int i = 1; i < 11; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}

//		1 ~ 10까지 중 4를 제외하고 출력 
		for (int i = 1; i < 11; i++) {
			if (i == 4)	continue;
			System.out.println(i);

		}
	}
}
