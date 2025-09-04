package bank;

public class Shinhan extends Bank {
	public Shinhan() {
		;
	}

	public Shinhan(String name, String account, String phone, String password, int money) {
		super(name, account, phone, password, money);
	}

	@Override
	public void deposit(int money) {
		super.deposit(money / 2);
	}
}
