package test.day0712;

import java.util.Scanner;

public class Ex6Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sang,color;
		int price;
		System.out.println("상품명");
		sang=sc.nextLine();
		System.out.println("가격");
		//price=sc.nextInt();
		price=Integer.parseInt(sc.nextLine());//한 줄을 String으로 읽어서 Int로 변환
		System.out.println("색상명");
		color=sc.nextLine();
		System.out.println(sang+" 상품은 "+price+"원이고 색상은 "
				+color+"색입니다");
	}

}
