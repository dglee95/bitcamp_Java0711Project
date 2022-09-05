package test.day0713;

import java.util.Random;

public class Ex14Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		System.out.println("0~9 난수");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(10);//0~9
			System.out.println(n);
		}
		System.out.println("-------------");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(100);//0~99
			System.out.println(n);
		}
		System.out.println("-------------");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(100)+1;
			System.out.println(n);//1~100
		}
		System.out.println("-------------");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(26)+65;//
			System.out.println((char)n);//65~90
		}
		System.out.println("-------------");
		
		//최대값은 최솟값은 b 최댓값은 b+a-1
	}

}
