package test.day0714;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String msg;
		int []alpha=new int[26];
		System.out.println("영어 문장 입력");
		msg=sc.nextLine();
		for(int i=0;i<msg.length();i++)//문자열이라서 ()가 들어감
		{
			//일단 소문자로 변경후 한글자씩 얻는다
			char a=msg.toLowerCase().charAt(i);
			//공백이나 특수문자는 얻지 않는다
			if(a>='a' && a<='z')
				alpha[a-'a']++;//나이랑 똑같은 공식 age[data[i]/10]++;
		}
		for(int i=0;i<alpha.length;i++)
		{
			System.out.printf("%c:%d개\t",i+'A',alpha[i]);
			if(i%5==4)
				System.out.println();
		}	
	}
}
