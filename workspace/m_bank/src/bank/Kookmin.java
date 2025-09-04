package bank;

public class Kookmin extends Bank {
	public Kookmin() {
		;
	}

	public Kookmin(String name, String account, String phone, String password, int money) {
		super(name, account, phone, password, money);
	}

	@Override
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		money *= 1.5;
		super.withdraw(money);
	}
}
