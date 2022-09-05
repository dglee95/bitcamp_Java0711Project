package test.day0719;

public class OxChaejum {
	public static final String JUNGDAP="12124";//상수는 static final
	private String dap;
	private char[] ox=new char[5];
	private String name;
	private int score;
	private int rank;
	
	public OxChaejum() {}
	
	public OxChaejum(String name,String dap)
	{
		this.name=name;
		this.dap=dap;
	}
	
	public void check()//ox와 score 구하기
	{
		for(int i=0;i<dap.length();i++)
		{
			if(JUNGDAP.charAt(i)==dap.charAt(i))
			{
				ox[i]='O';
				score+=20;
			}
			else
				ox[i]='X';
		}
	}
	
	//등수구하기-점수가 모두 구해진 다음에 호출
	public static void getRank(OxChaejum [] stu)
	//멤버변수를 직접 들고오진 않을거기때문에 static
	//이미 계산된 배열을 전체적으로 들고 올거기 때문에 static
	{
		for(int i=0;i<stu.length;i++)
		{
			stu[i].rank=1;
			for(int j=0;j<stu.length;j++)
			{
				if(stu[i].score<stu[j].score)
					stu[i].rank++;
			}
		}
	}
	
	public static void showTitle()
	{
		System.out.println("이름       채점     \t점수   등수");
		System.out.println("-----------------------------------");
	}
	
	public void writeChaejum()
	{
		System.out.print(name+"\t");
		for(char a:ox)
			System.out.printf("%3c",a);
		System.out.println("\t"+score+"\t"+rank);
	}
		
	
	
	
	
	
	
	
}
