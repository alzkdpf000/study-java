package list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> :  제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법 
//		자료구조를 설계할 떄 데이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언한다.
//		따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가 아닌 제네릭으로 선언 
		ArrayList<Integer> datas = new ArrayList<>();
		System.out.println(datas.size());
		
		// 오름 차순으로 정렬 
		Collections.sort(datas);
		System.out.println(datas);
		
		Collections.reverse(datas); // 가운데를 기준으로 좌우 바꾸기 
		System.out.println(datas);
		
		Collections.shuffle(datas); // 섞기
		System.out.println(datas);
		
		
	}
}
