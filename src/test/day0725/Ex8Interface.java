package test.day0725;
//interface는 상수(final)와 추상(abstract)메소드로만 구성되어있다
//실체가 없는 선언문만 있기때문에 음식점의 메뉴판에 비유를 한다
interface InterA
{
	int SPEED=200;//상수 final 자동 생략
	public void speedUp();//모든 메서드는 추상 메서드이지만 abstract는 생략
	public void speedDown();//반드시 오버라이드 할 목적으로 만듬
	
}

//interface를 구현할 때는 implements

class My implements InterA{//인터페이스끼리 상속할때는 extends로 상속 자식 extends 부모
	int mySpeed=SPEED;//200으로 초기값이 잡히고 변수를 수정하는 방식(상수는 수정 안됨)
	
	//Source-generate Override/Implement Methods 반드시 오버라이드 해야되는건 자동 체크돼있음
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		mySpeed+=10;
		System.out.println("현재 속도 : "+mySpeed);
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		mySpeed-=10;
		System.out.println("현재 속도 : "+mySpeed);
	}
	
	
}
public class Ex8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA a1=new My();//추상 클래스는 생성안되서 자식으로 생성함
		a1.speedUp();
		a1.speedDown();
		
		My a2=new My();
		a2.speedUp();
		a2.speedDown();
		
	}

}
