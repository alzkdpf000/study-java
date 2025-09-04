package list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTask {
	public static void main(String[] args) {
//	      <?>: 제네릭(이름이 없는)
//	      객체화 시 타입을 지정하는 기법
//	      자료구조를 설계할 때 데이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언하다.
//	      따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가 아닌 제네릭으로 선언한다.
		ArrayList<Integer> datas = new ArrayList<Integer>();

		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(70);
		datas.add(10);
		datas.add(80);
		datas.add(60);
		datas.add(30);
		datas.add(20);

		System.out.println(datas.toString());
		System.out.println(datas.size());

//	      정렬
		Collections.sort(datas);
		System.out.println(datas);
//		Collections.sort(datas, Collections.reverseOrder());
//		System.out.println(datas);

//	      가운데를 기준으로 좌우 바꾸기
		Collections.reverse(datas);
		System.out.println(datas);

//	      요소 랜덤하게 섞기
		Collections.shuffle(datas);
		System.out.println(datas);

//	      추가(삽입), 60을 30뒤에 삽입한다.
//	      datas.indexOf(60); 60의 위치찾기 
//		datas.add(datas.indexOf(30) + 1, 60); // 60 뒤에 30 넣기
//		System.out.println(datas);

//	      int idx = Collections.indexOfSubList(datas, new ArrayList<>(Arrays.asList(60)));
//	      Collections.fill(datas,100);
//	      System.out.println(datas);

//	      수정, 10을 1로 수정한다.
//		datas.indexOf(10);
//		if (datas.contains(10)) {
//			datas.set(datas.indexOf(10), 1);
//			System.out.println(datas);
//		} else {
//			System.out.println("데이터 없음");
//		}

//	      삭제(값으로 삭제), 20을 삭제한다.
//	      삭제(인덱스로 삭제), 50을 삭제한다.
		if (datas.contains(20)) {
			datas.remove(datas.get(datas.indexOf(20)));
//			datas.remove(Integer.valueOf(20)); object로 바꿔주기 
			System.out.println("20 삭제 " +datas);
		} else {
			System.out.println(" 20 데이터 존재 안함 ");
		}

		if (datas.contains(50)) {
			datas.remove(datas.indexOf(50));
			System.out.println("50 삭제 " +datas);
		} else {
			System.out.println(" 50 데이터 존재 안함 ");
		}
	}
}
