package list.fruit;

import java.util.ArrayList;
import java.util.Arrays;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		Fruit fruit = null;
		Market market = new Market();
		String[] arName = {
			    "apple",
			    "banana",
			    "grape",
			    "strawberry",
			    "orange",
			    "watermelon",
			    "mango",
			    "cherry",
			    "pineapple",
			    "blueberry"
			};
		int[] arPrice = { 1000,2000,1200,3000,4000,1500,2400,6000,9000};
		
		for(int i = 0; i< arPrice.length; i++) {
			fruit = new Fruit(arName[i],arPrice[i]);
			DBConnecter.fruits.add(fruit);
		}
		ArrayList<Fruit> arrayList = new ArrayList<>(DBConnecter.fruits);
//		arrayList = new ArrayList<>();
		arrayList.get(0).setName("asd");
		System.out.println(arrayList);
		
		
	}
}
