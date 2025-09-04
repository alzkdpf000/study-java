package anonymousTest;

public class Nike {
	public void register(Form form,String spot) {

		for (int i = 0; i < form.getMenu().length; i++) {
			System.out.println(form.getMenu()[i]);
		}
		if(spot.equals("jamsil")) {
			form.sell("축구공");
			
		}else {
			System.out.println("무료 나눔 행사");
		}
//		강사님버전은 jamsil은 Form, gangnam 은 FormAdapter라고 받아서
//		instanceof를 사용해서 구분
	}
}
