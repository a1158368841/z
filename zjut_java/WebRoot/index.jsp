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
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="index_head">
		<div class="head_title">JAVA在线</div>
		<div  class="head_info"><a href="<%=path %>/login.jsp">登录</a>
     	 <a href="<%=path %>/regist.jsp">注册</a></div>
     	 <div class="head_info">欢迎你！<a href="<%=path %>/inner/user_view">${user.name}</a></div>
	</div>
<div class="container2">
	
	<div class="index_body">
    	<div class="index_body1">
        <div class="index_body1_img"><img src="/zjut_java/image/javaonline.jpg" width="477" height="115" /></div>
        <div class="index_body1_content">
        在《java在线》，你可以系统的学习java的相关知识，配合各种题型的训练将所有学的知识加以巩固，深入理解知识点。
        </div>
        </div>
        <div class="index_body2">
        	<div class="index_body2_content">
            	<div class="content_head"><a href="<%=path %>/outer/content_view">知识点</a></div>
                <div class="content">提供教学材料的下载</div>
            </div>
            <div class="index_body2_content">
            	<div class="content_head"><a href="<%=path %>/outer/download_view">PPT下载</a></div>
                <div class="content">提供教学材料的下载</div>
            </div>
            <div class="index_body2_content">
            	<div class="content_head"><a href="<%=path %>/outer/exam_view">测试</a></div>
                <div class="content">提供教学材料的下载</div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
