package test.day0711;

public class Ex1DataType {

	//멤버 변수를 선언하는 위치 - 자동초기화(자동으로 0이 되는 것)
	int a; // 초기화 안한 것
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역 변수 - 자동 초기화 안됨
		int b=0;
		
		//멤버 변수 출력하는 방법
		Ex1DataType ex1=new Ex1DataType();
		System.out.println(ex1.a);
		
		System.out.println(b);
		
		byte c=120;
		System.out.println(c);
		
		byte d=(byte) 129;//cast 연산자(강제 형변환 연산자)
		System.out.println(d);//-127: 값이 넘칠 경우 음수로 읽는다(2의 보수로 읽는다)
		
		short su1=32700;
		short su2=20000;
		int sum=su1+su2; // 합도 -32768~32767 넘으면 안됨
		System.out.println(sum);
		
		int n1=7;
		int n2=4;
		int div1=n1/n2;//int끼리 연산은 결과도 int: 1
		System.out.println(div1);
		
		double div2=n1/n2;//int/int 부터 계산되고나서 왼쪽 double에 대입되는것 1을 넣으면 1.0
		System.out.println(div2);//1.0
		
//		double div3=(double)n1/n2;//1.75 둘중하나를 double로 강제로 형변환 n1에만 double이 붙은 것임
//		double div3=n1/(double)n2;//1.75
		double div3=(double)(n1/n2);//1.0
		System.out.println(div3);
		
		
		
	}

}
