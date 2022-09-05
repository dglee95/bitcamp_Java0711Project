package test.day0711;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]+args[1]);//"7"+"5"="75" args가 String(문자열)이기 때문에 75로 출력
		//Wrapper Class:타입변환을 위한 클래스들
		//클래스에서 클래스로 형변환할 때 Wrapper 써야함 기본형<->클래스 형변환 안됨
		//Integer,Long,Char,Boolean,Double 등등등
		//String Type을 기본형인 int type으로 변환하는 방법
		int su1=Integer.parseInt(args[0]);//문자열로된 숫자만 7a 같은건 안됨
		int su2=Integer.parseInt(args[1]);
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		
		System.out.println("1"+2+3);//123: 문자열1에 숫자를 더해봤자 문자열 12라는 문자열에 숫자3을 더해봤자 123이라는 문자열
		System.out.println("1"+(2+3));//15:
		System.out.println(1+2+3);//6: 문자열이 없어서 숫자
		
		//2번 배열의 3.5도 타입은 String
		//String -> double
//		System.out.println(args[2]*2);//String은 +외엔 안됨
		double su3=Double.parseDouble(args[2]);
		System.out.println(su3*2);//
		
		
	}

}
