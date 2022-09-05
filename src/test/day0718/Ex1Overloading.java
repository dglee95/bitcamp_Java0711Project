package test.day0718;

class Apple
{
	public int sum(int a,int b)
	{
		return a+b;
	}

	public String sum(String a,String b)
	{
		return a+b;
	}
	
	public double sum(double a,double b)
	{
		return a+b;
	}
	
	public String sum(String a,int b)
	{
		return a+b;
	}
	
}


public class Ex1Overloading {

	public static void main(String[] args) {
		
		//Apple 클래스 생성
		Apple apple=new Apple();
		//apple 이라는 인스턴스 변수를 이용해서 인스턴스 메서드를 호출
		//변수를 받아서 출력하거나
		int n1=apple.sum(5, 6);
		System.out.println(n1);
		//출력문에서 바로 리턴값을 받아서 출력
		System.out.println(apple.sum("hello", "world"));
		//변수로 리턴값을 받아서 출력
		String s=apple.sum("java", "html");
		System.out.println(s);
		
		//아래와 같이 호출할 경우 에러가 나요.
		//필요한 오버로딩 메서드를 추가하세요
		double d=apple.sum(1.2, 4.5);
		System.out.println(d);
		
		String s2=apple.sum("hello", 100);
		System.out.println(s2);
	}


}
