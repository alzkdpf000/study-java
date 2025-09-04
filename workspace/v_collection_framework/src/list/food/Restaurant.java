package list.food;

import java.util.ArrayList;

import list.task.DBConnecter;
/*
 * [실습 2]
음식 정보를 담을 클래스 선언(Food)
   - 음식 이름
   - 음식 가격
   - 음식 종류(한식, 중식, 일식, 양식)

CRUD관련 기능을 담아놓을 클래스 선언(Restaurant)
   - 음식 추가
   - 음식 이름으로 음식 종류 조회
   - 사용자가 원하는 종류의 음식 전체 조회
   - 음식 종류 수정 후 가격 10% 상승
   - 사용자가 원하는 종류의 음식 개수 조회
 */
public class Restaurant {
	private static final String[] FOOD_TYPE_CONTENT = {"한식","중식","일식","양식"};
	public void insert(Food food) {
		boolean flag = false;
		for(String t : FOOD_TYPE_CONTENT) {
			if(t.equals(food.getType())) {
				flag = true;
			}
		}
		if(flag) {
			for(Food f : DBConnecter.foods) {
				if(!f.getName().equals(food.getName())) {
					DBConnecter.foods.add(new Food(food));
				}
			}
		}
		
	}
	
	public String findNameByType(String name) {
		for(Food f : DBConnecter.foods) {
			if(f.getName().equals(name)) {
				return f.getType();
			}
		}
		return "데이터 없음";
	}
	
	public ArrayList<Food> findAllByType(String type){
		ArrayList<Food> foods = new ArrayList<Food>();
		for(Food f : DBConnecter.foods) {
			if(f.getType().equals(type)) {
				foods.add(new Food(f));
			}
		}
		return foods;
	}
	public void updateType(String name, String type) {
		for(Food f : DBConnecter.foods) {
			if(f.getName().equals(name)) {
				f.setPrice((int)(f.getPrice() *(1.1))); 
				f.setType(type);
			}
		}
	}
	public int findCntByType(String type){
		int cnt = 0;
		for(Food f : DBConnecter.foods) {
			if(f.getType().equals(type)) {
				cnt++;
			}
		}
		return cnt;
	}
}
