package test.day0712;

import java.util.Scanner;

public class Ex11Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score;
		String grade;
		//점수를 입력 후 점수에 따라"A","B","C","D","F"를 구한 후
		//예: 98점은 A학점입니다.
		System.out.println("점수를 입력하시오");
		score=sc.nextInt();
		if(score<0 || score>100)
		{
			System.out.println("잘 못 입력하셨습니다");
			return;
		}
//		grade=score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
//		System.out.println(score+"점은 "+grade+"학점입니다.");
		System.out.println(score+"점은 "+(score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F")+"점입니다");
	}

}