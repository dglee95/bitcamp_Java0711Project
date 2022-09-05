package test.day0713;

import java.util.Scanner;

public class Ex5Jumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String jumin;
		System.out.println("주민번호 입력(하이폰 포함)");
		while(true)
		{
			jumin=sc.nextLine();
			if(jumin.length()!=14)//string의 length는 ()가 있음
			{
				System.out.println("\t다시 입력해주세요");
				continue;
			}
			break;
		}
		System.out.println(jumin);
		//891212-1234567
		char gender=jumin.charAt(7);//문자로 인식
		if(gender==49 || gender=='3')//''없이 넣으면 1의 아스키코드 문자가 나옴 1=(Ascii)49
			System.out.println("남자!!");
		else if(gender==50 || gender=='4')
			System.out.println("여자!!");
		else
			System.out.println("외계인!!");
		
		
		//생년월일 얻기
		//gender==1,2일 경우 1900더하기 gender==3,4일 경우 2000 더하기
		String sYear=jumin.substring(0, 2);//0~1까지 추출
		String sMonth=jumin.substring(2, 4);//2~3까지
		String sDay=jumin.substring(4, 6);//4~5까지
		if(gender=='1')
		System.out.println("남자: 19"+sYear+"년 "+sMonth+"월 "+sDay+"일생");
		else if(gender=='2')
			System.out.println("여자: 19"+sYear+"년 "+sMonth+"월 "+sDay+"일생");
		else if(gender=='3')
			System.out.println("남자: 20"+sYear+"년 "+sMonth+"월 "+sDay+"일생");
		else if(gender=='4')
			System.out.println("여자: 20"+sYear+"년 "+sMonth+"월 "+sDay+"일생");
		
		int iYear=Integer.parseInt(sYear);
		if(gender=='1' || gender=='2')
			iYear+=1900;
		else if(gender=='3' || gender=='4')
			iYear+=2000;
		System.out.println("생년월일 : "+iYear+"년 "+sMonth+"월 "+sDay+"일생");
			
	}

}
