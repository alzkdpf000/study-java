package Task;

public class MyMath {
	static Calc operate(String oper) {
		if(oper.equals("+")) {
			return (x,y) -> x+y;
		}else {
			return (x,y) -> x-y;
		}
		// 강사님은 삼항연산으로 해결 
	}
	public static void main(String[] args) {
		String a =null;
	}
}
