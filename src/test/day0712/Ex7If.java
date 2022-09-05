package test.day0712;

import java.util.Scanner;

public class Ex7If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if 조건문은 if(조건식) 조건식의 결과가 true or false
		Scanner sc=new Scanner(System.in);
//		int x,y,max;
//		System.out.println("두 수 x,y를 입력하시오");
//		x=sc.nextInt();
//		y=sc.nextInt();
//		if(x>y)
//			max=x;//여러 문장일땐 {}를 쓰는데 1문장이라 안써도 됨 ex)max=x, ???=y
//		else
//			max=y;
//		
//		System.out.println("더 큰 값은 "+max);
		
		
		//이번에는 3개의 숫자를 입력 후 가장 큰 값을 max에 저장 후 출력
		int a,b,c,max;
		System.out.println("3개의 숫자를 입력하시오");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
			max=a;
		else if(b>a && b>c)
			max=b;
		else
			max=c;
		System.out.println("가장 큰 값은"+max);//3~4개 정도까지는 if문 그 이상은 배열쓰는게 편함
		
		
		
		
	}

}
