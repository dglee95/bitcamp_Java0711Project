package test.day0712;

public class Ex1Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=5;//a와 b에 5를 대입한다는 뜻 대입연산자
		//단항일 경우는 전치든 후치든 결과가 같다
		++a;//a=a+1, a+=1 이랑 같은 뜻
		b++;
		System.out.println(a+","+b);//6,6
		
		int c,d;
		c=++a*3;//21: a가 먼저 증가후 곱한다
		d=b++*3;//18: b가 먼저 곱한후 증가한다
		System.out.printf("%d,%d,%d,%d",a,b,c,d);
		a=b=c=d=3;//선언할때는 int a=b=c=d=3; 하면 안됨
		d=b++ + ++c*++a;//b의 후치 + c의 전치를 동시에 쓰면 공백이 필요함
		System.out.println("\n"+d);
		
		a=3;
		System.out.println(a++);//3 출력 후 메모리엔 4
		System.out.println(++a);//5: 먼저 증가 후 출력
		
		
		
		
	}

}
