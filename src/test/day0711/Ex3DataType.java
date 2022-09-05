package test.day0711;

public class Ex3DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float(4 byte),double(8 byte)
		//실수형은 정밀도가 중요
		float f1=(float)3.4;//방법1 소숫점이 찍혀있으면 무조건 double로 인식해서 형변환
		float f2=4.2f;//방법2
		System.out.println(f1);
		System.out.println(f2);

		float f3=13.123456789f;//소숫점포함 8자리까지 정확
		double f4=13.123456789;//소숫점포함 15자리까지 정확
		System.out.println(f3);
		System.out.println(f4);

		//문자1글자 char, 문자열 String
		char ch1='A';
		char ch2='가';//char가 2byte이므로 한글도 안 깨지고 나옴 c언어는 깨짐
		System.out.println(ch1);
		System.out.println(ch2);
		
		//String에 문자열을 저장하는 방법
		String s1=new String("Apple");//방법 1
		String s2="Banana";//방법 2(String은 예외적으로 new 안해도 됨)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);//문자열에서 +는 나열을 의미
		
	}

}
