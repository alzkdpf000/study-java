package classTest;

import lombok.Data;
import lombok.Getter;

//	동물 클래스 선언

//	변수
//	이름, 나이, 체력, 먹이 개수, 먹이 종류

// 	메소드
// 	먹기, 산책하기

//	먹기 
//	체력 1증가, 먹이 개수 1감소

//  산책
//	체력 1 감소

class Animal2 {
	String name;
	int age;
	int hp;
	int foodCnt;
	String foodType;

	public Animal2(String name, int age, int hp, int foodCnt, String foodType) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.hp = hp;
		this.foodCnt = foodCnt;
		this.foodType = foodType;
	}

	void eat() {
		hp++;
		foodCnt--;
	}

	void walk() {
		hp--;
	}

}

public class ClassTask04 {
	public static void main(String[] args) {
		Animal2 rabbit = new Animal2("test", 10, 100, 10, "bab");

		if (rabbit.foodCnt > 0) {
			rabbit.eat();
			System.out.println("냠냠");
		}

		if (rabbit.hp > 0) {
			rabbit.walk();
			System.out.println("헉헉");
		}

		System.out.println(rabbit);
	}
}
