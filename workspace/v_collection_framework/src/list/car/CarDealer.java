package list.car;

import java.util.ArrayList;

import list.task.DBConnecter;

/*
 * 자동차 추가
자동차 이름으로 마력 조회
특정 차종의 자동차 목록 전체 조회
마력이 일정 수치 이상인 차량만 조회
연료 타입으로 특정 차량 마력 수정 
차종으로 마력 수정 
 */
public class CarDealer {
	private static final String[] CAR_TYPE_CONTNET = { "세단", "SUV", "트럭", "쿠페", "컨버터블" };

	// 차 추가하기
	public void insert(Car car) {
		boolean flag = false;
		for (String s : CAR_TYPE_CONTNET) {
			if (s.equals(car.getType())) {
				flag = true;
			}
		}
		if (flag) {
			DBConnecter.cars.add(new Car(car));

		}
	}

// 이름으로 마력 구하기 못찾으면 -1
	public int findHpByName(String name) {
		for (Car c : DBConnecter.cars) {
			if (c.getName().equals(name)) {
				return c.getEngine().getHp();
			}
		}
		return -1;
	}

	// 차종 다 찾기
	public ArrayList<Car> findAllByType(String type) {
		ArrayList<Car> cars = new ArrayList<>();
		for (Car c : DBConnecter.cars) {
			if (c.getType().equals(type)) {
				cars.add(new Car(c));
			}
		}
		return cars;
	}

// 일정 마력 이상인 자동차 전체 
	public ArrayList<Car> findAllByMinHorsepower(int hp) {
		ArrayList<Car> cars = new ArrayList<>();
		for (Car c : DBConnecter.cars) {
			if (c.getEngine().getHp() >= hp) {
				cars.add(new Car(c));
			}
		}
		return cars;
	}

// 특정 연료 타입을 가진 자동차 마력 바꿔주기 
	public void updateHpByFuelType(String fuelType, int newHp) {
		for (Car c : DBConnecter.cars) {
			if (c.getEngine().getFuelType().equals(fuelType)) {
				c.getEngine().setHp(newHp);
			}
		}
	}

// 차종으로 바꾸기 
	public void updateHpByType(String type, int newHp) {
		for (Car c : DBConnecter.cars) {
			if (c.getType().equals(type)) {
				c.getEngine().setHp(newHp);
			}
		}
	}
}
