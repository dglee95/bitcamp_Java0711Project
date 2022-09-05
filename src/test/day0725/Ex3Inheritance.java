package test.day0725;

class Super3 {
	private String schoolName;
	private String schoolLoc;

	Super3() {
		schoolName = "청담중학교";
		schoolLoc = "청담동";
	}

	Super3(String schoolName, String schoolLoc) {
		this.schoolName = schoolName;
		this.schoolLoc = schoolLoc;
	}
	
	@Override//최상위에서 Override 함 스펠링 틀릴 수도있어서
	public String toString() {
		// TODO Auto-generated method stub
		return "학교명:"+schoolName+",위치:"+schoolLoc;
	}
}
//////////////////////////
class Student extends Super3
{
	private String stuName;
	
	Student(String stuName)
	{
		//super 생성자 생략
		this.stuName=stuName;
	}
	
	Student(String schoolName,String schoolLoc,String stuName)
	{
		super(schoolName,schoolLoc);//생성자에 주는 것
		this.stuName=stuName;
	}
	
	@Override//@어노테이션 쓰는 이유는 철자때문에
	public String toString() {
		// TODO Auto-generated method stub
		String data=super.toString();//부모클래스의 메서드 호출
		data+="\n학생명:"+stuName;
		return data;
	}
	
}
public class Ex3Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("김영자");
		System.out.println(s1.toString());
		System.out.println(s1);//레퍼런스 변수만 쓸 경우 자동으로 toString 호출
		//toString 없으면 레퍼런스 주소 호출됨
		
		Student s2=new Student("해강고등학교","해운대구","이동건");
		System.out.println(s2);
		//toString이 있을 때 레퍼런스를 알 수는 없나?
		
		

	}

}
