package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GunchimController {
	
	@Autowired
	private QuestionService qr;

	@GetMapping("/ssak")
	public String hell() {
		return "question_list";
	}
	
	@GetMapping("/list")//사용자가 /list라는 주소를 입력하면 컨트롤러가 이 주소를 찾아보고 없으면 404
//	                      이 경우는 여기 있기 때문에 /list라는 주소를 찾아 list 메서드가 호출됨
	public String list(Model model) {
//		List<Question> qList = this.qr.findAll();
		List<Question> qList = this.qr.getList();
//		List에 제네릭으로 Question으로 주고 qr 인스턴스에 findAll 부여해서 db에서 받은 내용을 qList에 저장
		model.addAttribute("questionList", qList);
//		Model : 템플릿(HTML)에 전달할 내용을 넘겨주는 클래스
//		addAttribute : 템플릿에 전달할 객체를 지정하는 메서드
//		템플릿(HTML)에서 (사용자가)보게 될 명칭(이 경우는 question_List에 있는 questionListfmf 의미), 넘길 객체 순으로 작성
		return "question_list";
	}
//		response body라는게 없으면 이 리턴값으로 받은 문장인 question_list의 파일명을 찾으러 감
		
//		question_list(html)의 속성명들은 Question(엔티티)의 속성 명칭과 맞추고
//		model.addAttribute의 보게 될 명칭은 html의 th each의 명칭과 맞춰야 한다
		
	    @GetMapping(value = "/detail/{id}")
//		/detail/은 html 파일의 /detail/ 속성이 있는 곳으로 연결하기 위함
//	    detail의 id값에 따라 연동시킴
	    public String detail(Model model, @PathVariable("id") Integer id) throws PpakchimException {
			Question q = this.qr.getQuestion(id);
			model.addAttribute("question",  q);
			return "question_detail";
		}
	    
	    @GetMapping("/create")
	    public String questionCreate(){
	    	return "question_form";
	    }
	    
	    @PostMapping("/create")
	    public String questionCreate(@RequestParam(value="subject") String subject,
	    		                     @RequestParam(value="content") String content){
	    	this.qr.create(subject, content);
	    	return "redirect:/list";
//	    	/list 주소로 이동
	    }
	
	
}

