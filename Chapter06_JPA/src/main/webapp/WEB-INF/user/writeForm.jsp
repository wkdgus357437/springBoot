<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#writeForm div{
	color: red;
	font-size:  8pt;
	font-weight: bold;
	
}

</style>
</head>
<body>
<h2>
<img src="../img/img3.gif" width="50" height="50" onclick="location.href='/'" style="cursor: pointer"/>회원가입
</h2>
<hr/>
<form id="writeForm">
   <table border="1" cellpadding="5" cellspacing="0">
      <tr>
         <td width="100" align="center">이름</td>
         <td>
            <input type="text" name="name" id="name">
            <div id="nameDiv"></div>
         </td>
      </tr>
      
      <tr>
         <td align="center">아이디</td>
         <td>
            <input type="text" name="id" id="id">
            <div id="idDiv"></div>
         </td>
      </tr>
      
      <tr>
         <td align="center">비밀번호</td>
         <td>
            <input type="password" name="pwd" id="pwd">
             <div id="pwdDiv"></div>
         </td>
      </tr>
      <tr>
         <td colspan="2" align="center">
            <input type="button" value="등록" id="writeBtn">
               <input type="reset" value="취소">
        	</td>
      </tr>
   </table>
   
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/write.js"></script>

</body>
</html>
