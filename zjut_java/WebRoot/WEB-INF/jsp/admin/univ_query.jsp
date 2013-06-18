<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/admin_style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="library_container">
	<div>学校管理>>查找</div>
    <hr />
    <div><form action="university_findByExample" method="post" >
    编号：<input type="text" name="tbuniversity.univId" />省:<input type="text" name="tbuniversity.province" />市：<input type="text" name="tbuniversity.city" />
    <input type="submit" value="查找"/></form></div>
   
    <table class="library_tb">
    	<tr>
        	<td height="20" width="10%">编号</td>
            <td width="30%">学校名称</td>
            <td width="40%">地址</td>
            <td width="10%">电话</td>
            <td width="10%">详情</td>
        </tr>
        <s:iterator var="u" value="#request.list">
        <tr>
        	<td><s:property value="#u.univId"/> </td>
            <td><s:property value="#u.univName"/></td>
            <td><s:property value="#u.address"/></td>
            <td><s:property value="#u.telephone"/></td>
            <td><a href="">>></a></td>
        </tr>
        </s:iterator>
    </table>
   
</div></body>
</html>