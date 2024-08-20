package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

//	스프링부트
//	자바 기반의 프레임워크(웹 개발을 위한)
	
//	프레임워크
//	토탈 패키지, 구급상자
	
//	로그인 로그아웃 처리, DB 처리, 권한, 클래스 컨트롤러 주입
//	 -> 프레임워크를 사용하면 우리가 일일이 만들 필요가 없음
//	 -> 프레임워크의 기능만 잘 익히면 우리도 웹 개발 가능
	
//	스프링은 반복과 경험이 최고의 스승
	
//	WAS(Web Applicaton Server)
//	웹 어플리케이션(웹 환경)과 서버 환경을 연결하는 미들웨어
	
//	기본 포트 번호
//	포트 : 네트워크 서비스를 구분하는 번호
	
//	HTTP : 웹서비스(80)
//	HTTPS : SSL이라는 개념을 적용한 웹 서비스(443)	
//	FTP : 파일전송서비스(21)
//	SSH, SFTP : 보안 강화 텔넷, FTP(22)
//	TELNET : 원격 서버 접속 서비스(23)
//	SMTP : 메일 전송 서비스
	
//	SSL : 디지털 인증서
	
//	프로젝트 구성도
//	프로젝트
//	 -> src/main/java (자바 파일을 저장하는 영역 / Controller, Model, 공통 자바 유틸)
//	    프로젝트명+application 파일
//	    (프로그앰의 시작을 담당하는 파일)
//	 -> src/main/resource(자바 파일을 제외한 HTML, CSS, JS, 환경설정 파일 저장영역)
//	    templates : html파일을 받는 영역
//	     -> 템플릿 : 자바코드를 받을 수 있는 HTML 형식의 파일
//	    static : CSS, JS, 미디어 파일들을 저장하는 영역
//	    application.properties : 프로젝트 환경설정 파일
//	 -> src/test/java
//	     테스트 영역
//	 -> 그 외
//	    build..gradle : 프로젝트에 필요한 플러그인, 라이브러리를 설치하는 영역(기본적 세팅과 의존성 주입)
	 
//	스프링 관련 용어
//	MVC1
	
//	MVC2
	
//	POJO(Plain Old Java Object)
	
//	IoC(Inversion of Control)
	
//	DI(Dependency Injection)
	
//	AOP(Aspect Oriented Programming)
	
//	DTO(Data Transfer Object)
	
//	DAO(Data Access Object)
	
//	@Controller
//	 -> 이 클래스가 컨트롤러임을 인식시키는 어노테이션(애너테이션)
//      이 컨트롤러가 없으면 컨트롤러로 인식을 하지 못함
//	@GetMapping
//	 -> 요청된 URL과의 매핑을 담당하는 애너테이션(어노테이션)
//	@ResponseBody
//	URL 요청에 대한 응답으로 문자열을 리턴시키라는 애너테이션(어노테이션)
//	주로 Aiax 등의 요청에서 많이 활용
	
//	ORM(Object-Relational Mapping)
//	프로그래밍 언어를 활용하여 데이터베이스를 다루는 방법
//	데이터베이스에는 테이블이라는 개념이 있음
//	원래는 데이터베이스 관리를 위해서는 쿼리라는 문법을 사용해야 하지만
//	ORM을 활용하면 언어의 코드로도 데이터베이스에 요청을 할 수 있음
//	 -> 테이블 : 데이터 저장소
	
//	JPA(Java Persistence API)
//	자바를 기반으로 ORM을 사용하면 JPA라 부름
//	 -> 자바 ORM 프레임워크
	
//	JPA는 인터페이스 모음
//	인터페이스 모음 = 인터페이스를 구현하는 실제 클래스가 필요
//	 -> JPA를 구현한 실제 클래스 중 Hibernate라는 것이 있음
	
//	엔티티 : 테이블과 대조(매핑) 되는 클래스
//	 - 테이블을 대체하는 클래스
	
//	사용했던 어노테이션(애너테이션) 정리
//	@getter, setter : getter setter 코드 간소화 / lombok 적용이 필수
//	@Entity : 해당 클래스를 엔티티화
//	@Id : 해당 멤버변수(속성)을 기본키로 지정
//	 -> 중복되는 값이 없어야 함
//	@GeneratedValue : 데이터 저장시 해당 속성에 값을 입력하지 않아도
//	                  자동으로 1씩 증가시키는 어노테이션
//	 -> strategy = GenerationType.IDENTITY : 고유 번호 생성 방법 지정(세트로 써야 다른거랑 안 섞임)
//	 -> GenerationType.IDENTITY : 해당 속성만 별도로 번호가 차례대로 증가하도록 처리
//	@Column : 열의 세부설정
//	 -> length : 길이 설정
//	 -> columnDefinition = "TEXT" : 텍스트(문자열)을 데이터로 받을 때
	
//	@OneToMany
//	1 개의 엔티티에 여러개의 멤버변수 참조가 가능하도록 설정
	
//	@ManyToOne
//	여러 개의 멤버변수참조를 한 개의 클래스(엔티티)로 하도록 설정
	
//	mappedBy = 참조할 엔티티 속성명을 작성
//	CascadeType.REMOVE = 해당 속성을 삭제하면 연결된 내용들도 삭제하도록 처리
	
//	@Autowired
//	스프링의 의존성 주입 기능을 사용하여 객체를 주입할 때 쓰는
//	어노테이션(애너테이션)
//	생성자도 만들어줌
	
//	타임리프 문법 정리
//	<tr th:each="question : ${questionList}">
//	 - 타임리프 문법은 기본적으로 th: <- 를 기반으로 시작
//	 -> 모델에 저장된 명칭을 기반으로 나올 데이터를 뽑아주는 반복문
//	    저장되어 있는 리스트의 갯수만큼 반복하여 tr 문장을 출력
//	    여기서 question은 인스턴스같은 거라서 그냥 이름만 맞추면 딴걸로 해도 됨
	
//	<td th:text="${question.subject}">
//	 question 객체가 가지고 있는 속성 중 subject의 값을 출력
	
//	th:if
//	 조건문
//	ex) th:if="${question != null}"
	
//	서비스단
//	정말 필요한가?
	
//	1. 코드의 모듈화
//	2. 재사용성
//	3. 컨트롤러 탈취시 데이터 보호
	
//	리다이렉트 포워드
	
//	리다이렉트 : 서버에서 클라이언트에 요청한 URL에 대한 응답으로
//	           재접속을 명령하는 것
//	   -> 주소가 바뀌면서 재접속되는 상황
	
//	포워드 : 서버 내부에서 일어나는 호출
//	   -> 해당 주소로 매핑(포워딩)될 때 서버에서
//	      URL 주소를 확인한 후 유저(클라이언트)에게 응답
	
//	리다이렉트 : DB에 추가, 삭제, 수정될 때
//	 -> 중복요청 방지
//	포워드 : 조회, 특정 URL에 대해 외부 공개를 막고 싶을 때
	
	
	
	
	
}