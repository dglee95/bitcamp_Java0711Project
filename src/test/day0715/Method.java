package test.day0715;

public class Method {
	int var=1;
	
	static final String SANG="Hello";
	public void setVar(int m)
	{
		System.out.println(this.var);
		this.var=m;
	}
	public int getVar() {
		return var;
	}
	public static void main(String[] args) {
		Method m=new Method();
		m.setVar(0);
		System.out.println(m.var);
	}

}
