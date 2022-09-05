package test.day0715;

public class Ex4Array2Cha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][]str= {
				{"빨강","노랑"},//0행
				{"장미꽃","안개꽃","다알리아"},//1행
				{"강호동","이영자","유재석","하하"}//2행
		};//java는 행마다 열갯수를 다르게 줄 수 있음 C언어는 최대 열갯수만큼 모든칸에 초기화값 줌
		System.out.println("행갯수:"+str.length);
		System.out.println("0번행열갯수:"+str[0].length);
		System.out.println("1번행열갯수:"+str[1].length);
		System.out.println("2번행열갯수:"+str[2].length);
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
				System.out.print(str[i][j]+"\t");
			System.out.println();
		}
	
	}
	
}
