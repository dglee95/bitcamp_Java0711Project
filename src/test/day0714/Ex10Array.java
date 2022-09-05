package test.day0714;

public class Ex10Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []kor= {89,100,78,90,77};
		int []eng= {100,90,76,89,67};
		int []tot=new int[5];
		int []rank=new int[5];
		
		//총점
		for(int i=0;i<kor.length;i++)
		{
			tot[i]=kor[i]+eng[i];	
		}
		
		//등수구하기 (다중 for문) 1.for문(i) 2.for문(j=0부터 시작)
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)//j가 0
				if(tot[i]<tot[j])
					rank[i]+=1;
		}
	
		//출력
		System.out.println("번호\t국어\t영어\t총점\t등수");
		System.out.println("-----------------------------------------------");
		for(int i=0;i<kor.length;i++)
		{
			System.out.println(i+1+"\t"+kor[i]+"\t"+eng[i]+"\t"+
					tot[i]+"\t"+rank[i]+"등");
		}
	}

}
