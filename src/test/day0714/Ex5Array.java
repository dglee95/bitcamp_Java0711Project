package test.day0714;

public class Ex5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {243,21,592,302,1,56,31,6,3821,32};
		int max=data[0];//첫번째 값을 max에 넣은 후 1번지부터 비교
		int min=data[0];
		System.out.println("**배열에서 최대값, 최소값 구하기 **");
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			if(min>data[i])
				min=data[i];
		}	
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		System.out.println("**다른 출력 방법**");
		for(int d:data)
		{
			if(max<d)
				max=d;
			if(min>d)
				min=d;
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		
	}

}
