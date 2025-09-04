package anonymousTest;

public class RoadShop {
	public static void main(String[] args) {
		Nike jamsil = new Nike();
		Nike gangnam = new Nike();
		jamsil.register(new FormAdapter() {
			
			@Override
			public void sell(String order) {
				// TODO Auto-generated method stub
				System.out.println("어서오세요 나이키입니다");
				System.out.println("필요한 것 있으시면 말씀해주세요");
				for(int i = 0; i <getMenu().length; i++) {
					if(getMenu()[i].equals(order)) {
						System.out.println(order + "판매 완료");
					}
				}
				System.out.println("멤버쉽 적립했습니다.");
				System.out.println("안녕히 계세요.");
			}
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return new String[] {"축구화","농구공","운동화","축구공"};
			}
		},"jamsil");
		System.out.println("강남점입니다 .");
		
		
		gangnam.register(new FormAdapter() {
		
			@Override
			public String[] getMenu() {
				return new String[] {"축구화","농구공", "운동화", "축구공"};
			}
		},"gangnam");
		
	}
}
