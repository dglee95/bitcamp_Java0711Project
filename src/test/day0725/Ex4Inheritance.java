package test.day0725;

class Super4 {
	private String sangpum;
	private String ipgoday;

	// 쉬프트 알트 s (Source)
	// Generate Constructor using Field 체크 해제
	public Super4() {
	}

	// Generate Constructor using Field 둘 다 체크
	public Super4(String sangpum, String ipgoday) {
		super();// 생략가능
		this.sangpum = sangpum;
		this.ipgoday = ipgoday;
	}

	// Generate Getter and Setter
	// select Setter 하면 setter만 select Getter 하면 getter만 가능
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public void setIpgoday(String ipgoday) {
		this.ipgoday = ipgoday;
	}

	@Override
	public String toString() {
		return "Super4 [sangpum=" + sangpum + ", ipgoday=" + ipgoday + "]";
	}

}

///////////////////
class Shop extends Super4 {
	private String color;
	private int price;

	public Shop() { // 둘 다 체크 해제
		super();
	}

	public Shop(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public Shop(String sangpum, String ipgoday, String color, int price) {
		super(sangpum, ipgoday);
		this.color = color;
		this.price = price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//Generate toString 에서 Inherited methods에 toString()을 체크해야 부모꺼랑 같이
	@Override
	public String toString() {
		return "Shop [color=" + color + ", price=" + price + ", toString()=" + super.toString() + "]";
	}

	
}

public class Ex4Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop []s=new Shop[3]; // 생성 안된 것 객체생성 따로 해야함
		s[0]=new Shop();
		s[1]=new Shop("흰색",23000);
		s[2]=new Shop("반바지","2022-07-25","노랑색",12000);
		
		System.out.println("초기값 출력");
		for(Shop shop:s)
			System.out.println(shop);//toString 호출
		
		s[0].setSangpum("코트");
		s[0].setIpgoday("2022-07-24");
		s[0].setColor("갈색");
		s[0].setPrice(79000);
		
		s[1].setSangpum("컵");
		s[1].setIpgoday("2022-07-22");
		
		System.out.println();
		System.out.println("값 변경 후 출력");
		
		for(Shop shop:s)
			System.out.println(shop);
		
		
	}

}
