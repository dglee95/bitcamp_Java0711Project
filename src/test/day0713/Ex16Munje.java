package test.day0713;

import java.util.Scanner;

public class Ex16Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 수 x,y를 입력 후 x의 y승 값을 구하시오
		//2번 문제
		Scanner sc=new Scanner(System.in);
		int x,y,score;
		score=1;
		System.out.println("x^y를 구하기 위한 x,y 입력");
		x=sc.nextInt();
		y=sc.nextInt();
		
		for(int i=1;i<=y;i++)
		{
			score*=x;
		}
		System.out.println(score);
	}

}
