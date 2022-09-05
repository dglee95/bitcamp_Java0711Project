package test.day0726;

import java.util.List;
import java.util.Vector;

public class MemberDao implements DaoInter {

	List<MemberDto> list=new Vector<>();//MemberDto만 넣겠다 MemberDto가 아니면 에러남
	//뒤 <>에 MemberDto 생략 가능
	
	
	@Override
	public void insertMember(MemberDto dto) {
		// TODO Auto-generated method stub
		System.out.println(dto.getName()+"님을 리스트에 추가함!");
		list.add(dto);//리스트에 추가
		//add라는게 오버라이드 되어 잇어서 Vector이 가진 add를 쓰는 것
	}

	@Override
	public void updateMember(MemberDto dto) {
		// TODO Auto-generated method stub
		//dto의 이름이 어디에 있는지 인덱스 알아내기
		int idx=-1;
		for(int i=0;i<list.size();i++)//list는 배열이 아니라 size로 길이를 구함
		{
			if(dto.getName().equals(list.get(i).getName())) {//dto의 이름을 list의 i번째 인덱스의 이름을 꺼내서 비교해서 같으면
				idx=i;//idx가 -1이면 못 찾은거 찾으면 i로 바뀜
				break;
			}
		}
		if(idx==-1)
			System.out.println("수정할 이름의 멤버가 없어요");
		else
		{
			list.set(idx, dto);//인덱스 번지를 dto로 수정
			System.out.println("수정했습니다");
		}


	}

	@Override
	public void deleteMember(String name) {
		// TODO Auto-generated method stub
		int idx=-1;
		for(int i=0;i<list.size();i++)
		{
			MemberDto dto=list.get(i);
			if(name.equals(dto.getName()))
			{
				idx=i;
				break;
			}
		}
		if(idx==-1)
			System.out.println(name+"님은 명단에 없습니다");
		else
		{
			System.out.println(name+"님의 정보를 삭제했습니다");
			list.remove(idx);//삭제
		}
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("총 "+list.size()+"명");
		System.out.println("이름\t주소");
		for(MemberDto dto :list)
			System.out.println(dto.getName()+"\t"+dto.getAddr());//프라이빗이라 get으로 출력
	}



}
