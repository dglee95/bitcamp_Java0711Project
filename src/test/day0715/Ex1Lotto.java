package test.day0715;

import java.util.Random;


public class Ex1Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []lotto=new int[6];
		Random r=new Random();
		
		//중복
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=r.nextInt(45)+1;
			//중복처리-같은 숫자가 이전 배열 번지에 있을 경우 다시 구한다
			for(int j=0;j<i;j++)
			{	
				if(lotto[i]==lotto[j])
				{
					i--;//break를 하면 증감식 i++로 넘어가기때문에 i--를 해줘야함
					break;//밖 for문중 이 for문 밑에 코드가 있을경우 continue label; 해야함
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
		System.out.println("** 로또 숫자 출력 **");
		for(int a:lotto)
			System.out.printf("%4d",a);


	}

}
