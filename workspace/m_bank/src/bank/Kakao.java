package bank;

public class Kakao extends Bank {
	public Kakao() {
		;
	}

	public Kakao(String name, String account, String phone, String password, int money) {
		super(name, account, phone, password, money);
	}

	@Override
	public int showBalance() {
		this.setMoney(this.getMoney() / 2);
		return super.showBalance();
	}
}
