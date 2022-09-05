package test.day0714;

public class Ex11ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정렬(selection sort)
		//오름차순 내림차순 정렬 이중 for문에 자리 바꾸기
		int []data= {5,3,1,2,4};
		
		for(int i=0;i<data.length-1;i++)//기준
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]>data[j])//오름차순  (< 내림차순)
				{
					int temp=data[i];//자리바꾸기 위한 빈 공간 temp
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		//출력
		for(int a:data)
			System.out.printf("%d\n",a);
		
	}

}
