package test.day0715;

public class Ex3Array2Cha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2행 3열로 메모리 할당
		int [][]arr=new int[2][3];
		
		System.out.println("행갯수:"+arr.length);//행갯수
		System.out.println("0번행열갯수"+arr[0].length);//0번행열갯수
		System.out.println("1번행열갯수"+arr[1].length);
		
		arr[0][0]=10;
		arr[0][2]=30;
		arr[1][1]=50;
		//나머지는 0으로 들어가있음
		//출력 2차원은 2중반복
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("%d행,%d열:%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
