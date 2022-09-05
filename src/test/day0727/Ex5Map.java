package test.day0727;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map 인터페이스:Map인터페이스를 구현한 HashMap
//key,value의 쌍으로 저장되는 구조
//이 때 key의 타입은 set타입이다. 즉, 중복x 비순차적 (HashSet)

public class Ex5Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map1=new HashMap<>();
		System.out.println(map1.size());//0
		map1.put("name", "김태희");
		map1.put("age", "23세");
		map1.put("addr", "강남구");
		map1.put("name", "이효리");//덮어써짐 갯수도 그대로3
		System.out.println(map1.size());//3
		
		System.out.println("이름:"+map1.get("name"));//이효리
		System.out.println("나이:"+map1.get("age"));
		System.out.println("주소:"+map1.get("addr"));
		System.out.println("혈액형:"+map1.get("blood"));//해당 key가 없을때는 null
		//프로그램 짤 때 value가 null이면 "해당 값은 없습니다"라고 코딩
		System.out.println("** 전체 key와 value를 알고싶을 때 **");
		//key값들을 먼저 얻는다
		Set<String> keys=map1.keySet();//key값을 얻는 keySet();
		for(String k:keys)
		{
			String v=map1.get(k);//k키에 들어있는 밸류값을 얻는 get(Key값);
			System.out.println(k+"=>"+v);
		}
		map1.remove("name");
		System.out.println(map1.size());//2
		
		map1.clear();//다 지워짐
		System.out.println(map1.size());//0
		
	}

}
