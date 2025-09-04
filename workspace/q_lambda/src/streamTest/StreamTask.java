package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class StreamTask {

	public static void printEven(int data) {
		if(data % 2 == 0) {
			System.out.println(data);
		}
	}
	public static boolean isEven(int data) {
		return data % 2 == 0;
	}
	public int minus(int data) {
		return 10 - data;
	}
	public static boolean isOdd(int data) {
		return data % 2 != 0;
	}
//	1 ~ 10까지 ArrayList에 담고 출력 
	public static void main(String[] args) {
//		ArrayList<Integer> nums = new ArrayList<>();
//		IntStream.range(1, 11).forEach((data) -> nums.add(data));
////		nums.forEach((num) -> System.out.println(num));
//
////		위 아래 둘 다 같은 코드
////		참조형식 코드 
//		IntStream.range(1, 11).forEach(nums::add);
////		System.out.println(nums);
//
////		10 ~ 1까지 담고 출력 
//		ArrayList<Integer> nums2 = new ArrayList<>();
//		IntStream.range(1, 11).forEach(nums2::add);
//		Collections.reverse(nums2);
//		nums2.forEach(System.out::println);
//
////		이것도 역순으로 정렬 
////		Collections.sort(nums,Collections.reverseOrder());
//
////		map() : 변경
////		1 ~ 10까지 ArrayList에 담고 각 값에 2를 곱하여 출력한다.
//		ArrayList<Integer> nums3 = new ArrayList<>();
//		IntStream.range(1, 11).forEach(nums3::add);
//		nums3.stream().map((data) -> data*2).forEach(System.out::println);
		
		
//		10 ~ 1까지만 Arraylist에 담은 후 짝수만 출력;
		ArrayList<Integer> nums4 = new ArrayList<>();
		StreamTask streamTask = new StreamTask();
		IntStream.range(0, 10).map(streamTask::minus).forEach(nums4::add);
		nums4.forEach(StreamTask::printEven);
		
//		filter(): 조건 
		ArrayList<Integer> nums5 = new ArrayList<>();
		StreamTask streamTask1 = new StreamTask();
		IntStream.range(0, 10).map(streamTask1::minus).forEach(nums4::add);
		nums5.stream().filter(StreamTask::isEven).forEach(StreamTask::printEven);
//		1 ~ 100 중 홀수만 담기 
		ArrayList<Integer> num6 = new ArrayList<>();
		IntStream.range(1, 101).filter(StreamTask::isOdd).forEach(num6::add);
		System.out.println(num6);
		
//		Apple, Banana, Orange
//		위의 문자열을 ArrayList에 담고 이름에 "n"이 포함된 과일 이름만 출력
		ArrayList<String> strings = new ArrayList<>(Arrays.asList("Apple","Banana","Orange"));
		strings.stream().filter((data)->data.contains("n")).forEach(System.out::println);
		
//		Product 클래스 선언
//		
		Product[] arProduct = {
				new Product("TV",1000,10),
				new Product("DVD",500,40)
		};
		ArrayList<Product> products = new ArrayList<>(Arrays.asList(arProduct));
		products.stream().map(Product::sale).forEach(System.out::println);
		products.stream().map(Product::errStock).forEach(System.out::println);
		products.stream().map(Product::totalPrice).forEach(System.out::println);
//		products.stream().map()
	}
}
