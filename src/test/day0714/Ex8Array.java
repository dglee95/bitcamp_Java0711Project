package test.day0714;

import java.util.Scanner;

public class Ex8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"이영자","강호동","유재석","강소라",
				"이진","이효리","우영우","우지원","유민","박나래"};
		String searchName;
		int i;
		Scanner sc=new Scanner(System.in);
		
		//이름을 입력하면 "2번째에 있습니다"
		//없을경우 "없습니다"
		System.out.println("이름을 입력하세요");
		searchName=sc.nextLine();
		for(i=0;i<names.length;i++)
		{
			if(searchName.equals(names[i]))//.equals(이름) .앞과 괄호안이 같은지 비교
			{
				System.out.println(i+1+"번째에 있습니다");
				break;
			}

		}
		if(i==names.length)
			System.out.println("없습니다");
		
		
	}

}
