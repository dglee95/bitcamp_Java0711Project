package test.day0718;

import java.util.Scanner;

public class Ex9ClassEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inwon;
		Emp []emp;
		
		//1. 인원수 입력
		System.out.println("인원 수 입력");
		inwon=Integer.parseInt(sc.nextLine());
		//2.인원수 만큼 emp 할당
		emp=new Emp[inwon];
		//3.인원수만큼 각 데이터입력
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(i+1+"번 사원 데이터 입력하세요");
			System.out.print("\t사원명:");
			String name=sc.nextLine();//지역변수 선언
			System.out.print("\t가족 수:");
			int famSu=Integer.parseInt(sc.nextLine());//지역변수 선언
			System.out.print("\t초과근무시간:");
			int timeSu=Integer.parseInt(sc.nextLine());//지역변수 선언
			System.out.print("\t기본급:");
			int gibon=Integer.parseInt(sc.nextLine());//지역변수 선언
			//Emp생성
			emp[i]=new Emp(name, famSu, timeSu, gibon);
		}
		//4.전체 사언 급여정보 출력(제목포함)
		Emp.showTitle();
		for(Emp e:emp)
			e.sawonWrite();
	
		
	}

}
