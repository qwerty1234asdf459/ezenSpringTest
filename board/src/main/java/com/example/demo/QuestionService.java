package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionResponsitory qr;
	
	public List<Question> getList(){	
		return this.qr.findAll();
//		왜 굳이 QuestionService에 getList 메서드를 새로 만들어서까지 우회적으로 가져가는가?
//		현업에서 이렇게 하는 이유는 컨트롤러에서 직접 땡겨오지 않고 여길 통해 가져가게 됨
//		이렇게 하면 여기서만이 아니라 다른 곳에서도 List<Question> qList = this.qr.getList();
//		만 쓰면 이걸 사용할 수 있게 되고 컨트롤러에 모든 걸 넣어두면 보안상 문제가 커지게 됨
//		데이터가 에러가 났을 때 캔슬하는 것도 가능해짐
	}
		
		public Question getQuestion(Integer id) throws PpakchimException{
//			존재하지 않는 데이터를 조회할 때는
//			데이터가 존재하지 않습니다 라는
//			PpakchimException을 구현해볼 것
			Optional<Question> q1 = this.qr.findById(id);
			if(q1.isPresent()) {
				return q1.get();
			}else {
				throw new PpakchimException("데이터를 찾을 수 없습니다.");
			}
		}
		public Question getForm(Integer id) throws PpakchimException{
			Optional<Question> q1 = this.qr.findById(id);
			if(q1.isPresent()) {
				return q1.get();
			}else {
				throw new PpakchimException("데이터를 찾을 수 없습니다.");
			}
		}

		public void create(String subject, String content) {
			// TODO Auto-generated method stub
			Question q = new Question();
			q.setSubject(subject);
			q.setContent(content);
			q.setCreateDate(LocalDateTime.now());
			this.qr.save(q);
		}
		
	}
