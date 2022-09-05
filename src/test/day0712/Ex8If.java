package test.day0712;

import java.util.Scanner;

public class Ex8If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//점수를 입력 후 90이상이면 "잘했어요!"
		//80이상이면 "조금 더 노력하세요!"
		//나머지는 "공부하세요!!!"
		//0~100을 벗어나면 " 잘못입력했어요" 라고 출력 후 종료
		int score;
		String result;
		System.out.println("점수를 입력하세요");
		score=sc.nextInt();
		//if(score<0 || score>100)
		if(!(score>=0 && score<=100))//위의 조건과 같은 뜻
		{
			System.out.println("\t잘 못 입력했어요");
			return;//메서드 종료
		}
		//if문은 한가지만 맞으면 바로 빠져나옴
		if(score>=90)
			result="잘했어요!";
		else if(score>=80)
			result="조금 더 노력하세요!";
		else
			result="공부하세요!!!";
		System.out.printf("당신의 점수는 %d점입니다.\n%s\n",score,result);
		System.out.println("** 정상 종료 **");
	}

}
