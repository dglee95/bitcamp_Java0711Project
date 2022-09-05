package test.day0713;

import java.util.Scanner;

public class Ex17Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  1~100 사이의 난수를 변수 rnd 에 저장후
	    // while문을 이용해서 숫자를 입력하여 알아맞추기
		Scanner sc=new Scanner(System.in);
		int rnd,x,cnt;
		cnt=1;
		rnd=(int)(Math.random()*100)+1;
		while(cnt<=10)
		{
			System.out.print(cnt+":");
			x=sc.nextInt();
			cnt++;
			if(rnd==x)
			{
				System.out.println("짝짝짝!!! 정답입니다");
				System.out.println("**종료**");
				break;
			}
			else if(rnd<x)
				System.out.println(x+"보다 작습니다");
			else
				System.out.println(x+"보다 큽니다");
			if(cnt==11)
			{
				System.out.println("시간초과!!");
				System.out.println("**종료**");
				break;
			}
		}
		//모범 답안
//		Scanner sc=new Scanner(System.in);
//		int rnd,su,cnt=0;
//		Random r=new Random();
//		//난수구하기
//		rnd=r.nextInt(100)+1;//1~100
//		while(true)		
//		{
//			System.out.print(++cnt+":");
//			su=sc.nextInt();
//			if(su>rnd)
//				System.out.println("\t"+su+"보다 작습니다");
//			else if(su<rnd)
//				System.out.println("\t"+su+"보다 큽니다");
//			else {
//				System.out.println("짝짝짝! 정답입니다");
//				break;
//			}
//		
//			if(cnt==10)
//			{
//				System.out.println("\t시간초과!! 종료합니다");
//				break;
//			}
//		}

	}

}
