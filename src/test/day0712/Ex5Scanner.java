package test.day0712;

import java.util.Scanner;

public class Ex5Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		System.out.println("나이");
		age=sc.nextInt();
		//나이를 age가 읽은 후 엔터문자가 키보드버퍼라는 곳에 저장
		//문자열은 키보드버퍼가 비어있어야 비로소 키보드를 읽는다
		//키보드 버퍼를 비우는 법
		sc.nextLine();//엔터를 읽어서 소멸
		//엔터를 소멸시키는게 귀찮아서 age를 nextLine으로 받아서 Integer.parseInteger로 형변환함
		System.out.println("이름");
		name=sc.nextLine();
		System.out.println(name+"님의 나이는 "+age+"세입니다!");
		
	}

}
