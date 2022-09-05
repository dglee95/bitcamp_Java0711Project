package test.day0719;

import java.util.Scanner;

public class Ex2Chajum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		OxChaejum[] cha;//객체배열
		int inwon;
		//인원수 입력
		System.out.println("인원수");
		inwon=Integer.parseInt(sc.nextLine());
		//인원수만큼 cha할당
		cha=new OxChaejum[inwon];
		//for문으로 이름과 답 입력 후 생성자 호출
		for(int i=0;i<cha.length;i++)
		{
			System.out.println(i+1+"번:");
			String name=sc.nextLine();
			System.out.println("답:");
			String dap=sc.nextLine();
			cha[i]=new OxChaejum(name,dap);//생성자를 통해서 전달,세터로 전달해도됨
		}
		//인원수 만큼 채점 이중 for문
		for(int i=0;i<cha.length;i++)
			cha[i].check();
		//등수구하기
		OxChaejum.getRank(cha);
		//제목출력
		OxChaejum.showTitle();
		//데이터 출력 단순하게 데이터만 출력할 경우 이 for문
		//i번쨰 등등 이런거는 int i=0 이 for문
		for(OxChaejum c:cha)
			c.writeChaejum();
	}

}
