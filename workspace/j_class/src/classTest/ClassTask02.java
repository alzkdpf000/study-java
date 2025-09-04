package classTest;
//슈퍼카를 2대를 만들어야 한다.

//모든 슈퍼카는 브랜드, 색상, 가격이 있다.
//시동 켜기, 시동 끄기 기능이 있다.

// 메소드
//시동 켜기
//이미 시동이 켜져 있으면 "시동이 켜져있습니다." 
//시동이 꺼져있으면 시동 켜기

//시동 끄기
//이미 시동이 꺼져있으면 "시동이 꺼져있습니다." 출력
//시동이 켜져있으면 시동 끄기

class SuperCar {
	int price;
	String brend;
	String color;
	boolean onOff;

	SuperCar(int price, String brend, String color) {
		this.brend = brend;
		this.price = price;
		this.color = color;
	}

	void turnOn() {
		if (onOff) {
			System.out.println(brend + " 시동이 켜져있습니다.");
		} else {
			onOff = true;
			System.out.println(brend + " 시동을 켰습니다.");
		}
	}

	void turnOff() {
		if (!onOff) {
			System.out.println(brend + " 시동이 꺼져있습니다.");
		} else {
			onOff = false;
			System.out.println(brend + " 시동을 껐습니다.");
		}
	}
}

public class ClassTask02 {
	public static void main(String[] args) {
		SuperCar superCar1 = new SuperCar(10000, "BMW", "White");
		SuperCar superCar2 = new SuperCar(15000, "BenZ", "Blue");

		superCar1.turnOff();
		superCar1.turnOn();
		superCar1.turnOn();

		superCar2.turnOn();
		superCar2.turnOn();
		superCar2.turnOff();
	}
}
