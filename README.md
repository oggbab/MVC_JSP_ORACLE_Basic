# MVC패턴_JSP와 ORACLE DB로 만든 Basic
리마인드를 위해 만들었는데 공유하고 싶어 올립니다.
최대한 구조를 단순하게 잡았습니다.
패턴 기본 구조에 톰캣과 db연결 부분도 단순합니다.
*추가적으로 자세한 설치방법과 일반적인 에러에 대한 코멘트도 해두겠습니다.
감사합니다 :)

[권장 순서]
좀더 쉬운 학습을 위해 다음을 추천하지만 하지않으셔도 무관합니다.
>프로그램 설치 및 프로젝트 만들기 > 서버연결 하여 hello world 띄워보기 > 시작jsp 바꿔보기
>DB 연결확인 > 쿼리로 DB넣어보기 > 회원가입 페이지 만들기

[설치]
1.기본 프로그램
>java 설치후 환경변수 설정
>IDE 저는 이클립스 썼어요
>tomcat 서버를 위한 http://tomcat.apache.org/ 에서 버전 8.5을 받아 압축풀기(버전은 상관없어요)
>oracleDB 다른 DB쓰셔도 됩니다

2.mvc 구축
>01 dynamic web project 만들기
>_기본 라이브러리는 추가됨(jdbc등)
>_만드는 화면에서 반드시 next로 넘어가 web.xml생성

02 WEB-INF \ web.xml 에서 시작 페이지(jsp)설정
>//display-name 은 톰캣 패키지 내부 server.xml 최하단 path라는 곳에 기입됩니다.
><display-name>testMVC2</display-name>
><welcome-file-list>
><welcome-file>JoinForm.jsp</welcome-file>
></welcome-file-list>

03 어떻게 구동되는 걸까
>View(보여지는 페이지 여기선 JoinForm.jsp) 에서 버튼클릭
>Controller(실제 기능이 있는 클래스) 
>_HelloWorld.class 호출할때 같이 온 파라미터를 바로 01다음페이지에 넘겨주거나 02Model(MemberBean)에서 걸러주거나 03걸러진 데이터를 DAO로 넘김
>Model
>_MemberBean.class 사용될 파라미터 이름과 게터세터
>_MemberDAO.class DB연결 및 쿼리사용

04 일반적인 에러
>@제가 해결한 방법으로도 되지않을 수 있습니다.
>404 톰캣서버 재설치/컴퓨터 재실행/시작 페이지 재설정(설치> 2 > 02)
>ORA-01008 db테이블 레코드명&쿼리문 오타& 무튼 잘못 넘기거나 잘못 받은 경우
>ORA-00904 위와 유사(레코드명 불일치)
>ORA-03115 위와 유사했음

