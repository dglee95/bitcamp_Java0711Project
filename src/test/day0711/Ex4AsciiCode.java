package test.day0711;

public class Ex4AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;//10진수 표기법
		int b=0x41;//16진수 표기법: 4*16+1=65
		int c='A';//char형
		System.out.println(a==b);//true
		System.out.println(a==c);//true
		System.out.println(a+","+(char)a);

		//출력문중에 printf 변환기호로 출력해주는 메서드(jdk5에서 추가된기능)
		//변환기호 : 정수(%d),문자(%c),실수(%f),문자열(%s)
		System.out.printf("%c,%c,%c\n",a,b,c);
		System.out.printf("%c,%c,%c,%c\n",a+32,a+33,a+34,a+35);//char와 int는 아스키코드표 기준으로 계산이 됨
		System.out.println(a+35);
		System.out.println((char)(a+35));//+부터하고 형변환을 해야 나옴
		
		double d=13.45678;
		System.out.printf("%f,%3.2f,%10.1f,%-10.1f*\n",d,d,d,d);//3.2 실제 숫자보다 작을때는 무시
		//%10f는 10칸 오른쪽 정렬 %-10f는 10칸 왼쪽 정렬
		
	}

}
