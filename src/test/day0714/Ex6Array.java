package test.day0714;

import java.util.Scanner;

public class Ex6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {2,6,12,8,9,15,17,4,19,16};
		int su;
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		/*
		 * 숫자를 입력 후 그 숫자가 몇번째에 있는지 출력
		 * 없을경우 "없습니다" 출력
		 * 
		 */
		System.out.println("찾을 숫자를 입력하세요");
		su=sc.nextInt();
		for(int i=0;i<data.length;i++)
		{
			if(su==data[i])
			{
				flag=true;//같으면 찾았다는 표시를 boolean 이나 String="찾았다" 같은 걸로 정의
				//flag 없이 else로 하면 없습니다가 계속 나옴
				System.out.println((i+1)+"번째에 있습니다");
				break;
			}
		}
		
		if(!flag)//= 같은 의미 if(flag==false)
			System.out.println("없습니다");


	}

}
