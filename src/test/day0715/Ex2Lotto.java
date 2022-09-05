package test.day0715;

import java.util.Random;
import java.util.Scanner;

public class Ex2Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3중 for문
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int money;
		int []lotto=new int[6];
		System.out.println("구입할 가격을 입력하세요");
		money=sc.nextInt();
		if(money<1000)
		{
			System.out.println("금액이 부족합니다\n종료합니다");
			return; //아래까지 안가게 하기 위함 return이 없으면 저 아래 for문까지 가게됨
		}else {
			System.out.println("총 "+money/1000+"회 구입");
			System.out.println("거스름돈: "+money%1000+"원");
		}
		
		System.out.println("-----------------------------");
		for(int n=0;n<money/1000;n++)
		{
			System.out.printf("%2d회 : ",n+1);
			//중복
			for(int i=0;i<lotto.length;i++)
			{
				lotto[i]=r.nextInt(45)+1;
				for(int j=0;j<i;j++)
				{	
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}
			//정렬
			for(int i=0;i<lotto.length-1;i++)
			{
				for(int j=i+1;j<lotto.length;j++)
				{
					if(lotto[i]>lotto[j])
					{
						int temp=lotto[i];
						lotto[i]=lotto[j];
						lotto[j]=temp;
					}
				}
					
			}
			//출력
			for(int a:lotto)
				System.out.printf("%4d",a);
			System.out.println();
		}
		
		
	}

}
