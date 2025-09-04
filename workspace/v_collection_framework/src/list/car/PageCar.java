package list.car;

import list.task.DBConnecter;

public class PageCar {
	public static void main(String[] args) {
		Car car = new Car();
		CarDealer carDealer = new CarDealer();
		Engine engine = new Engine();
		engine.setFuelType("fuel1");
		engine.setHp(100);
		engine.setModel("가솔린");
		
		car.setName("소나타");
        car.setPrice(3000);
        car.setType("세단");
        car.setEngine(engine);
        
        carDealer.insert(car); // 미리 넣어두기
        
        Car newCar = new Car();
        Engine newEngine = new Engine();
        newEngine.setModel("fuel2");
        newEngine.setHp(200);
        newEngine.setFuelType("디젤");
        newCar.setName("투싼");
        newCar.setPrice(3500);
        newCar.setType("SUV");
        newCar.setEngine(newEngine);
        
        Car errCar = new Car(); // 삽입 안되는 차 
        Engine errEngine = new Engine();
        errEngine.setModel("fuel3");
        errEngine.setHp(300);
        errEngine.setFuelType("디젤");
        errCar.setName("투싼");
        errCar.setPrice(3550);
        errCar.setType("SU");
        errCar.setEngine(newEngine);
        
        System.out.println("=======");
        car.setName("shallo copy test");
        car.getEngine().setHp(0);
        carDealer.insert(errCar);
        carDealer.insert(newCar);
        System.out.println(DBConnecter.cars);
        System.out.println("=======");
        
        System.out.println(carDealer.findHpByName("투싼"));
        System.out.println(carDealer.findHpByName("에러"));
        
        System.out.println(carDealer.findAllByType("SUV")); 
        
        System.out.println(carDealer.findAllByMinHorsepower(50));
        carDealer.updateHpByFuelType("디젤", 0);
        System.out.println(DBConnecter.cars);
        
        carDealer.updateHpByType("SUV", 30);
        System.out.println(DBConnecter.cars);
	}
}
