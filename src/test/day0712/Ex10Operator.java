package test.day0712;

import java.util.Scanner;

public class Ex10Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//조건(삼항) 연산자: 조건식?참일때값:거짓일때값
		int x,y,max;
		System.out.println("x,y를 입력하시오");
		x=sc.nextInt();
		y=sc.nextInt();
		max=x>y?x:y;
		System.out.println("더 큰 값은 "+max);
		System.out.println("더 큰 값은 "+(x>y?x:y));//출력문 안에다 직접 쓰는 경우 ()로 먼저 계산되게
		System.out.println("첫번째 숫자가 더 "+(x>y?"크다":"작다"));
		System.out.println((x>y?"첫 ":"두 ")+"번째 숫자가 더 크다");
		
		
	}

}
