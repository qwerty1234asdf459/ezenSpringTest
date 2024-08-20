package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository aRepository;
	
	public void create(Question q, String content) {
//		
		
		Answer answer = new Answer();
		answer.setContent(content);
//		content : 사용자가 입력할 내용
		answer.setCreateDate(LocalDateTime.now());
//		LocalDateTime : 사용자가 입력했을 시간대
		answer.setQuestion(q);
//		q : 질문에 종속시키기 위해 불러옴
//		이미 ManyToOne이 있으므로 종속시키기 위해 정보를 불러온 것
		this.aRepository.save(answer);
//		answer의 정보를 aRepository의 save에 넘김
		
	}
	
}
