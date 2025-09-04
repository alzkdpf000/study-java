package classTest;

//	동물이 3마리 있다.
//	모든 동물은 이름, 나이, 성별이 있다.
// 	3마리 동물은 각자 자기소개를 할 수 있다.
//	클래스를 활용하여 3마리 동물이 자기소개할 수 있게 한다.
class Animal {
	String name;
	int age;
	String gender;

	public Animal(String name, int age, String gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	void printInfo() {
		System.out.println("내 이름은 \"" + name + "\"이고 나이는 " + age + "살이고 성별은 " + gender + "입니다.");
	}
}

public class ClassTask01 {
	public static void main(String[] args) {
		Animal tiger = new Animal("호랑이", 10, "남자");
		Animal dog = new Animal("개", 5, "여자");
		Animal cat = new Animal("고양이", 12, "남자");
		
		tiger.printInfo();
		dog.printInfo();
		cat.printInfo();
	}

}
