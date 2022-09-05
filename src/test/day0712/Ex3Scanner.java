package test.day0712;

import java.util.Scanner;

public class Ex3Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드 입력을 하기 위한 클래스 생성
		 * Class가 가진 메서드는 static메서드와 인스턴스 메서드
		 * static이 안 붙은게 99%
		 * 안 붙은 일반 메서드는 인스턴스 메서드
		 * 인스턴스 변수가 있어야만 인스턴스 메서드 호출이 가능한데, 주소를 갖고있는 클래스를 의미
		 * 인스턴스 변수로 호출할 수 있는 메서드가 인스턴스 메서드
		 * 스캐너도 마찬가지로 인스턴스 메서드 100% static 메서드는 0%
		 * 그래서 new로 생성해야함
		 * 메서드 클래스 변수
		 */
		
		Scanner sc=new Scanner(System.in);//생성자 호출 system.in 이 InputStream 타입 sc는 변수명이라 a, b해도 됨 (인스턴스 변
		String msg;
		System.out.println("메세지를 입력해보세요");
		msg=sc.nextLine();//엔터를 누를 경우 한 줄 통째로 읽어온다(공백 포함)
		System.out.println("오늘의 메세지는 "+msg+"입니다");
		//\":"출력, \':'출력, \\:\출력
		System.out.println("오늘의 메세지는 \""+msg+"\"입니다");
		System.out.println("오늘의 메세지는 \'"+msg+"\'입니다");
		System.out.println("오늘의 메세지는 \\"+msg+"\\입니다");
		
	}

}
