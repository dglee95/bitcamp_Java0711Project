package test.day0727;

public class Person {
	private String name;
	private String age; // 계산할 목적아니여서 String
	private String addr;
	
	public Person() {
		super();
	}

	public Person(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}