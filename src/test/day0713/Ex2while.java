package test.day0713;

import java.util.Scanner;

public class Ex2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score;
		int cnt=0;//제대로 입력된 점수의 갯수
		int tot=0;//점수들의 합
		/*
		 * 0~100 벗어나면 잘못된 점수입니다, 다시 입력하게
		 * 999 쓰면 while문 빠져나와서 결과 출력
		 */
		while(true)
		{
			System.out.print("점수:");
			score=sc.nextInt();
			//999일 경우 빠져나간다
			if(score==999)//continue보다 더 빨리 써야되고 break
				break;
			//잘못 입력한 경우 갯수에서 제외-다시 입력
			if(score<0 || score>100)
			{
				System.out.println("\t잘못된 점수입니다\n");
				continue;//조건식으로 이동
			}
			//갯수 증가
			cnt++;
			//총합
			tot+=score;
		}
		System.out.printf("총 %d개의 점수 입력됨\n총 합계:%d점",cnt,tot);
	}

}
