package stringTest;

public class StringTest01 {
	public static void main(String[] args) {
//		리터럴 상수는 constant pool에 저장되어서 값으로 주소를 찾는다.
//		문자열은 constant pool에 할당된다.
//		만약 동일한 문자열 같이 있다면, 해당 필드의 주소를 공유한다.
//		String data1 = "asd";
//		String data2 = "asd"; 
//		String data3 = new String("asd"); // -> 이거는heap 메모리에 저장됨 
		//하지만 data3.intern()을 쓰면 pool에서 찾아준다. 
		
//		Heap 메모리에 할당된 객체에 intern()을 사용하면
//		constant pool에 가서 그 주소를 가져오고,
//		없으면 constant pool에 등록하고 그 주소를 가져와준다.
		
		
//		문자열은 Constant Pool에 할당된다.
//		만약 동일한 문자열값이 있다면, 해당 필드의 주소를 공유한다.
		String data1 = "ABC";
		String data2 = "ABC";
		
//		직접 객체화를 하게 되면 Heap 메모리에 할당된다.
		String data3 = new String("ABC");
		
		System.out.println(data1 == data2);
//		Heap 메모리에 할당된 객체에 intern()을 사용하면,
//		Constant Pool에 가서 있으면 그 주소를 가져오고,
//		없으면 Constant Pool에 등록하고 그 주소를 가져와준다.
		System.out.println(data1 == data3.intern());
		System.out.println(data1 == data3);
		
		
	}
}
