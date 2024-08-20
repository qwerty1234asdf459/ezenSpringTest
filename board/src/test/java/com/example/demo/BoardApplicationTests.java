package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	private QuestionResponsitory qRepo;
	
	@Test
	void contextLoads() {
		Question q1 = new Question();
		q1.setSubject("군침도는 메뉴 추천해주세요");
		q1.setContent("저는 오이 알레르기가 있어요." + "근데 오이향은 좋아해요.");
		q1.setCreateDate(LocalDateTime.now());
		this.qRepo.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("감기조심하세요");
		q2.setContent("요즘 독감이 유행하고 있습니다.");
		q2.setCreateDate(LocalDateTime.now());
		this.qRepo.save(q2);
//		여기서 나온 데이터는 익명인스턴트로서 sel에 들어감 제일 먼저 들어간 건 0번 다음은 1번 또 다음은 2번
//		위의 코드를 보면 알던대로 기명인스턴스 생성 아래는 set써서 값 세팅한거고
//		save라는 메서드를 사용해서 q1이나 q2에 담긴 값들을 qRepo에 저장함
//		findAll : 데이터 전체조회(해당 리파지토리 전체에 있는)
//		List<Question> sel = this.qRepo.findAll();
////		                        qRepo라는 인스턴스에 findAll 메서드 적용
////		save를 통해 저장된 qRepo 내부의 값들이 findAll으로 조회할 수 있게 됨
////		이러한 속성은 sel에 지정되었으므로 sel을 통하여 조회할 데이터의 인덱스를 지정할 수 있음
//		
//		System.out.println(sel.toString());
//		
//		Question q = sel.get(1);
////		q 인스턴스를 생성하면서 sel.get으로 조회할 값의 인덱스를 지정함
//		System.out.println(q.getSubject());
//		System.out.println(q.getContent());
		
//		assertEquals
//		기대값이 실제값과 똑같은지 체크하는 메서드(왼쪽 기대값, 오른쪽 실제값)
//		데이터를 가늠잡고 싶을 때 주로 사용
//		2024.07.23일을 기준으로 현 DB의 데이터 수는 3건
//		하지만 기대값을 100으로 적으니 당연히 맞지 않아 Junit 테스트 결과가 failure로 뜰 수밖에 없음
//		assertEquals(100, sel.size());
		
//		이 경우는 내용에 군침이싹도노라는 내용이 있는지 확인하는 것 당연히 없음
//		assertEquals("군침이싹도노", q.getSubject());
		
//		데이터 수정
//		findByld
//		Optional<Question> oq = this.qRepo.findById(1);
////		이건 인덱스값이 아니라 id기준
//		Question q2 = oq.get();
////		findById는 Id i번부터 데이터를 찾아오라는 것이기 때문에 get으로 인덱스를 지정하지 않아도 됨
////		인스턴스 oq에는 1번의 내용이 담겨있음
//		q2.setSubject("점심메뉴 추천좀요");
//		this.qRepo.save(q2);
		
//		데이터 삭제
//		Optional<Question> oq = this.qRepo.findById(1);
//		Question q2 = oq.get();
//		q2.setSubject("점심메뉴 추천좀요");
//		this.qRepo.delete(q2);
//		
//		List<Question> sel2 = this.qRepo.findAll();
//
//        System.out.println(sel2.toString());
		
		
		
		
		
		
		
		
	}

}
