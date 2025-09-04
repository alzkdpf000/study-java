package list.fruit;

import java.util.ArrayList;
import java.util.Arrays;

import list.task.DBConnecter;

public class Market {

	public void add(Fruit fruit) {
		for(int i = 0; i<DBConnecter.fruits.size(); i++) {
			if(!DBConnecter.fruits.get(i).getName().equals(fruit.getName())) {
				DBConnecter.fruits.add(new Fruit(fruit));				
			}
		}
	}

	public void remove(String name) {
		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			if (DBConnecter.fruits.get(i).getName().equals(name)) {
				DBConnecter.fruits.remove(i);
			}
		}
	}

	public ArrayList<Fruit> findAll() {
		ArrayList<Fruit> temps = new ArrayList<>();
		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			temps.add(new Fruit(DBConnecter.fruits.get(i)));
		}
		new ArrayList<>(Arrays.asList(DBConnecter.fruits));
		return temps;
	}

	public int findPriceByName(String name) {
		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			if (DBConnecter.fruits.get(i).getName().equals(name)) {
				return DBConnecter.fruits.get(i).getPrice();
			}
		}
		return -1;
	}

	public boolean isLessThanAvgPrice(String name) {
		int targetPrice = 0;
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			sum += DBConnecter.fruits.get(i).getPrice();
			if (DBConnecter.fruits.get(i).getName().equals(name)) {
				targetPrice = DBConnecter.fruits.get(i).getPrice();
			}
		}
		avg = sum / DBConnecter.fruits.size();
		return targetPrice  < avg ;
	}
}
