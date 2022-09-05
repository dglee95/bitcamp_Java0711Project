package test.day0712;

public class Ex2Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1=7,su2=4;
		//산술 연산자
		System.out.printf("%d+%d=%d\n",su1,su2,su1+su2);
		System.out.printf("%d-%d=%d\n",su1,su2,su1-su2);
		System.out.printf("%d*%d=%d\n",su1,su2,su1*su2);
		System.out.printf("%d/%d=%d\n",su1,su2,su1/su2);
		System.out.printf("%d/%d=%1.2f\n",su1,su2,(double)su1/su2);
		//나머지
		System.out.printf("%d%%%d=%d\n",su1,su2,su1%su2);//%%=%출력
		System.out.println(su1+"%"+su2+"="+su1%su2);
		
		//대입연산자 =,+=,-=,*=,/=,%=
		int a=10;
		a+=2;//a=a+2
		System.out.println(a);//12
		a-=3;//a=a-3
		System.out.println(a);//9
		a*=5;//a=a*5
		System.out.println(a);//45
		a/=2;//a=a/2
		System.out.println(a);//22
		a%=2;//a=a%2
		System.out.println(a);//0

		//static이 붙은 클래스는 메서드를 new로 호출 안해도 됨
		//static이 붙으면 클래스를 호출하는 경우 .으로 호출 가능함
		
	}

}
