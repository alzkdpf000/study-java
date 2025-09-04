package dateTest;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
//      기본으로 알아야할 날짜 타입(Date, Calendar)
//      Date: 기본적으로 날짜 계산을 할 때에 사용되는 클래스이다.
//           하지만 날짜를 조정하거나 활용할 때에는 여러 이유로 사용하지 않는다.
//      Calendar: 날짜를 조정하거나 활용할 때에 사용되는 클래스이다.

//      Date date = new Date();
//      System.out.println(date);

//      Calendar now = Calendar.getInstance();
//      System.out.println(now);
//      System.out.println(now.get(Calendar.YEAR));
//      System.out.println(now.get(Calendar.MONTH));
//      System.out.println(now.get(Calendar.DATE));

//      원하는 형식의 날짜로 변경(Date를 String으로)
		Calendar date = Calendar.getInstance();
		date.set(2035, 11, 4);
		System.out.println(date);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = simpleDateFormat.format(date.getTime());
		System.out.println(format);

//      특정 형식의 문자열을 날짜로 변경(String을 Date로)
		String content = "2025-05-01";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(simpleDateFormat2.parse(content));
			
		} catch (Exception e) {
			System.out.println("올바른 형식이 아닙니다.");
		}
		
		Calendar date1 = Calendar.getInstance();
		date1.set(2025,6,25);
		Date now = new Date();
		System.out.println(date1.getTime().getTime() - now.getTime());
//		번외
		LocalDate localDate = LocalDate.parse("2025-06-12");
		System.out.println(localDate);
		
		String format1 = localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(format1);
		
		LocalDateTime localDateTime = LocalDateTime.of(2025, 12,4,12,24);
		System.out.println(localDateTime);
		LocalDateTime now1 = LocalDateTime.now();
		localDateTime.isBefore(now1); // 작니? 
		localDateTime.isAfter(now1); // 크니?
		localDateTime.isEqual(now1); // 같니?
		
		Duration duration = Duration.between(localDateTime, now1);
		System.out.println("초" + duration.getSeconds());
		System.out.println("분" + duration.toMinutes());
		System.out.println("시" + duration.toHours());
		
	}
}
