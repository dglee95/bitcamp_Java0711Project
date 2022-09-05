package test.day0715;

import java.util.Calendar;
import java.util.Date;

public class Ex6Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("현재날짜 얻기");//Date
		Date date=new Date();//현재 날짜
		//년도는 1900이 빠진 값으로 반환 +1900
		int year=date.getYear()+1900;//deprecated
		//월은 1이 빠진 값으로 반환 +1
		int month=date.getMonth()+1;//deprecated
		int day=date.getDate();//deprecated
		//요일숫자 일:0 월:1 화:2 수:3 목:4 금:5 토:6 
		int week=date.getDay();
		System.out.println(year+"-"+month+"-"+day);
		System.out.println("요일숫자"+week);// 5가 금요일
		
		System.out.println("현재날짜 얻기 #2");//Calendar
		Calendar cal=Calendar.getInstance();
		int year2=cal.get(Calendar.YEAR);//년 상수
		int month2=cal.get(Calendar.MONTH)+1;//월 상수0~11반환
		int day2=cal.get(Calendar.DATE);//일 상수
		int week2=cal.get(Calendar.DAY_OF_WEEK);//요일 상수
		
		System.out.println(year2+"-"+month2+"-"+day2);
		System.out.println("요일숫자:"+week2);//일:1 월:2 화:3 수:4 목:5 금:6
		
		System.out.println("Date클래스를 이용해서 2021-5-1이 무슨 요일인지");
		Date date2=new Date(2021-1900,5-1,1);//생성자로 보내는 것
		int week3=date2.getDay();
		System.out.println(week3);//금요일 6
		
		System.out.println("Date클래스를 이용해서 2022-12-1이 무슨 요일인지");
		Date date3=new Date(2022-1900,12-1,1);
		System.out.println(date3.getDay());//4-목
		
		
	}

}
