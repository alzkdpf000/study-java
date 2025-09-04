
package inheritanceTest;

class A {
	String name;
	int age;

	public A() {
		System.out.println("부모 생성자");
	}

	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class B extends A {
	String gender;
	
	public B() {
		System.out.println("자식 생성자");
	}

	public B(String gender) {
		this.gender = gender;
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		B b = new B();
	}
}
