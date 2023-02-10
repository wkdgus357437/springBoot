<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#updateForm div{
	color: red;
	font-size:  8pt;
	font-weight: bold;
	
}

</style>
</head>
<body>
<h2>
<img src="../img/img3.gif" width="50" height="50" onclick="location.href='/'" style="cursor: pointer"/>회원정보수정
</h2>
<hr/>
<p>
	수정할 아이디 입력 <input type="text" id="searchId" placeholder="수정할 아이디 검색">
	<input type="button" id="searchIdBtn" value="검색">
</p>
<div id="resultDiv"></div>

<div id="updateDiv">
<form id="updateForm">
	<table border="1" cellpadding="5" cellspacing="0">
		<tr>
			<th width="80px" align="center">이름</th>
			<td>
				<input type="text" name="name" id="name">
				<div id="nameDiv"></div>
			</td>
		</tr>
		<tr>
			<th align="center">아이디</th>
			<td>
			 	<input type="text" name="id" id="id" size="30" readonly="readonly">
			</td>
		</tr>
		<tr>
			<th align="center">비밀번호</th>
			<td>
				<input type="password" name="pwd" id="pwd" size="40">
				<div id="pwdDiv"></div>
			</td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="button" id="updateBtn" value="저장">
				<button type="reset" id="resetBtn">취소</button>
			</th>
		</tr>	
	</table>
</form>
</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/update.js"></script>

</body>
</html>