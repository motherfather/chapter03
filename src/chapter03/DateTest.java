package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
//		System.out.println(date);
		printDate(date);
		printDate2(date);

		// 년(1900+@), 월(0-11), 일
		Date d1 = new Date(2000, 8, 1);		// deprecated -> 없어질 예정
//		System.out.println(d1);
		printDate(d1);
		
		// 년(1900+@), 월(0-11), 일, 시간, 분
		Date d2 = new Date(2000, 8, 1, 12, 30);		// deprecated -> 없어질 예정
//		System.out.println(d2);
		printDate(d2);
		
		// 년(1900+@), 월(0-11), 일, 시간, 분, 초
		Date d3 = new Date(2000, 8, 1, 12, 30, 30);		// deprecated -> 없어질 예정
//		System.out.println(d3);
		printDate(d3);

		// 1970년 1월 1일 00:00:00 부터 밀리세컨드값
		long milliseconds = 24L * 60 * 60 * 1000 * 365 * 50;
		Date d4 = new Date(milliseconds);
//		System.out.println(d4);
		printDate(d4);
		printDate2(d4);
				
//		Date d5 = new Date(117, 2, 6);
//		System.out.println(d5);
		
		
	}
	
	private static void printDate(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(d));
	}
	
	private static void printDate2(Date d) {
		// 연도
		int year = d.getYear();
		
		// 월
		int month = d.getMonth();
		
		// 일
		int day = d.getDay();
		
		// 시
		int hours = d.getHours();
		
		// 분
		int minutes = d.getMinutes();
		
		// 초
		int seconds = d.getSeconds();
		
		System.out.println((year + 1900) + "년 " + (month + 1) + "월 " + day + "일 " + 
												hours + ":" + minutes + ":" + seconds);
	}

}
