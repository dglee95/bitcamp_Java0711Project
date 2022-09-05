package test.day0726;
//인터페이스로 설계하는 건 자바 권장사항
public interface DaoInter {
	public void insertMember(MemberDto dto);
	public void updateMember(MemberDto dto);
	public void deleteMember(String name);
	public void selectAll();
}
