<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
<!-- ���� ������ web.xml���� ���� ������ ����-->
   <center>
   <h2>ȸ������</h2>
   <!-- action �κ��� ��Ʈ�ѷ� ȣ��� -->
   <form action="Mproc2" method="post">
   <table width="300" border="1">
       <tr height="40">
          <td width="120">���̵�</td>
          <td width="180"><input type="text" name="id"></td>          
       </tr>
       <tr height="40">
          <td width="120">�н�����</td>
          <td width="180"><input type="password" name="pwd"></td>          
       </tr>
       <tr height="40">
          <td width="120">�̸���</td>
          <td width="180"><input type="text" name="email"></td>          
       </tr>
       <tr height="40">
          <td width="120">�ּ�</td>
          <td width="180"><input type="text" name="address"></td>          
       </tr>

             <tr height="40">
          <td width="120">��ȣ</td>
          <td width="180"><input type="text" name="phone"></td>          
       </tr>
         
       <tr height="40">
          <td align="center" colspan="2">
              <input type="submit" name="�α���">
          </td>          
       </tr>
   </table>
   </form>
   </center>

</body>
</html>