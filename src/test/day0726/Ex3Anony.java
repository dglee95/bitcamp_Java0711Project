package test.day0726;

interface Hello
{
	public void draw();
	public void add();
}


public class Ex3Anony {
	//member 내부 클래스(근데 이제 상속받은)
	class SubHello1 implements Hello
	{
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("draw");
		}
		@Override
		public void add() {
			// TODO Auto-generated method stub
			System.out.println("add");
		}
	}
	//Anonymous 내부 클래스
	Hello hello2=new Hello()
	{
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("draw2");
		}
		@Override
		public void add() {
			// TODO Auto-generated method stub
			System.out.println("add2");
		}
	};//Anonymous 내부클래스는 한 줄로 인식하기때문에 ;이 붙는다
	public void process()
	{
		SubHello1 s1=new SubHello1();//static 메서드가 아닌 곳에서 내부클래스 호출
		s1.draw();
		hello2.draw(); //anonymous 내부 클래스는 변수처럼 생성된거기때문에 변수명으로 호출
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3Anony ex=new Ex3Anony();
//		Ex3Anony.SubHello1 in1=ex.new SubHello1();//일반 내부 클래스를 생성하는 방법 메인이 스테이틱이라 이렇게 호출됨
//		in1.draw();
		ex.process();
	}
}