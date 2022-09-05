package test.day0713;

public class Ex12PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~100 소수 구하기");
		//소수란? 1을 제외하고 자기자신만을 약수로 가진 수
		//다중 for문 continue, break 쓰기 좋은 문제
		int cnt=0;
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.print(i+" ");
			}
			cnt=0;
		}
		System.out.println();
		Exit:
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					if(i==j)
						System.out.printf("%3d",i);
					else
						continue Exit;//i++로 이동
				}
			}	
		}
	}

}
