package test.day0718;

class Orange
{
	String color;
	int price;
	
	Orange(String color,int price)
	{
		this.color=color;
		this.price=price;
	}
	
	Orange()//디폴트 생성자
	{
		this("빨강", 1000);//인자가 2개인 생성자 호출, 첫줄!! 초기값이 빨강, 1000이 되는 것
	}
	
	Orange(String color)
	{
		this(color,500);//생성자 끼리 호출하는 것
	}
	
	public void write()
	{
		System.out.println("색상:"+color+",수량:"+price);
	}
	
	
}

public class Ex6Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange [] or=new Orange[5];
		or[0]=new Orange();//빨강,1000
		or[1]=new Orange("파랑");//파랑,500
		or[2]=new Orange("오렌지",300);////오렌지,300
		or[3]=new Orange();//빨강,1000
		or[4]=new Orange("노랑");
		
		System.out.println("총 "+or.length+"개");
		System.out.println("** 출력 1 **");
		for(Orange o:or)//for(클래스명 변수명:배열명)
			o.write();//변수명.메서드명
		//배열 갯수만큼 출력
		
		System.out.println("총 "+or.length+"개");
		System.out.println("** 출력 2 **");
		for(int i=0;i<or.length;i++)
			or[i].write();
	
	}

}
