package test.day0719;

public class Ex1Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] stu=new Student[4];
		stu[0]=new Student();//디폴트 초기화
		stu[1]=new Student("이진");//나머지 변수값 초기화 안해도 됨
		stu[2]=new Student("이효리","s768567",90);
		stu[3]=new Student("강호동","s123456",67);
		
		System.out.println("** 생성된 값 출력 **");
		Student.showTitle();//이름 학번 점수 학점 클래스명.으로 호출된거보면 스테이틱 메서드
		for(Student s:stu)
			s.writeStudent();
		
		System.out.println("** 값 변경 후 다시 출력 **");
		stu[0].setName("이영자");
		stu[0].setHakbun("s676767");
		stu[0].setScore(88);
		
		stu[1].setData("이진아","s121212",94);
		
		Student.showTitle();
		for(Student s:stu)
			s.writeStudent();
		
		
		
		
	}

}
