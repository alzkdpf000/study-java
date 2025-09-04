package bank;

import java.util.Random;
import java.util.Scanner;

public class ATMTeacher {
   // 화면

   public static void main(String[] args) {
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[arrBank.length];
      String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

      String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
      String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
      Scanner sc = new Scanner(System.in);

      int bankNumber = 0, choice = 0, myBankNumber = 0;
      String account = null, password = null, phone = null, name = null;
      Bank user = null;
      int money = 0, withdrawMoney = 0, temp = 0;
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

      while (true) { // 먼저 은행 선택해주는 창
         System.out.println(message);
         bankNumber = sc.nextInt(); // 선택한 은행 번호 받아 주기

         if (bankNumber == 4) {// 4면 앱 종료
            break;
         }

         bankNumber--; // 인덱스는 0부터이므로 -1 해주기

         while (true) { // 은행 선택하고 나서 메뉴 선택창
            System.out.println(menu);
            choice = sc.nextInt(); // 선택한 메뉴 번호

            if (choice == 6) { // 6번이면 다시 은행 선택하는 창으로 이동
               break;
            }

            switch (choice) {
               case 1: // 계좌 개설
                  // 나중에 은행이 더 늘어날 수 있으므로 간편하게 배열로 넣어주기
                  Bank[] arBank = { new Shinhan(), new Kookmin(), new Kakao() };

                  while (true) { // 계좌번호를 6자리 랜덤으로 생성하는데 중복이 있을 수 있으니 체크해서 중복이 없을 때 까지
                     account = String.valueOf(random.nextInt(900000) + 100000);
                     account = bankNumber + account;
                     if (Bank.checkAccount(arrBank, arCount, account) == null) {
                        break;
                     }
                  }

                  System.out.println(nameMessage);
                  name = sc.next(); // 이름 입력

                  while (true) { // 비밀번호가 숫자만 들어 있는지
                     System.out.println(passwordMessage);
                     password = sc.next();
                     passwordCheck = 0; // 비밀번호가 정말 숫자만 4자리가 들어있는지 체크

                     if (password.length() == 4) { // 길이가 4인지 체크
                        for (int i = 0; i < password.length(); i++) {
                           char c = password.charAt(i);
                           if (c >= 48 && c <= 57) { // 들어가 있는 숫자 개수 세기
                              passwordCheck++;
                           }
                        }
                     }

                     if (passwordCheck == 4) { // 숫자만 4개 인지 체크하고
                        break;
                     }
                  }

                  while (true) { // 휴대전화 번호 계속 체크하기
                     System.out.println(phoneMessage);
                     phone = sc.next();
                     phoneCheck = 0; // 마찬가지로 숫자만 11자리가 있는지 체크

                     phone = phone.replaceAll("-", ""); // 만약 010-1324-1234로 들어오면 편의성을 위해 "-" 제거하기

                     if (phone.length() == 11) { // 입력한 문자열이 11인지
                        for (int i = 0; i < phone.length(); i++) {
                           char c = phone.charAt(i);
                           if (c >= 48 && c <= 57) { // 입력한 문자열의 숫자 개수 세주기
                              phoneCheck++;
                           }
                        }

                        if (phoneCheck == 11) { // 숫자만 11개 입력했는지 체크하고 나서 중복 검사
                           if (Bank.checkPhone(arrBank, arCount, phone) == null) {
                              break;
                           }
                        }
                     }
                  }

                  user = arBank[bankNumber]; // 유저가 선택한 은행번호로 계좌 개설 해주기
                  // 선택한 은행에다가 정보 넣어주기
                  user.setAccount(account);
                  user.setName(name);
                  user.setPassword(password);
                  user.setPhone(phone);

                  arrBank[bankNumber][arCount[bankNumber]++] = user; // 이제 2차원 배열에다가 개설했다고 말해주고 해당 은행의 고객 수 증가시키기

                  System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
                  System.out.println("고객님의 소중한 계좌번호: " + account);
                  break;
               case 2: // 입금 하기
                  System.out.println(accountMessage);
                  account = sc.next();

                  System.out.println(passwordMessage);
                  password = sc.next();

                  user = Bank.login(arrBank, arCount, account, password); // 사용자가 존재하는 확인

                  if (user != null) { // 유저가 존재할 시
                     myBankNumber = user.getAccount().charAt(0) - 48; // 우리가 계좌번호 맨 앞자리를 은행 번호로 했으므로 그 앞자리를 통해 어떤 은행인지
                                                                      // 검사
                     if (myBankNumber == bankNumber) { // 내 계좌를 준 은행의 번호와 내가 선택한 번호가 일치하는지 검사
                        System.out.println(depositMessage);
                        money = sc.nextInt();

                        if (money > 0) { // 일단 입금할 돈을 제대로 입력했는지 체크 (양수인지만 체크)
                           user.deposit(money);
                           System.out.println("현재 잔액: " + user.getMoney() + "원");
                        } else { // 음수면 다시 시도하세요. 에러 메시지 출력
                           System.out.println(errorMessage);
                        }
                     } else { // 다른 은행을 선택한 경우
                        System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
                     }
                     // 현 로직에서 instanceof를 통해 고객의 은행사를 구분하는 것은 무리가 있다.
                     // 이것도 가능하지만 너무 복잡하고 코드가 너무 길어짐 유지 보수성이 안좋아진다.
                     // 그래서 계좌번호 맨 앞 숫자로 검사하는 것이 낫다.
                     // if(bankNumber == 0) {
                     // if(user instanceof Shinhan) {
                     // System.out.println(depositMessage);
                     // money = sc.nextInt();
                     //
                     // user.deposit(돈);
                     // }
                     // }else if(bankNumber == 1) {
                     // if(user instanceof Kookmin) {
                     // System.out.println(depositMessage);
                     // money = sc.nextInt();
                     //
                     // user.deposit(돈);
                     // }
                     // }else if(bankNumber == 2) {
                     // if(user instanceof Kakao) {
                     // System.out.println(depositMessage);
                     // money = sc.nextInt();
                     //
                     // user.deposit(돈);
                     // }
                     // }
                  } else { // 로그인 실패 시 로그인 실패했다고 메시지로 알려주기
                     System.out.println(loginFailMessage);
                  }
                  break;
               case 3: // 출금 하기
                  System.out.println(accountMessage);
                  account = sc.next();

                  System.out.println(passwordMessage);
                  password = sc.next();

                  user = Bank.login(arrBank, arCount, account, password); // 사용자가 존재하는 확인

                  if (user != null) { // 계좌가 있는 경우
                     System.out.println(withdrawMessage);
                     withdrawMoney = sc.nextInt(); // 출금할 계좌 입금 받기

                     // Kookmin같은 경우는 50프로 수수료가 있으며, 출금할 수 있는지 체크 해주기 위해 잠시 임시 temp라는 변수에다가
                     // 은행에 따라 필요한 금액 저장
                     temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;

                     if (withdrawMoney > 0) { // 일단 입력한 출금할 금액이 양수인지 체크
                        if (temp <= user.getMoney()) { // 위에서 내가 출금할 금액이 충분히 있는지 검사
                           user.withdraw(withdrawMoney); // 출금
                           System.out.println("현재 잔액: " + user.getMoney() + "원");

                        } else { // 돈이 부족할 시에 출력
                           System.out.println(errorMessage);
                        }

                     } else { // 출금할 금액이 양수가 아니고 음수일 시
                        System.out.println(errorMessage);
                     }
                  } else { // 로그인 실패 시
                     System.out.println(loginFailMessage);
                  }
                  break;
               case 4: // 잔액 조회
                  System.out.println(accountMessage);
                  account = sc.next();

                  System.out.println(passwordMessage);
                  password = sc.next();

                  user = Bank.login(arrBank, arCount, account, password); // 사용자가 존재하는 확인
                  if (user != null) { // 유저가 존재하면 해당 유저 잔액 보여주기
                     System.out.println("현재 잔액: " + user.showBalance() + "원"); // 여기서는 은행이 kakao면 kakao 클래스 내부에서 값을
                                                                               // 변경해주므로 호출만 해주면 된다
                  }
                  break;
               case 5: // 계좌번호 찾기
                  System.out.println(phoneMessage);
                  phone = sc.next();

                  System.out.println(passwordMessage);
                  password = sc.next();
                  // 사실 여기에서도 비밀번호와 휴대전화부분 하는 부분 추가해주면 좋음
                  /*
                   * while(true) { // 비밀번호가 숫자만 들어 있는지
                   * System.out.println(passwordMessage);
                   * password = sc.next();
                   * passwordCheck = 0; // 비밀번호가 정말 숫자만 4자리가 들어있는지 체크
                   * 
                   * if(password.length() == 4) { // 길이가 4인지 체크
                   * for (int i = 0; i < password.length(); i++) {
                   * char c = password.charAt(i);
                   * if(c >= 48 && c <= 57) { // 들어가 있는 숫자 개수 세기
                   * passwordCheck++;
                   * }
                   * }
                   * }
                   * 
                   * if(passwordCheck == 4) { // 숫자만 4개 인지 체크하고
                   * break;
                   * }
                   * }
                   * 
                   * while(true) { // 휴대전화 번호 계속 체크하기
                   * System.out.println(phoneMessage);
                   * phone = sc.next();
                   * phoneCheck = 0; // 마찬가지로 숫자만 11자리가 있는지 체크
                   * 
                   * phone = phone.replaceAll("-", ""); // 만약 010-1324-1234로 들어오면 편의성을 위해 "-" 제거하기
                   * 
                   * if(phone.length() == 11) { // 입력한 문자열이 11인지
                   * for (int i = 0; i < phone.length(); i++) {
                   * char c = phone.charAt(i);
                   * if(c >= 48 && c <= 57) { // 입력한 문자열의 숫자 개수 세주기
                   * phoneCheck++;
                   * }
                   * }
                   * 
                   * if(phoneCheck == 11) { // 숫자만 11개 입력했는지 체크하고 나서 중복 검사
                   * if(Bank.checkPhone(arrBank, arCount, phone) == null) {
                   * break;
                   * }
                   * }
                   * }
                   * }
                   * 
                   * 
                   */
                  user = Bank.checkPhone(arrBank, arCount, phone); // 휴대전화 번호가 존재하는지 체크
                  if (user != null) { // 유저가 존재하면
                     while (true) { // 계좌번호 다시 생성해주기
                        account = String.valueOf(random.nextInt(900000) + 100000);
                        account = bankNumber + account;
                        if (Bank.checkAccount(arrBank, arCount, account) == null) {
                           break;
                        }
                     }
                     // 다시 생성된 계좌로 바꿔주기
                     user.setAccount(account);
                     System.out.println("고객님의 소중한 계좌번호: " + account);
                  } else { // 유저가 존재하지 않음
                     System.out.println(errorMessage);

                  }
                  break;

               default: // 1, 2, 3, 4, 5, 6번을 선택 안하면 기본으로 에러메시지 출력
                  System.out.println(errorMessage);
                  break;
            }

         }
      }
   }
}
