package test.day0713;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 0~100 벗어나면 잘못된 점수입니다, 다시 입력하게
		 * 999 쓰면 while문 빠져나와서 결과 출력
		 */
		int score,cnt,tot;
		cnt=0;
		tot=0;
		while(true)
		{
			System.out.println("점수를 입력하세요");
			score=sc.nextInt();
			if(score==999)
			{
				System.out.println("종료하겠습니다");
				break;
			
			}
			else if(score<=0 || score>100)
			{
				System.out.println("다시 입력하세요");
				continue;
			}
			else
				cnt++;
				tot+=score;
		}
		System.out.printf("입력횟수:%d번\n총점:%d점",cnt,tot);
	}

}
