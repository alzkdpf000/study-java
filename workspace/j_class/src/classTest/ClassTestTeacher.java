package classTest;

import java.util.Scanner;

class SuperCar1 {
	String brand;
	String color;
	int price;
	boolean engineCheck;

	public SuperCar1(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		engineCheck = true;
	}

	void engineStop() {
		engineCheck = false;
	}
}

public class ClassTestTeacher {
	public static void main(String[] args) {
		SuperCar1 ferrari = new SuperCar1("ferrari", "red", 57000);
		String menu = "1.시동 켜기\n2.시동 끄기";
		String errorMessage1 = "이미 시동이 켜져있습니다.";
		String errorMessage2 = "이미 시동이 꺼져있습니다.";
		int choice = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println(menu);
			choice = scanner.nextInt();

			if (choice == 1) {
				if (!ferrari.engineCheck) {
					ferrari.engineStart();
					System.out.println(ferrari.brand + " 시동 켜짐");
					continue;
				}

				System.out.println(errorMessage1);
			} else if (choice == 2) {
				if (ferrari.engineCheck) {
					ferrari.engineStop();
					System.out.println(ferrari.brand + " 시동 꺼짐");
					break;
				}

				System.out.println(errorMessage2);
			}

		}
	}

}
