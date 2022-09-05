package test.day0714;

import java.util.Scanner;

public class Ex13ArrayAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data= {3,43,23,35,41,7,9,16,18,20,24,35,39,49,29,38,9,11,46,37};
//		System.out.println(data.length);
		int []age=new int[5];
		/*
		 * age 배열에 data에서 연령을 체크해서 인원을 구하라
		 * age[0]=1~9세 인원 구하기
		 * age[1]=10~19세 인원 구하기
		 * age[2]=20~29세 인원 구하기
		 * age[3]=30~39세 인원 구하기
		 * age[4]=40~49세 인원 구하기
		 * 
		 * 출력양식
		 *  어린이:2명
		 *  1 0 대:3명
		 *  2 0 대:4명
		 *  3 0 대:2명
		 *  4 0 대:6명
		 *  힌트:나이를 10으로 나눈 값
		 */
//		for(int i=0;i<age.length;i++)
//		{
//			
//			for(int j=0;j<data.length;j++)
//			{
//				if(data[j]/10==i)
//					age[i]++;
//			}
//		}
//		System.out.println("어린이:"+age[0]+"명");
//		for(int i=1;i<age.length;i++)
//			System.out.printf("%d 0 대:%d명\n",i,age[i]);
		
		//모범 답안
		for(int i=0;i<data.length;i++)
		{
			age[data[i]/10]++;//기준이 되는 배열 이름[값을 인덱스값으로 만드는 방법]++;
		}
		System.out.println("** 연령별 인원수 **");
		for(int i=0;i<age.length;i++)
		{
			System.out.printf("%s : %d명\n",i==0?"어린이":i+" 0 대",age[i]);//i==0?"어린이":i*10+"대" -삼항연산자
		}
	}	

}
