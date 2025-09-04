package classTest;

public class ClassTask11 {
//	게임샵
//	아이템이름
//	가격
//	재고

//	플레이어
// 	닉네임
//	게임머니
//	할인율 
	public static void main(String[] args) {
		Player player = new Player("lion",1_000_000, 0.2);
		
		GameShop gameShop = new GameShop("card", 2_000, 10);
		// 2000 * 0.8 = 1600
		gameShop.sell(player);
		
		System.out.println(player.money);
		System.out.println(gameShop.stock);
	}
}
