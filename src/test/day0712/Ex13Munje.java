package test.day0712;

import java.util.Scanner;

public class Ex13Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int java,html,oracle,tot;
		double avg;
		//이름과 3과목의 점수를 입력받아 tot(총점),avg(평균)을 구한 후
		//평균이 60이상이고 3과목이 모두 40이상일 경우 "합격입니다"
		//그렇지 않을 경우 "불합격입니다"라고 출력 후
		//이름과 총점, 평균을 추가로 출력하시오
		System.out.println("이름");
		name=sc.nextLine();
		System.out.println("3과목의 점수를 입력하시오");
		java=sc.nextInt();
		html=sc.nextInt();
		oracle=sc.nextInt();
		tot=java+html+oracle;
		avg=(double)tot/3;//avg=tot/3.0;랑 동일
		if(java<0 || java>100 || html<0 || html>100 || oracle<0 || oracle>100)
		{
			System.out.println("잘 못 입력하셨습니다");
			return;
		}
		
		System.out.println(avg>=60 && java>=40 && html>=40 && oracle>=40?"합격입니다":"불합격입니다");
		System.out.printf("이름:%s\n총점:%d점\n평균:%1.1f점\n",name,tot,avg);
		
	}

}
