package test.day0727;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new TreeSet<>();
		set1.add("apple");
		set1.add("manggo");
		set1.add("banana");
		set1.add("apple");
		set1.add("orange");
		set1.add("1");
		System.out.println("사이즈:"+set1.size());//4: 중복값 덮어씀
		System.out.println("** 출력 **");
		for(String s:set1)
			System.out.println(s);//오름차순으로 출력
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println();
		System.out.println("** 로또 숫자 6개를 구하시오 **");
		Random r=new Random();
		Set<Integer> set2=new TreeSet<>();
		while(set2.size()<6)
		{
			set2.add(r.nextInt(45)+1);
		}
		for(Integer s:set2)
			System.out.printf("%3d",s);
		
		Set<Integer> set3=new TreeSet<>();
		Random r1=new Random();
		while(set3.size()<10)
		{
			set3.add(r1.nextInt(45)+1);
		}
		for(Integer s:set3)
			System.out.printf("%3d",s);
		
	}
}
