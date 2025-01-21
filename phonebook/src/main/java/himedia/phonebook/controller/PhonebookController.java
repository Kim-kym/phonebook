package himedia.phonebook.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import himedia.phonebook.repository.vo.PhonebookVo;
import himedia.phonebook.service.PhonebookService;

@Controller
public class PhonebookController {
	private static final Logger logger =
			LoggerFactory.getLogger(PhonebookController.class);
	
	@Autowired
	private PhonebookService phonebookServiceImpl;
	
	@GetMapping("/")
	public String list(Model model) {//	Model 객체 선언 
		List<PhonebookVo> list =
				phonebookServiceImpl.selectPhonebookList();
		
		logger.debug("PHONEBOOK LIST:" + list);
		model.addAttribute("list", list);
		return "phonebook/list"; //	list 뷰 파일을 찾아 렌더링하도록 지시 
		
	}
	
	//	게시물 작성 폼
	@GetMapping("/write")
	public String writeForm() {
		return "phonebook/writeForm";
	}
	
	//	게시물 수정 폼
	@GetMapping("/modify/{id}")
	public String modifyForm(
			@PathVariable("id") Integer id) {
		return "phonebook/modifyForm";
	}
}
