<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户修改</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body>
    <div class="userupdate_form">
    账号管理>>信息修改<hr/>
    <form action="user_update" method="post">
<dl class="userupdate_dl">
	<dt class="userupdate_dt">姓名：</dt>
    <dd class="userupdate_dd"><input type="text" name="tbusers.name" value="${user.name }"/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">生日：</dt>
    <dd class="userupdate_dd"><input type="text" name="tbusers.birthday" value="${user.birthday }"/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">手机号码：</dt>
    <dd class="userupdate_dd"><input type="text" name="tbusers.cellPhone" value="${user.cellPhone }"/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">邮箱：</dt>
    <dd class="userupdate_dd"><input type="text" name="tbusers.email" value="${user.email }"/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">省：</dt>
    <dd class="userupdate_dd"><input type="text" name=""/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">市：</dt>
    <dd class="userupdate_dd"><input type="text" name=""/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">学校：</dt>
    <dd class="userupdate_dd"><input type="text" name=""/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">专业：</dt>
    <dd class="userupdate_dd"><input type="text" name="tbusers.major" value="${user.major }"/></dd>
</dl>
<dl class="userupdate_dl">
	<dt class="userupdate_dt">班级：</dt>
    <dd class="userupdate_dd"><input type="text" name="tbusers.class_" value="${user.class_ }"/></dd>
</dl>
<br /><br />
 <div align="center">
    <input class="normal_bt" type="submit" value="修改"/></div>
</form>
</div>
</body>
</html>