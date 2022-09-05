package test.day0725;

//super class
class Super1
{
	private void writeA() 
	{
		System.out.println("private method");
	}
	
	void writeB() //default라고 안 적힌게 default
	{
		System.out.println("default method");
	}
	
	protected void writeC()
	{
		System.out.println("protected method");
	}
	
	public void writeD()
	{
		System.out.println("public method");
	}
	
}
//////////////////////////////////////////
//sub class
class Apple extends Super1
{
	@Override //@:어노테이션 annotation, 부모가 가진 메서드를 오버라이드 한다는 뜻
	public void writeD()
	{
		System.out.println("public sub method");
	}
	
	@Override
	void writeB() {
		// TODO Auto-generated method stub
		System.out.println("-------------------");
		super.writeB();//부모가 먼저 처리
		System.out.println("sub class의 writeB가 처리");
		super.writeB();//부모가 후 처리
		System.out.println("-------------------");
		
	}
	

	public void process()
	{
		System.out.println("부모의 레퍼런스 변수인 super로 호출");
		super.writeB();
		super.writeC();
		super.writeD();//sub에도 writeD가 있으나 super로 호출시 부모 writeD가 호출
		System.out.println("같은 이름의 메서드가 '나에게 없다면' this 로도 호출 가능");
		this.writeB();
		this.writeC();
		this.writeD();//sub 클래스에 같은 이름의 메서드가 있으므로 sub 메서드가 우선 호출 됨
	}
	
	
}

public class Ex1Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple=new Apple();
		apple.writeB();
		apple.writeC();
		
		apple.writeD();
		apple.process();
	}

}
