package test.day0714;

public class Ex4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str1;
		str1=new String[4];
		String[] str2= {"red","green","blue","yellow"};
		System.out.println("** str1 출력 **");
		for(String s:str1)
			System.out.println(s);
		System.out.println();
		System.out.println("** str2 출력 **");
		for(String s:str2)
			System.out.println(s);
		
		System.out.println("** str1에 이름 4개 아무거나 넣고 다시 출력");
		
		str1[0]="유재석";
		str1[1]="강호동";
		str1[2]="이영자";
		str1[3]="신동엽";
		for(int i=0;i<str1.length;i++)//몇 번째인지 설명하면서 출력이 가능 (상세)
			System.out.println(i+":"+str1[i]);
		for(String s:str1)//데이터만 출력 (간편)
			System.out.println(s);
		
			
		
	}

}
