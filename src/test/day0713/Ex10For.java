package test.day0713;

public class Ex10For {

	public static void main(String[] args) {
		//4,1 / 3,3 / 2,5 / 1,7
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
				System.out.print(" ");

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{	
				if(i==j)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
		}





	}
}

