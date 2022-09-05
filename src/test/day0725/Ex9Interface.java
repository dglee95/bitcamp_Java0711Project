package test.day0725;
//interface끼리의 상속도 가능하다
//interface상속은 class상속과 마찬가지로 
//interface 자식인터페이스 extends 부모인터페이스 로 상속받는다
interface InterB
{
	public void study();
}

interface InterC extends InterB { //상속
	public void play();
}
//class에 implements InterB를 했다면 study만 오버라이드

class MyA implements InterB{ //구현
	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}
	
}
//class에 implements InterC를 했다면 study, play 둘 다 오버라이드
class MyB implements InterC{
	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}

public class Ex9Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
