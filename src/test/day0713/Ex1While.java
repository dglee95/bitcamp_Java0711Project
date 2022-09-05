package test.day0713;

public class Ex1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~5까지 출력-while문을 이용해서
		int n=0; // 0부터 주면 증가부터하고 출력
		System.out.println("** 출력 1 **");
		while(n<5)
		{
			System.out.println(++n);
		}
		n=0;//같은 구역안에서 선언(int n)은 한번만 할 수 있고 초기화는 여러번(n=0;)가능
		System.out.println("** 출력 2 **");
		while(true)
		{
			System.out.println(++n);
			if(n==5)
				break;
		}
		n=0;
		System.out.println("** 출력 3 - 1~10 사이의 숫자 중 짝수만 출력 **");
		while(n<10)
		{
			++n;
			if(n%2==1)
				continue;//더 이상 수행하지않고 조건식으로 이동
			System.out.printf("%3d",n);
		}

		n=0;
		System.out.println("\n** 출력 4 - 1~10사이의 숫자 중 짝수만 출력 **");
		while(true)
		{
			if(++n%2==0)
				System.out.printf("%3d",n);
			if(n==10)
				break;
		}
		


	}

}
