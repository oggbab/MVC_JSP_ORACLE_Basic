<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
<!-- 시작 페이지 web.xml에서 시작 페이지 설정-->
   <center>
   <h2>회원가입</h2>
   <!-- action 부분이 컨트롤러 호출부 -->
   <form action="Mproc2" method="post">
   <table width="300" border="1">
       <tr height="40">
          <td width="120">아이디</td>
          <td width="180"><input type="text" name="id"></td>          
       </tr>
       <tr height="40">
          <td width="120">패스워드</td>
          <td width="180"><input type="password" name="pwd"></td>          
       </tr>
       <tr height="40">
          <td width="120">이메일</td>
          <td width="180"><input type="text" name="email"></td>          
       </tr>
       <tr height="40">
          <td width="120">주소</td>
          <td width="180"><input type="text" name="address"></td>          
       </tr>

             <tr height="40">
          <td width="120">번호</td>
          <td width="180"><input type="text" name="phone"></td>          
       </tr>
         
       <tr height="40">
          <td align="center" colspan="2">
              <input type="submit" name="로그인">
          </td>          
       </tr>
   </table>
   </form>
   </center>

</body>
</html>