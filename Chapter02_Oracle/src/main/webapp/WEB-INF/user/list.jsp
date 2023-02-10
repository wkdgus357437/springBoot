<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
<img src="../img/img3.gif" width="50" height="50" onclick="location.href='/'" style="cursor: pointer"/>목록
</h2>
<hr/>
<table id="userListTable" border="1">
	<tr>
		<td width="150" align="center">이름</td>
		<td width="150" align="center">아이디</td>
		<td width="150" align="center">비밀번호</td>
	</tr>

<!-- 동적처리 -->

</table>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/list.js"></script>
</body>
</html>