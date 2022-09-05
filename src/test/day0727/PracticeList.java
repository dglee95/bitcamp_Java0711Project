package test.day0727;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;



public class PracticeList {
	Scanner sc=new Scanner(System.in);
	static final String FILE="D:\\java0711\\practice.txt";
	List<Saram> list=new Vector<Saram>();
	Saram saram=new Saram();

	public PracticeList() { // 불러올 때
		this.fileRead();
	}
	
	public void fileRead()
	{
		FileReader fr=null;
		BufferedReader br=null;

		System.out.println("파일 불러오기");
		try {
			fr=new FileReader(FILE);
			br=new BufferedReader(fr);

			while(true)
			{
				String line=br.readLine();
				if(line==null)
					break;
				String []data=line.split(",");
				Saram sa=new Saram();
				sa.setName(data[0]);
				sa.setAge(data[1]);
				sa.setAddr(data[2]);
				list.add(sa);
			}
			System.out.println("총 "+list.size()+"명 불러옴!!");

		} catch (FileNotFoundException|NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException |ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

	public int getMenu() {
		System.out.println("1.추가 2.찾기 3.수정 4.삭제 5.전체출력 6.저장 후 종료");
		int num=0;
		try{
			num=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			num=2;
		}

		return num;
	}

	public void addList()
	{
		System.out.println("추가할 이름 입력");
		String name=sc.nextLine();
		if(this.getTool(name)!=-1)
		{
			System.out.println("중복된 이름이 있습니다");
			return;
		}
		System.out.println(name+"의 나이를 입력");
		String age=sc.nextLine();
		System.out.println(name+"의 주소를 입력");
		String addr=sc.nextLine();

		Saram s=new Saram();
		s.setName(name);
		s.setAge(age);
		s.setAddr(addr);
		list.add(s);
	}

	public void searchList()
	{
		System.out.println("검색할 이름 입력");
		String name=sc.nextLine();
		int idx=this.getTool(name);
		if(idx==-1)
			System.out.println("찾는 이름이 없습니다");
		else
		{
			System.out.println(" 이 름 : "+list.get(idx).getName());
			System.out.println(" 나 이 : "+list.get(idx).getAge());
			System.out.println(" 주 소 : "+list.get(idx).getAddr());
		}

	}

	public void updateList()
	{
		System.out.println("수정할 이름 입력");
		String name=sc.nextLine();
		int idx=this.getTool(name);
		if(idx==-1)
			System.out.println("찾는 이름이 없습니다");
		else
		{
			try {
				System.out.println("나이를 입력하세요");
				list.get(idx).setAge(sc.nextLine());
				System.out.println("주소를 입력하세요");
				list.get(idx).setAddr(sc.nextLine());
			} catch (NullPointerException e) {
				e.getStackTrace();
			}
		}

	}

	public void deleteList()
	{
		System.out.println("삭제할 이름을 입력하세요");
		String name=sc.nextLine();
		int idx=this.getTool(name);
		if(idx==-1)
			System.out.println("찾는 이름이 없습니다");
		else
		{
			list.remove(idx);
			System.out.println(name+"은 삭제되었습니다");
		}


	}

	public void writeList()
	{
		System.out.println("전체 출력");
		System.out.println("이름\t나이\t주소");
		System.out.println("------------------------");
		for(Saram sa:list)
			System.out.println(sa.getName()+","+sa.getAge()+","+sa.getAddr());
	}

	public void exitList()
	{
		System.out.println("저장 후 종료");
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILE);
			for(Saram sa:list)
				fw.write(sa.getName()+","+sa.getAge()+","+sa.getAddr()+"\n");

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

	

	public int getTool(String name) {
		int idx=-1;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getName().equals(name))
			{
				idx=i;
				break;
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeList pl=new PracticeList();
		while(true)
		{
			switch(pl.getMenu())
			{
			case 1:
				pl.addList();
				break;
			case 2:
				pl.searchList();
				break;
			case 3:
				pl.updateList();
				break;
			case 4:
				pl.deleteList();
				break;
			case 5:
				pl.writeList();
				break;
			default:
				pl.exitList();
				System.exit(0);
			}
		}
	}

}
