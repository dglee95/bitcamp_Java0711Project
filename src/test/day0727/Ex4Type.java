package test.day0727;

class Powder
{
	public void doPrinting()
	{
		System.out.println("Powder 재료로 출력한다");
	}
	public String toString()
	{
		return "재료는 Powder입니다";
	}
}
//////////////////////
class Plastic
{
	public void doPrinting()
	{
		System.out.println("Plastic 재료로 출력한다");
	}
	public String toString()
	{
		return "재료는 Plastic입니다";
	}
}
//////////////////////////
//코드가 거의 비슷한 여러 클래스를 묶을때 편함
class GenericPrinter<T>//여러개의 클래스를 묶는 제네릭클래스
{
	private T material;//Powder가 올수도 있고 Plastic이 올수도 있음
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString()
	{
		return material.toString();
	}
}

public class Ex4Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> g1=new GenericPrinter<>();
		g1.setMaterial(new Powder());
		Powder p=g1.getMaterial();
		System.out.println(p.toString());
		
		GenericPrinter<Plastic> g2=new GenericPrinter();
		g2.setMaterial(new Plastic());
		Plastic p2=g2.getMaterial();
		System.out.println(p2.toString());
	}
}
