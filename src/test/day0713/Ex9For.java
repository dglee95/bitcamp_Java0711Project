package test.day0713;

public class Ex9For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)//행(세로)
		{
			for(int j=1;j<=5;j++)//열(가로)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int i=1;i<=5;i++)//행(세로)
		{
			for(int j=1;j<=i;j++)//열(가로)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int i=1;i<=5;i++)//행(세로)
		{
			for(int j=5;j>=i;j--)//j=i;j<=5;j++ 반복횟수만 같으면 됨
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int i=1;i<=5;i++)//행(세로)
		{
			//공백, 4,3,2,1,0
			for(int sp=i;sp<5;sp++)
				System.out.print(" ");
			
			//*, 1,2,3,4,5
			
			for(int j=1;j<=i;j++)//열(가로)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	
	}
		
}
