package test.day0714;

import java.util.Scanner;

public class Ex7Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {2,6,12,8,9,15,17,4,19,16};
		int su,i;
		Scanner sc=new Scanner(System.in);
		/*
		 * 숫자를 입력 후 그 숫자가 몇번째에 있는지 출력
		 * 없을경우 "없습니다" 출력
		 */
		//boolean 변수 업싱 하는 방법 6번 예제랑 똑같음
		System.out.println("찾을 숫자를 입력하세요");
		su=sc.nextInt();
		for(i=0;i<data.length;i++)//위에서 선언했기때문에 int i라고 안함
		{
			if(su==data[i])
			{
				System.out.println((i+1)+"번째에 있습니다");
				break;
			}
			//else를 쓰면 없습니다가 길이-1 만큼 나옴
		}
		if(i==data.length)
			System.out.println("없습니다");
		
	}

}
