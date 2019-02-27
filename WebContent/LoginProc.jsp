<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<!-- 결과값 받는 jsp 넘길때 모델객체(bean)으로 넘김 그래서 저렇게 사용 -->
<body>
    넘어온 데이터는  아이디: ${bean.id} <br>
    아이디: ${bean.pwd}<br>
    이메일: ${bean.email }<br>
    주소: ${bean.address }<br>
   번호: ${bean.phone }
</body>
</html>