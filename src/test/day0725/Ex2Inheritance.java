package test.day0725;

class Super2
{
	private String carName;
	private String carColor;
	
	Super2() // 생성자명=클래스명
	{
		System.out.println("부모디폴트 생성자 호출");
		carName="벤츠";
		carColor="은색";
	} 
	
	Super2(String carName,String carColor)
	{
		this.carName=carName;
		this.carColor=carColor;
	}
	
	public void writeCar()
	{
		System.out.println("차이름:"+carName);
		System.out.println("차색상:"+carColor);
	}
}
//상속받은 Car 클래스
class Car extends Super2 
{
	private int carPrice;
	
	Car()
	{
//		super();//생략되어있음,super생략시 무조건 디폴트호출
		System.out.println("자식 클래스 Car 디폴트 생성자 호출");
		carPrice=2000;
	}
	
	Car(int carPrice)
	{
//		super();//super 생략시 무조건 디폴트 super 호출
		this.carPrice=carPrice;
	}
	
	Car(String carName,String carColor,int carPrice)//프라이빗이라 부모한테 못 넘김
	{
		super(carName,carColor); // 부모생성자 중에 인자가 2개인 생성자가 호출, super생성자 반드시 첫줄에 있어야함 
		this.carPrice=carPrice;
		
	}
	
	@Override
	public void writeCar() { //자동완성
		// TODO Auto-generated method stub
		super.writeCar();//레퍼런스변수로 호출하는거는 처리 순서대로 호출
		System.out.println("자동차가격:"+carPrice);
	}
		
}


public class Ex2Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("** 1번 차 구매");//1번 생성자
		Car car1=new Car();//상속관계일때 부모 생성자도 호출이 되었음
		car1.writeCar();//car 클래스가 가진 writeCar가 호출
		//자식 클래스에 writeCar가 없으면 부모한테서 찾아옴 부모한테도 없으면 부모의 부모한테서 찾아옴
		System.out.println("** 2번 차 구매");//2번 생성자
		Car car2=new Car(3400);
		car2.writeCar();
		System.out.println("** 3번 차 구매");//3번 생성자
		Car car3=new Car("소나타","검정색",1900);
		car3.writeCar();
		
		System.out.println(car1+"\n"+car2+"\n"+car3); //레퍼런스(인스턴스) 주소 확인
		
	}

}
