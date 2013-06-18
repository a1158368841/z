<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
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
<title>无标题文档</title>
<link href="/zjut_java/css/style.css" rel="stylesheet" type="text/css" />

</head>

<body>
<div class="index_head">
		<div class="head_title"><a href="<%=path %>/index.jsp">JAVA在线</a></div>
		<div  class="head_info"><a href="<%=path %>/login.jsp">登录</a>
     	 <a href="<%=path %>/regist.jsp">注册</a></div>
     	 <div class="head_info">欢迎你！<a href="<%=path %>/inner/user_view">${user.name}</a></div>
	</div>
<div class="head"><img src="/zjut_java/image/javaonline.jpg" width="477" height="115" /></div>
<ul class="user_nav">
	<li><a href="<%=path %>/outer/exam_view"><span>测试</span></a></li>
    <li><a href="<%=path %>/outer/content_view"><span>知识点</span></a></li>
    <li><a href="<%=path %>/outer/download_view"><span>PPT下载</span></a></li>
</ul>

</body>
</html>