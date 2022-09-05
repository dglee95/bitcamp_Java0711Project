package test.day0713;

import java.util.Scanner;

public class EX15Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 n을 입력하면 1부터 n까지의 합계를 구하라
		//1번 문제
		Scanner sc=new Scanner(System.in);
		int num,sum;
		sum=0;
		System.out.println("숫자 입력:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다",num,sum);
	}

}
