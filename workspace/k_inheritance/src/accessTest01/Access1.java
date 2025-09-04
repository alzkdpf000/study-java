package accessTest01;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;

	public Access1() {
		;
	}

//	목적 1. private 접근하지마라 2. 직접 접근하지말고 메소드로 접근해라
//	
	public void setData4(int data4) {
		this.data4 = data4;
	}
	
	public int getData4() {
		return this.data4;
	}
}
