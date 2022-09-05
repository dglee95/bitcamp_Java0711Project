package test.day0727;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex7List {
	//멤버 변수로 주는건 멤버메서드에서도 사용가능하게
	List<Person> list=new Vector<>();
	Scanner sc=new Scanner(System.in);
	//저장할 파일경로
	static final String FILENAME="D:\\java0711\\person.txt";//저장이랑 불러오는걸 상수로 줌 


	public Ex7List() {
		// TODO Auto-generated constructor stub
		//처음 실행시 파일 읽어오기
		this.fileRead();//생성자에 넣음 window.onload 같은 것
	}

	//데이터 추가하는 메서드
	public void addperson()
	{
		System.out.println("person 데이터를 추가합니다");
		System.out.print("이름:");
		String name=sc.nextLine();
		//문제 같은 이름이 있을 경우 이미 존재하는 이름입니다 출력 후 메서드 종료(return)
		if(this.getSearchName(name)!=-1) { // 0보다 크거나같으면 등등
			System.out.println("이미 존재하는 이름입니다");
			return;	
		}
		System.out.print("나이:");
		String age=sc.nextLine();
		System.out.print("주소:");
		String addr=sc.nextLine();
		//Person 생성
		//Person p=new Person(name,age,addr);//방법 1
		Person p=new Person();//방법 2
		p.setName(name);
		p.setAge(age);
		p.setAddr(addr);
		list.add(p);
	}


	//전체 데이터 출력하는 메서드
	public void writePerson()
	{
		System.out.println("person 데이터 전체를 출력합니다");
		System.out.println("총 "+list.size()+"명");
		System.out.println("번호\t이름\t나이\t주소");
		for(int i=0;i<list.size();i++)
		{
			//i번째 person
			Person p=list.get(i);
			System.out.println(i+1+"\t"+p.getName()+"\t"+p.getAge()+"\t"+p.getAddr());

		}
	}

	//메뉴 입력 후 번호 반환하는 메서드
	public int getMenu()
	{
		System.out.println("** 메뉴 **");
		System.out.println("1.추가");
		System.out.println("2.전체출력");
		System.out.println("3.검색");
		System.out.println("4.삭제");
		System.out.println("5.저장 후 종료");
		System.out.println("-----------------------------");
		int n=0;
		//넘버포맷익셉션이 발생하면 무조건 2번
		try {
			n=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("** 문자입력:전체출력합니다 **");//+e.getMessage() 에러메시지
			//			e.getStackTrace(); 에러 라인 번호 추적
			n=2;
		}
		return n;
	}


	//이름을 입력하면 해당 데이터가 있는 곳의 데이터 반환
	//만약 없다면 -1 반환
	public int getSearchName(String name)
	{
		int idx=-1;
		for(int i=0;i<list.size();i++)
		{
			//i번째 데이터 얻기
			Person p=list.get(i);
			//이름 비교해서 같으면 idx에 i값 저장후 빠져나가기
			if(p.getName().equals(name)) {
				idx=i;
				break;
			}
		}
		return idx;
	}

	//이름 입력하면 해당 데이터만 나오게 하기
	public void searchPerson()
	{
		System.out.println("이름으로 검색하기");
		System.out.println("조회할 이름은?");
		String name=sc.nextLine();
		//해당 name이 있는 곳의 인덱스 얻기
		int idx=this.getSearchName(name);
		if(idx==-1) {
			System.out.println(name+"님은 명단에 없습니다");
		} else {
			Person p=list.get(idx);
			System.out.println("** 조회 결과 **");
			System.out.println("이 름 : "+p.getName());
			System.out.println("나 이 : "+p.getAge());
			System.out.println("주 소 : "+p.getAddr());

		}
	}

	//이름 입력하면 해당 데이터 찾아서 지우기
	public void deletePerson()
	{
		System.out.println("이름으로 찾아서 삭제하기");
		System.out.println("삭제할 이름은?");
		String name=sc.nextLine();
		int idx=this.getSearchName(name);
		if(idx==-1) {
			System.out.println(name+"님은 명단에 없습니다");
		} else {
			System.out.println(name+"님은 명단에서 삭제되었습니다");
			list.remove(idx);

		}
	}

	//처음 시작시 파일에서 읽어서 list에 담기
	public void fileRead()
	{
		FileReader fr=null; //try catch 때문에 변수 미리 줌
		BufferedReader br=null; //try catch 때문에 변수 미리 줌

		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			//한줄 단위로 읽어서 ,로 분리 후 person에 넣은 후
			//list에 추가
			while(true)
			{
				String line=br.readLine();
				//더이상 읽을 데이터가 없으면 종료
				if(line==null)
					break;
				//,로 분리된 데이터를 배열로 읽어오기 #1
				//				String []data=line.split(",");//,를 제거하고 인덱스 0번부터 차례로 배열 생성
				//				//split이 잘 못 읽는 기호가 있긴 함
				//				//Person 객체 생성
				//				Person p=new Person();
				//				p.setName(data[0]);
				//				p.setAge(data[1]);
				//				p.setAddr(data[2]);

				//,로 분리하는 또 다른 방법 #2
				//split이 인식못하는 기호는 StringTokenizer로 분리
				Person p=new Person();
				StringTokenizer st=new StringTokenizer(line, ",");
				p.setName(st.nextToken()); // nextToken 할때마다 순서대로 받아옴
				p.setAge(st.nextToken());
				p.setAddr(st.nextToken());
				//list에 추가
				list.add(p);
			}
			System.out.println("총 "+list.size()+"명의 데이터 읽어옴!!");

		} catch (FileNotFoundException e) {
			System.out.println("저장된 데이터가 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();//br이 나중에 열렸으니 br부터 닫아야함
				fr.close();//br이 나중에 열렸으니 br부터 닫아야함
			} catch (IOException | NullPointerException e2) { //각각 변수명 주는게 아니라 변수명 하나
				System.out.println("파일 읽기 오류 발생"+e2.getMessage());
			}
		}

	}

	//종료시 전체 데이터 파일을 저장하는 메서드
	public void fileWrite()
	{
		System.out.println("list를 저장 후 종료합니다");
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILENAME);
			//이름,나이,주소 형태로 저장

			for(Person p:list)
			{
				String s=p.getName()+","+p.getAge()+","+p.getAddr()+"\n";
				fw.write(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7List ex=new Ex7List();
		while(true)
		{
			switch(ex.getMenu())
			{
			case 1://추가
				ex.addperson(); break;
			case 2://전체 출력
				ex.writePerson(); break;
			case 3://검색
				ex.searchPerson(); break;
			case 4://삭제
				ex.deletePerson(); break;
			default://저장 후 종료
				ex.fileWrite();
				System.exit(0);
			}
			System.out.println();

		}
	}

}
