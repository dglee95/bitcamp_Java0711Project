package test.day0726;
//DTO는 거의 이런 구조
public class MemberDto { 
	private String name;
	private String addr;
	
	public MemberDto() {
	}
	
	public MemberDto(String name, String addr) {
//		super();//상속 관계가 아닌데도 무조건 나옴
		this.name = name;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
