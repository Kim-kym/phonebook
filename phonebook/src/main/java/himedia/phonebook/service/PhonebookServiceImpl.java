package himedia.phonebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.phonebook.repository.PhonebookDao;
import himedia.phonebook.repository.vo.PhonebookVo;

@Service
public class PhonebookServiceImpl implements PhonebookService {
	@Autowired
	private PhonebookDao phonebookDaoImpl;
	
	@Override
	public boolean insertPhonebook(PhonebookVo phonebookVo) {
		return 1 == phonebookDaoImpl.insert(phonebookVo);
	}

	@Override
	public boolean updatePhonebook(PhonebookVo phonebookVo) {
		return 1 == phonebookDaoImpl.update(phonebookVo);
	}

	@Override
	public boolean deletePhonebook(Integer id) {
		return 1 == phonebookDaoImpl.delete(id);
	}

	@Override
	public PhonebookVo selectPhonebook(Integer id) {
		return phonebookDaoImpl.selectOne(id);
	}

	@Override
	public List<PhonebookVo> selectPhonebookList() {
		return phonebookDaoImpl.selectAll();
	}

}
