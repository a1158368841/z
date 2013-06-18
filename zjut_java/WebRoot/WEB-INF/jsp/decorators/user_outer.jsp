<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="/struts-tags" prefix="s"  %>
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
<decorator:head />
</head>

<body>
<div class="index_head">
<div class="head_center">
		<div class="head_title">JAVA在线</div>
		<div  class="head_info"><a href="<%=path %>/login.jsp">登录</a>
     	 <a href="<%=path %>/regist.jsp">注册</a></div>
     	 <div class="head_info">欢迎你！<a href="<%=path %>/inner/user_view">${user.name}</a></div>
	</div>
	</div>
<div class="head"><img src="/zjut_java/image/javaonline.jpg" width="477" height="115" /></div>
<ul class="user_nav">
	<li><a href="<%=path %>/outer/exam_view"><span>测试</span></a></li>
    <li><a href="<%=path %>/outer/content_view"><span>知识点</span></a></li>
    <li><a href="<%=path %>/outer/download_view"><span>PPT下载</span></a></li>
</ul>
<s:if test="">
<dl class="left_menu">
		<!-- 知识点查看-->
        	<dd><span>语言基础</span></dd>
		    <dt><a href=""><span>结构化语言</span></a></dt>
		    <dt><a href=""><span>标识符</span></a></dt>
		    <dt><a href=""><span>运算符</span></a></dt>
		    <dt><a href=""><span>控制结构</span></a></dt>
		    <dt><a href=""><span>面向对象设计</span></a></dt>
		    <dd><span>Web应用</span></dd>
		    <dt><a href=""><span>结构化语言</span></a></dt>
		    <dt><a href=""><span>标识符</span></a></dt>
		    <dt><a href=""><span>运算符</span></a></dt>
		    <dt><a href=""><span>控制结构</span></a></dt>
		    <dt><a href=""><span>面向对象设计</span></a></dt>
		    <dd><span>主流框架</span></dd>
		    <dt><a href=""><span>结构化语言</span></a></dt>
		    <dt><a href=""><span>标识符</span></a></dt>
		    <dt><a href=""><span>运算符</span></a></dt>
		    <dt><a href=""><span>控制结构</span></a></dt>
		    <dt><a href=""><span>面向对象设计</span></a></dt>
		    <dd><span>项目实践</span></dd>
		    <dt><a href=""><span>结构化语言</span></a></dt>
		    <dt><a href=""><span>标识符</span></a></dt>
		    <dt><a href=""><span>运算符</span></a></dt>
		    <dt><a href=""><span>控制结构</span></a></dt>
		    <dt><a href=""><span>面向对象设计</span></a></dt>
		    </dl>
		    <div class="right_con">
        	<decorator:body />
        </div>
		 </s:if>
<s:if test=""> 
	<dl class="left_menu">
		    <!-- ppt下载 -->
		    <dd><span>PPT下载</span></dd>
		    <dt><a href=""><span>JAVA语言基础</span></a></dt>
		    <dt><a href=""><span>JAVA面向对象</span></a></dt>
		    <dt><a href=""><span>核心语言包</span></a></dt>
		    <dt><a href=""><span>异常 处理</span></a></dt>
	</dl>
	 <div class="right_con">
        	<decorator:body />
        </div>
</s:if>  

<!-- 测试 -->
<s:if test="">
 <div class="home_con">
        	<decorator:body />
        </div>
</s:if>
       
</div>

</body>
</html>