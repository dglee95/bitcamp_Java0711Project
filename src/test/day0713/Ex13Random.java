package test.day0713;

public class Ex13Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임의의수를 구하는 방법 2가지
		//Math.random()
		//Random 클래스를 이용
		for(int i=1;i<=5;i++)
		{
			double d=Math.random();//0.00000~0.99999999 사이의 double형 발
			System.out.println(d);
		}
		System.out.println("-----");
		System.out.println("0~9사이의 난수");
		for(int i=1;i<=5;i++)
		{
			int d=(int)(Math.random()*10);//최소가 0에 9까지 나옴
			System.out.println(d);
		}
		System.out.println("-----");
		for(int i=1;i<=5;i++)
		{
			int d=(int)(Math.random()*100)+1;//최소가 1에 1+100-1 까지 나옴
			System.out.printf("%02d\n",d);
		}
		System.out.println("-----");
		System.out.println("임의의 알파벳 대문자(65~90)");
		for(int i=1;i<=5;i++)
		{
			int d=(int)(Math.random()*26)+65;//최소가 65에 25까지 65+26-1까지 나옴
				System.out.println((char)d);
		}
		System.out.println("-----");
	}

}
