package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//   화면
	public static void main(String[] args) {

		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[arrBank.length]; // 0 신한은행 고객 수 1 국민은행 고객 수 2 카카오뱅크 고객 수
		String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
		Scanner sc = new Scanner(System.in);

		int bankNumber = 0, choice = 0, myBankNumber = 0;
		String account = null, password = null, phone = null, name = null;
		Bank user = null;
		int money = 0, withdrawMoney = 0;
		Random random = new Random();
		int passwordCheck = 0, phoneCheck = 0;

		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 제외): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";
		String loginMessage = "로그인을 하기위한 계좌번호와 비밀번호는 입력해주세요 \t ex) 1234 1234";

		while (true) {
			System.out.println(message);
			bankNumber = sc.nextInt();
			if (bankNumber == 4)
				break;
			myBankNumber = bankNumber - 1;
			System.out.println(arBankName[myBankNumber]);
			while (true) {
				System.out.println(menu);
				choice = sc.nextInt();
				if (choice == 6) {
					break;
				} else if (choice == 1) {
					System.out.println(accountMessage);
					account = bankNumber + "" + (random.nextInt(1000000) + 100000);
					System.out.println(account);
					System.out.println(nameMessage);
					name = sc.next();
					System.out.println(passwordMessage);
					password = sc.next();
					System.out.println(phoneMessage);
					phone = sc.next();
					switch (myBankNumber) {
					case 0:
						user = new Shinhan(name, account, phone, password, 100000);
						break;
					case 1:
						user = new Kookmin(name, account, phone, password, 100000);
					case 2:
						user = new Kakao(name, account, phone, password, 100000);
					default:
						System.out.println(errorMessage);
						break;
					}

					arrBank[myBankNumber][arCount[myBankNumber]] = user;
					arCount[myBankNumber] += 1;
				}
				switch (choice) {
				case 2:
					System.out.println(depositMessage);
					money = sc.nextInt();
					if (user instanceof Shinhan) {
						Shinhan shinhan = (Shinhan) user;
						shinhan.deposit(money);
					} else {
						user.deposit(money);
					}
					break;
				case 3:
					System.out.println(withdrawMessage);
					withdrawMoney = sc.nextInt();
					if (user instanceof Kookmin) {
						Kookmin kookmin = (Kookmin) user;
						kookmin.withdraw(withdrawMoney);
					} else {
						user.withdraw(withdrawMoney);
					}
					break;
				case 4:
					if (user instanceof Kakao) {
						Kakao kakao = (Kakao) user;
						System.out.println(kakao.showBalance());
					} else {
						System.out.println(user.showBalance());

					}
					break;
				case 5:
					System.out.println(phoneMessage);
					phone = sc.next();
					user = Bank.checkPhone(arrBank, arCount, phone);
					if (user == null) {
						System.out.println(errorMessage);
					} else {
						System.out.println(user.getAccount());
					}
					break;
				default:
					System.out.println(errorMessage);
					break;
				}
//				else {
//					System.out.println(loginMessage);
//					account = sc.next();
//					password = sc.next();
//					System.out.println(account + " ," + password);
//					user = Bank.login(arrBank, arCount, account, password);
//					System.out.println(user);
//					if (user == null) {
//						System.out.println(loginFailMessage);
//					} else {
//						
//					}

			}

		}
	}
}
