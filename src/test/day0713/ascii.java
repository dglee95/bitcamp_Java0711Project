package test.day0713;

import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("숫자를 입력하세요");
			long ascii=sc.nextLong();
			System.out.println(ascii+":"+(char)ascii);
			if(ascii>922337)
			{
				System.out.println("종료합니다");
				break;
				
			}
		}
		
	}

}
