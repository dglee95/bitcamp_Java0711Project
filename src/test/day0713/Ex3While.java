package test.day0713;

public class Ex3While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		while(ch<='Z')
		{
			System.out.print(ch+++" ");
		}
		System.out.println();
		int n=65;
		while(n<='Z')//char나 int나 내부적으로 똑같음(아스키코드)
		{
			System.out.printf("%c ",n++);//print((char)n++) 강제형변환
		}
		System.out.println();
		n=65;
		do {
			System.out.print((char)n+++" ");
		}while(n<=90);
		
	}

}
