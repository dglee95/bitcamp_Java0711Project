package test.day0719;

public class Student {
	private String name;
	private String hakbun;
	private int score;
	
	Student () {}
	
	Student (String name) {
		this.name=name;
	}
	
	Student (String name,String hakbun,int score){
		this.name=name;
		this.hakbun=hakbun;
		this.score=score;
	}
	public char getGrade()
	{
		//몇 점 이상 'A' 이런거
		return score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
	}
	
	public static void showTitle()
	{
		System.out.println("이름\t학번\t점수\t학점");
		System.out.println("------------------------------------");
	}
	
	public void writeStudent() 
	{
		System.out.println(name+"\t"+hakbun+"\t"+score+"\t"+getGrade());
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setHakbun(String hakbun) 
	{
		this.hakbun=hakbun;
	}
	
	public void setScore(int score) 
	{
		this.score=score;
	}
	
	public void setData(String name,String hakbun,int score) {
		this.name=name;
		this.hakbun=hakbun;
		this.score=score;
	}
	
	
	
	
	
	
	
	
}
