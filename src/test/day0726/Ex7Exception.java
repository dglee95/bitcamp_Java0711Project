package test.day0726;

import java.util.Scanner;

public class Ex7Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("두개의 숫자를 입력해주세요");
		try {
		a=Integer.parseInt(sc.nextLine());
		b=Integer.parseInt(sc.nextLine());
		
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		} catch (NumberFormatException e) {
			System.out.println("문자가 입력되었네요:"+e.getMessage());
//			e.printStackTrace();//에러 라인 추적 빨간글씨 안나오게 하고 싶으면 위의 코드 사용
		}
		
		
		System.out.println("** 정상종료 **");
	}

}
