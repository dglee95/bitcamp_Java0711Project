package test.day0712;

import java.util.Scanner;

public class Ex12Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,ddi;
		int year;
		//이름과 태어난 년도를 입력
		System.out.println("이름");
		name=sc.nextLine();
		System.out.println("출생년도");
		year=sc.nextInt();

		//태어난 년도에 따라 띠를 구해보자
		int mod=year%12;// 라고 대입해도 됨
		
		if(mod<0)
		{
			System.out.println("잘 못 입력하셨습니다");
			return;
		}
		
		ddi=mod==0?"원숭이":mod==1?"닭":mod==2?"개":mod==3?"돼지":
			mod==4?"쥐":mod==5?"소":mod==6?"호랑이":mod==7?"토끼":
			mod==8?"용":mod==9?"뱀":mod==10?"말":"양";													
		System.out.println(name+"님의 출생년도는 "+year+"년 이고 "+ddi+"띠입니다.");
		System.out.printf("%s님은 %d년생이고 %s띠입니다.\n",name,year,ddi);


	}

}
