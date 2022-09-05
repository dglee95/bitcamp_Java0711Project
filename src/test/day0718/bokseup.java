package test.day0718;

import java.util.Scanner;

class Kiwi
{
	private int su;
	private String name;
	
	public Kiwi(String name,int su) {
		this.name=name;
		this.su=su;
	}
	
	public Kiwi () { //디폴트값
		this("거미", 2);
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSu(int su) {
		this.su=su;
	}
	
	public int getSu()
	{
		return su;
	}
	
	public void showInfo() {
		System.out.println(name+","+su);
	}
}

public class bokseup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kiwi k=new Kiwi();
		k.showInfo();
		Scanner sc=new Scanner(System.in);
		int su1;
		String name1;
		
		System.out.println("수를 입력하세요");
		su1=Integer.parseInt(sc.nextLine());
		System.out.println("이름을 입력하세요");
		name1=sc.nextLine();

		k.setName(name1);
		k.setSu(su1);
		
		System.out.println(k.getName()+","+k.getSu());
		k.setSu(2);
	}

}
