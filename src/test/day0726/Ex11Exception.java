package test.day0726;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex11Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//score.txt를 읽은 후 갯수,총점,평균을 구하시오
		FileReader fr=null;
		BufferedReader br=null;
		int sum=0;
		int cnt=0;
		double avg;

		try {
			fr=new FileReader("D:\\java0711\\score.txt");
			br=new BufferedReader(fr);

			while(true)
			{
				//한줄씩 읽기
				String line=br.readLine();//add catch clause to surrounding try를 하면 기존 try문에 catch 추가
				if(line==null)
					break;
				cnt++;
				try {
				sum+=Integer.parseInt(line);
				}catch(NumberFormatException e) {
					cnt--;
				}
			}
			avg=(double)sum/cnt;
			System.out.println("총점:"+sum);
			System.out.printf("평균:%2.2f\n",avg);
			System.out.println("갯수:"+cnt);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
