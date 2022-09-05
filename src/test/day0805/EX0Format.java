package test.day0805;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EX0Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 날짜나 숫자를 원하는 패턴으로 변경 후 문자열로 얻기
		//현재 날짜
		Date date=new Date();
		//문자열로 변환
		String s1=date.toString();
		System.out.println(s1);//Fri Aug 05 09:57:59 KST 2022
		
		//원하는 패턴대로 출력하고자 할 경우
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분");
		System.out.println(sdf1.format(date));
		

		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd EEEE");
		System.out.println(sdf2.format(date));
		

		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd a hh시");
		System.out.println(sdf3.format(date));
		
		//한줄로 줄여서 출력
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
		
		//숫자
		//getCurrencyInstance로 생성할 경우 ￦2,666,777 이런식으로 출력
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.GERMANY); // 클래스명으로 생성 안되서 스테이틱 메서드로 생성
		String n1=nf1.format(2666777);
		System.out.println(n1);
		
		NumberFormat nf2=NumberFormat.getInstance();
		String n2=nf2.format(2666777);
		System.out.println(n2);
		
		//한줄로 줄여서 출력
		int money=3456780;
		System.out.println(NumberFormat.getCurrencyInstance().format(money));
		System.out.println(NumberFormat.getInstance().format(money));
		
	}

}
