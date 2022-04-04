<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 탈퇴</title>
</head>
<body>
<h3> 회원 탈퇴하려면 비밀번호를 입력해주세요</h3>
<form method="post" onsubmit="checkVal()" action="delete">
	
	<table><tr><td>password</td>
	<td><input type="password" name="formpw" id="password"></td></tr>
	<tr><td colspan="2"><input type="submit" value="탈퇴" ></td></tr>
	</table>
</form>
<script>
	function checkVal(){
		let pw = document.querySelector("#password").value;
		if(!pw){
			alert("비밀번호 입력하세요");
			return false;
		}
	}

</script>

</body>
</html>
