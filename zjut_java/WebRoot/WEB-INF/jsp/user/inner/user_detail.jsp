<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人信息</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
    <div class="userupdate_form">
    账号管理>>个人信息<hr />
<dl class="userupdate_dl">
	<dt class="userupdate_dt">姓名：</dt>
    <dd class="userupdate_dd">${user.name }</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">生日：</dt>
    <dd class="userupdate_dd">${user.birthday }</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">手机号码：</dt>
    <dd class="userupdate_dd">${user.cellPhone }</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">邮箱：</dt>
    <dd class="userupdate_dd">${email }</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">省：</dt>
    <dd class="userupdate_dd">&nbsp;</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">市：</dt>
    <dd class="userupdate_dd">&nbsp;</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">学校：</dt>
    <dd class="userupdate_dd">&nbsp;</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">专业：</dt>
    <dd class="userupdate_dd">${user.major }</dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">班级：</dt>
    <dd class="userupdate_dd">${user.class_ }</dd>
</dl>
<br /><br />

</div>


</body>
</html>