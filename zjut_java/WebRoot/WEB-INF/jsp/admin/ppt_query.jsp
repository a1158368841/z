<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/admin_style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="library_container">
	<div>PPT管理>>查找</div>
    <hr />
    <div><form action="querylibrary" method="post" ><input type="submit" value="查找所有"/></form></div>
   
    <table class="library_tb">
    	<tr>
        	<td height="20" width="10%">编号</td>
            <td width="40%">名称</td>
            <td width="20%">下载次数</td>
            <td width="10%">上传者</td>
            <td width="10%">详情</td>
        </tr>
        <tr>
        	<td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>>></td>
        </tr>
    </table>
   
</div>
</body>
</html>