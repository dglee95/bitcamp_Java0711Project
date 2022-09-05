package test.day0715;

import java.util.Scanner;

public class Ex5Puzzle {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] puzzle=new int[3][3];
		int r=(int)(Math.random()*3)+1;
		int binggo,cnt;
		cnt=0;
		
		while(true)
		{
			binggo=0;
			System.out.println("** 퍼즐 게임 **");
			//1~3난수 발생해서 배열에 넣기
			for(int i=0;i<puzzle.length;i++)
			{
				for(int j=0;j<puzzle[i].length;j++)
				{
					puzzle[i][j]=(int)(Math.random()*3)+1;
				}
			}
			
			//출력
			for(int i=0;i<puzzle.length;i++)
			{
				for(int j=0;j<puzzle[i].length;j++)
				{
					System.out.printf("%4d",puzzle[i][j]);
				}
				System.out.println();
			}
			//빙고 갯수
			for(int i=0;i<3;i++)
			{
				//행방향
				if(puzzle[i][0]==puzzle[i][1] && puzzle[i][0]==puzzle[i][2])
					binggo++;
				//열방향
				if(puzzle[0][i]==puzzle[1][i] && puzzle[0][i]==puzzle[2][i])
					binggo++;
				
					
			}
			// \방향
			if(puzzle[0][0]==puzzle[1][1] && puzzle[0][0]==puzzle[2][2])
				binggo++;
			if(puzzle[0][2]==puzzle[1][1] && puzzle[0][2]==puzzle[2][0])
				binggo++;
			//빙고출력
			if(binggo==0)
				System.out.println(++cnt+"회차 : 꽝!!!!!!");
			else
				System.out.println(++cnt+"회차 : "+binggo+"빙고");
			
//			if(binggo==8)
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("q"))
				break;
		}
		System.out.println("** 종료합니다 **");
		
		
		
		
		
		
	}

}
