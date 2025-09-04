package classTest;

//	쿠팡(Cupang)
//	kg당 가격 

//	박스 
//	kg

//	쿠팡에 택배서비스를 이용하고자 할 때
//	전달한 박스의 가격을 구한다.
public class ClassTask12 {
	public static void main(String[] args) {

		Box[] box = {new Box(10)};
		Cupang cupang = new Cupang(500);

		cupang.deliver(box);

		System.out.println(cupang.price);
	}
}
