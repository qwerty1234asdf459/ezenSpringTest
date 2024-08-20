package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
// 이 컨트롤러 호출시 /answer부터 확인
@Controller
public class AnswerController {
	
	@Autowired
	private QuestionService qService;
	@Autowired
	private AnswerService aService;
	
	@PostMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id,
			@RequestParam(value="content") String content) throws PpakchimException {
//		@PathVariable : 주소값(쿼리스트링값)을 받아올 때 사용
//		 - 주소의 변수값을 받아올 때 사용
//		 - 값을 무조건 하나만 받아올 수 있음
//		@RequestParam : 여러개의 값을 받아올 때 사용
//		 - 사용자가 입력한 값을 받아올 때 사용
		try {
			Question q1 = this.qService.getQuestion(id);
			this.aService.create(q1, content);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return String.format("redirect:/detail/%s", id);
//		redirect는 중복 방지용, 재요청
	}
	
}
