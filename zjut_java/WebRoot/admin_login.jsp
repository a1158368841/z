<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="container">
	<div class="head">
    	<div class="head_img"></div>
    </div>
    <hr />
    <div class="login_body">
    <div class="login_img"></div>
<div class="login_form">
    <br />
   	<div class="login_form_head"> 用户登录</div>
    <form action="<%=path %>/admin_login" method="post">
    <dl class="login_form_dl">
    	<dt class="login_form_dt">用户名:</dt>
        <dd class="login_form_dd"><input class="login_ipt" type="text" name="tbusers.userId"/>
        <s:fielderror fieldName="tbusers.userId"></s:fielderror>
        </dd>
        </dl>
    
    <dl class="login_form_dl">
    	<dt class="login_form_dt">密&nbsp;码:</dt>
        <dd class="login_form_dd"><input class="login_ipt" type="password" name="tbusers.pwd"/>
         <s:fielderror fieldName="tbusers.pwd"></s:fielderror>
        </dd>
        </dl>
    	
       <dl class="login_form_dl">
    	<dt class="login_form_dt">验证码:</dt>
        <dd class="login_form_dd"><input type="text" class="login_yzm" name="vercode" /> &nbsp; &nbsp;<img src="image.jsp" />
         <s:fielderror fieldName="vercode"></s:fielderror>
        </dd>
        </dl>
    
       <br />
       	<p><s:actionmessage/></p>
       <br />
       <div class="login_form_bt"><input class="login_bt" type="submit" value="登录"/>
       		<input class="login_bt" type="button" value="注册"/>
       </div>
	   </form>
    </div>
    </div>
</div>
</body>
</html>
