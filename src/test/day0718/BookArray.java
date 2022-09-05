package test.day0718;

public class BookArray {
	public static void main(String[] args) {
		Book[] library=new Book[5];//생성이 아닌 할당만 한거라 null값만
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}	
	}
}