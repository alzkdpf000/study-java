package inheritanceTest;

class Animal {
	String name;
	int age;
	String feed;

	public Animal() {
		;
	}

	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}

	void walk() {
		System.out.println("걷기");
	}

	void eat() {
		System.out.println("먹기");
	}

	void run() {
		System.out.println("뛰기");
	}

}

class Lion extends Animal{
	public Lion() {
		;
	}

	void hunt() {
		System.out.println("사냥하기");
	}
	
//	오버라이딩 
	void walk() {
		System.out.print("네발로 ");
		super.walk();
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		
	}
}
