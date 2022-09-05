package test.day0727;

class GenericType<T>
{
	T[] v; // 배열로 멤버변수를 주고
	
	public void set(T[] n) //모든 타입의 n을 주면 v배열을 만든다
	{
		v=n;
	}
	
	public void print()
	{
		for(T s:v)
			System.out.print(s+"  ");
		System.out.println();
	}
}

public class Ex3Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []sarr= {"사과","오렌지","딸기"};
		//T는 모든 타입을 제네릭으로 설정할 수 있다
		GenericType<String> t1=new GenericType<>();
		t1.set(sarr);
		t1.print();
		
		Integer []narr= {90,89,100,78};//int 말고 Integer라고 해야함
		GenericType<Integer> t2=new GenericType<>();
		t2.set(narr);
		t2.print();
		
		
	}

}
