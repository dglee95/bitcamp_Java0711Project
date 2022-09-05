package test.day0715;

public class Ex8Object {
	//멤버 변수와 상수를 선언하는 위치
	//멤버 변수는 객체는 null, 숫자는 0으로 자동 초기화
	//일반 멤버 변수는 인스턴스 변수가 있어야 호출이 가능하므로
	//인스턴스 멤버변수라고도 부른다
	String name;
	int age;
	//static변수는 클래스명으로 호출이 가능하므로 클래스 멤버변수라고도 부른다
	static final String MESSAGE="Happy Day!"; // 상수는 static final에 대문자로 많이 함
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main 이라는 static메서드에서는 this라는 인스턴스 변수가 존재하지 않음
		//그러므로 일반 멤버 변수는 직접적인 접근이 불가 (new로 생성하면 가능)
//		System.out.println(this.name);//에러 발생
		System.out.println(Ex8Object.MESSAGE);//클래스명으로 호출한 것 클래스명.statc 변수
		//같은 클래스 소속일 경우는 클래스명 생략이 가능함
		System.out.println(MESSAGE);
		//멤버변수 호출하려면
		Ex8Object ex=new Ex8Object();//ex를 인스턴스변수 or 레퍼런스 변수라고 부름
		System.out.println(ex.name);//초기화값 null
		System.out.println(ex.age);//초기화값 0 
		
		ex.name="강호동";
		ex.age=20;
		System.out.println(ex.name);
		System.out.println(ex.age);
		
	}

}
