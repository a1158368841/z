<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <link href="css/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/ui/jquery.ui.core.js"></script>
<script type="text/javascript" src="js/ui/jquery.ui.widget.js"></script>
<script type="text/javascript" src="js/ui/jquery.ui.datepicker.js"></script>
  <script type="text/javascript" src="js/jquery.ui.datepicker-zh-CN.js"></script>
  <script type="text/javascript">
  	$(function(){
  	$.datepicker.setDefaults($.datepicker.regional['zh-CN']);
  		$("#birthday").datepicker({
  		changeMonth:true,
  		changeYear:true
  		
  		});
  		
  	
  	});
  	
  </script>

  </head>
  
  <body>
  <s:property value='#session.user.userId'/>
  <s:property value='#session.user.univId'/>
  <s:property value='#session.user.class_'/>
     <form action="update">
     	<input type="hidden" name="tbusers.userId" value="<s:property value='#session.user.userId'/>"/>
    	<label>学校编号：</label><input type="text" name="tbusers.univId" value="<s:property value='#session.user.univId'/>"><br/>
    	<label>生日：</label><input type="text" id="birthday" name="tbusers.birthday" value="<s:property value='#session.user.birthday'/>"><br/>
    	<label>学号：</label><input type="text" name="tbusers.studentId" value="<s:property value='#session.user.studentId'/>"><br/>
    	<label>姓名:</label><input type="text" name="tbusers.name" value="<s:property value='#session.user.name'/>"><br/>
    	<label>手机号码:</label><input type="text"  name="tbusers.cellPhone" value="<s:property value='#session.user.cellPhone'/>"><br/> 
    	<label>学校:</label><br>
    	<label>专业：</label><input type="text" name="tbusers.major" value="<s:property value='#session.user.major'/>"><br/>
    	<label>班级：</label><input type="text" name="tbusers.class_" value="<s:property value='#session.user.class_'/>"><br/>
    	<input type="submit" value="注册"/>
    </form>
  </body>
</html>
