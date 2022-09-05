package test.day0727;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set인터페이스: Set을 구현하는 클래스 HashSet, TreeSet
//Set의 특징: 중복값이 들어갈 수 없다
//HashSet:비순차적
//TreeSet:오름차순
public class Ex1Set {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<>();//뒤 제네릭스는 생략가능
		System.out.println("크기:"+set1.size());//0:아무것도 없음
		set1.add("apple");
		set1.add("apple");
		set1.add("orange");
		set1.add("orange");
		set1.add("kiwi");
		System.out.println("크기:"+set1.size());//3:중복값은 덮어씀
		System.out.println("** 출력 1 **");
		for(String s:set1)
			System.out.println(s);//순서가 중요한 데이터타입이 아님
		System.out.println("** 출력 2 **");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext()) // 다음 데이터가 있으면 true 없으면 false
		{
			System.out.println(iter.next());//비순차적
		}
		
	}

}
