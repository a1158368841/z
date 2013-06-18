<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改密码</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />

<style type="text/css">
.al {
	width: 200px;
	margin-right: auto;
	margin-left: auto;
	height: 60px;
	padding-top: 20px;
}
.changepwd_form {
	width: 400px;
	height: 300px;
}
</style>
<script type="text/javascript">
function changepwd(){
	var form = document.getElementById("cp");
	form.submit();
}
</script>
</head>

<body>

    <div class="changepwd_form">
       账号管理>>修改密码<hr/>
<form id="cp" action="user_changepwd" method="post">
<dl class="changepwd_dl">
	<dt class="changepwd_dt">现在的密码：</dt>
    <dd class="changepwd_dd"><input type="password" name="oldpwd" /></dd>
</dl>
<dl class="changepwd_dl">
	<dt class="changepwd_dt">设置的新密码：</dt>
    <dd class="changepwd_dd"><input type="password" name="newpwd" /><br />
    6-16位，区分大小写，只能使用字母、数字、特殊字符
    </dd>
</dl>
<dl class="changepwd_dl">
	<dt class="changepwd_dt">重复的新密码：</dt>
    <dd class="changepwd_dd"><input type="password" name="newpwd2" /></dd>
</dl>
<div class="al">
<div class="buttons">
<a href="javascript:changepwd()" class="regular"><!-- class="regular"-->
        <img src="image/textfield_key.png" alt=""/> 
        Change Password
    </a>
</div>
</div>
<s:actionmessage />
</form>
</div>
</body>
</html>
