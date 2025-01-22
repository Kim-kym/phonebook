package himedia.phonebook.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.phonebook.repository.vo.PhonebookVo;

//	이 매퍼 인터페이스를 mybatis mapper 설정의 namespace로 등록해줘야 한다.
@Mapper	//	MyBatis Mapper
public interface PhonebookMapper {
	List<PhonebookVo> selectAll();

	int insert(PhonebookVo phonebookVo);
	
//	@Select("SELECT * FROM phonebook WHERE id=#{id}") phonebook.xml의 Mapper를 없애는 대신 이렇게 써도 됨
	PhonebookVo selectOne(Integer id);
	
	int update(PhonebookVo phonebookVo);
	
	int delete(Integer id);
}
