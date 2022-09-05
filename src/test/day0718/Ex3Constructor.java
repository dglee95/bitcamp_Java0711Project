package test.day0718;

import test.day0715.Student;

//생성자 (constructor)
//1.반드시 클래스명과 동일한 이름이라야한다
//2.overloading이 가능하다(즉 여러개 가능하다)
//3.주로 멤버변수의 초기화를 담당한다
//4.new 로 생성시 자동으로 호출된다(생성할때만 호출)
//5.return Type이 없다

class Person
{
	//멤버 변수 선언(등록)
	String name;
	int age;
	
	
	Person()//default 생성자
	{
		System.out.println("디폴트 생성자 호출");
		name="홍길동";
		age=10;
		
	}
	
	Person(String name)
	{
		this.name=name;
		age=5;
	}
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void show()
	{
		System.out.println("name:"+name+",age="+age);
	}
}

public class Ex3Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();//default 생성자 Person 호출 되었음
		p1.show();
		
		//웹에서 이름만 받아서 나이는 생성자로 호출
		Person p2=new Person("강호동");
		p2.show();

		//웹에서 이름과 나이를 다 받는 것
		Person p3=new Person("이영자",35);
		p3.show();
	}

}
