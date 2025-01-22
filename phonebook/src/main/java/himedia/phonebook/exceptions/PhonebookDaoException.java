package himedia.phonebook.exceptions;

import himedia.phonebook.repository.vo.PhonebookVo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhonebookDaoException extends RuntimeException {
	private PhonebookVo phonebookvo = null;
	
	public PhonebookDaoException(String message,
								Throwable cause) {
		super(message, cause);
	}
	
	public PhonebookDaoException(String message, 
								Throwable cause,
								PhonebookVo vo) {
		super(message, cause);
		this.phonebookvo = vo;
	}


}
