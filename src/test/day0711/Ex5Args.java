package test.day0711;

public class Ex5Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args: 송혜교 67 78 82이렇게 값을 준 후
		//이름은 String name에 저장
		//3과목의 점수는 int kor,eng,mat에 저장 후
		//총점(int tot),평균(double avg)를 계산 후
		//printf를 이용해서 출력하시오
		String name=args[0];
		int kor=Integer.parseInt(args[1]);//String을 int로 형변환
		int eng=Integer.parseInt(args[2]);//클래스는 클래스끼리 형변환해야함
		int mat=Integer.parseInt(args[3]);//(int)문자열로 int로 못 바꿈 문자열이 String클래스기 때문
		int tot=kor+eng+mat;//총점
		double avg=(double)tot/3;// == tot/3.0;
		System.out.printf("%s님의 총점은 %d점이며 평균 점수는 %4.1f점입니다",name,tot,avg);
		
	}

}
