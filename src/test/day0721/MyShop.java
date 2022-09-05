package test.day0721;

public class MyShop {
	String sangpum;
	int su;
	int danga;
	
	public MyShop() {}
	
	public MyShop(String sangpum) {
		this.sangpum=sangpum;
	}
	
	public MyShop(String sangpum,int su,int danga){
		this.sangpum=sangpum;
		this.su=su;
		this.danga=danga;
	}
	
	public void setSangpum(String sangpum) {
		this.sangpum=sangpum;
	}
	
	public void setSu(int su) {
		this.su=su;
	}
	
	public void setDanga(int danga) {
		this.danga=danga;
	}
	
	public static void showTitle() {
		System.out.println("\t상품 목록");
		System.out.println();
		System.out.println("번호\t상품명\t수량\t단가\t총금액");
		System.out.println("--------------------------------");
	}
	
	public void writeShop() {
		System.out.println(sangpum+"\t"+su+"\t"+danga+"\t"+su*danga);
	}
	
	
}
