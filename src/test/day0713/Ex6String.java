
package test.day0713;

public class Ex6String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Apple";
		String s2="Have a Nice Day!!";
		String s3="appLe";
		
		System.out.println(s1.equals(s3));//대소문자가 다르므로 false
		System.out.println(s1.equalsIgnoreCase(s3));//대소문자 상관없이 철자만 맞으면 true
		//compareTo
		System.out.println("apple".compareTo("apple"));//같을경우 0
		System.out.println("a".compareTo("b"));//-1 : 앞-뒤 (-가 나오면 앞이 작은거)
		System.out.println("banana".compareTo("apple"));//1: 앞-뒤 (앞이 더 크다)
		System.out.println("apple".compareTo("banana"));//-1
		System.out.println("computer".compareTo("compare"));//20: u-a 아스키코드
		System.out.println("강호동".compareTo("강호순"));//음수값
		
		System.out.println("s2의 길이:"+s2.length());
		String s4="  hello  ";
		System.out.println("s4의 길이:"+s4.length());
		System.out.println("양쪽 공백 제거 후 길이구하기:"+s4.trim().length());//제거 후 길이
		
		//첫 N의 위치
		System.out.println("s2.indexOf('N'):"+s2.indexOf('N'));
		//*의 인덱스 구하기:없을경우 얼마가 나오는지 확인
		System.out.println("s2.indexOf('*'):"+s2.indexOf('*'));//-1
		System.out.println();
		
		String s5="hello world";
		//s5를 비교해서 공백이 있으면 공백이 있다, 없으면 없다고 출력
		if(s5.indexOf(32)==-1)
			System.out.println("공백이 없습니다");
		else
			System.out.println("공백이 있습니다");
		
		System.out.println(s2.toLowerCase());//무조건 소문자로 변환해서 출력
		System.out.println(s2.toUpperCase());//무조건 대문자로 변환해서 출력
		
		//특정 단어로 시작하면 true
		System.out.println(s2.startsWith("Have"));//true, Have로 시작
		System.out.println(s2.endsWith("*"));//false, *로 끝나야만 true
		System.out.println(s2.contains("Nice"));//true, Nice를 포함하고 있어서
		
		//concat: 문자열추가 "+"로 안되는 언어
		System.out.println(s1.concat(" "+s5));
		
		String color="red,green,blue,magenta";
		//문자열에서 ,(컴마)로 분리하기-결과는 배열형태
		String []arrcolor=color.split(",");
		System.out.println("총 배열갯수:"+arrcolor.length);
	}

}
