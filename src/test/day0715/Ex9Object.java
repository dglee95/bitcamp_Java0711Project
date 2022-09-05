package test.day0715;

//같은 파일 안에서 여러개의 클래스 구현 가능
//단 앞에 public 붙일 수 없음. 즉 다른 패키지에서는 접근 불가
class Apple
{
	private String name;
	private int age;
	public static final String IT_LANG="Java";
	
	//setter는 외부에서 값을 받아와서 멤버변수에 입력하는 것
	//getter는 그 입력된 값을 반환하는 것
	
	//멤버 변수의 값을 변경하기 위한 setter method
	public void setName(String name) //set 다음 변수명 'N'ame String 다음도 변수명이랑 같게 보통 줌
	{ 
		this.name=name;  //같은 구역안에 같은 변수명이 있을 경우 멤버변수는 this. 필수 (this 안 붙이고 싶으면 (안의 변수명을 다른걸로))
	}
	//멤버 변수값을 반환나는 getter method
	public String getName() // 자료형, get+변수명
	{
		return name;//this.name:this 생략가능 같은 구역안에 name이 없어서
	}
	//age에 대한 setter&getter 순서 상관 없음
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	//일반 멤버 메서드
	public void writeInfo()
	{
		System.out.println(name+"님은 "+age+"세 "+(age>=20?"성인입니다":"미성년자입니다"));
	}
	
}

public class Ex9Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Apple.IT_LANG);//같은 파일에 다른 클래스면 클래스이름으로 불러올 수 있음
		Apple a=new Apple();
		System.out.println(a.IT_LANG);
//		System.out.println(a.name);//private라 인스턴스(레퍼런스)변수 a를 만들어도 접근불가
		
		//Apple 클래스의 이름과 나이 변경
		a.setName("강말자");
		a.setAge(19);
		//변경된 이름과 나이 출력
		//이름:강말자
		//나이:30
		System.out.println("이름:"+a.getName());
		System.out.println("나이:"+a.getAge());
		
		
		//같은 클래스를 새로운 인스턴스(레퍼런스)변수로 호출
		//같은 설계도면(클래스)로 여러개의 건물 생성 가능
		Apple a2=new Apple();
		a2.setName("이말자");
		a2.setAge(20);
		System.out.println(a2.getName()+"님의 나이는"+a2.getAge()+"세 입니다");
		a.writeInfo();
		a2.writeInfo();
	}

}
