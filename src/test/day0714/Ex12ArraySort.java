package test.day0714;

public class Ex12ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"손미나","황신혜","강남길","나훈아","나훈자"};
		System.out.println("이름의 오름차순으로 정렬");
		for(int i=0;i<names.length-1;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)//>이면 오름차순, <이면 내림차순
				{
					String temp=names[i]; // 값을 바꾸기위한 빈 공간 temp
					names[i]=names[j]; //temp=i i=j j=temp 라고 해야 함
					names[j]=temp;
				}
			}
		}
		for(String n:names)
			System.out.println(n);
	}

}
