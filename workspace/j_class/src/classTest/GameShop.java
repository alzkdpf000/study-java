package classTest;

public class GameShop {
	String itemName;
	int price;
	int stock;
	
	public GameShop(String itemName, int price,int stock) {
		this.itemName = itemName;
		this.price = price;
		this.stock = stock;
	}
	
	
	void sell(Player player) {
		player.money -=this.price*(1 - player.discountRate);
		stock--;
	}
}
