<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>题目查找</title>
<link href="css/admin_style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="library_container">
	<div>题库管理>>查找</div>
    <hr />
    <div><form action="querylibrary" method="post" >
    	题号<input type="text" name=""/>
    	章节<input type="text" name=""/>
    	题型<input type="text" name=""/>
    <input type="submit" value="查找"/></form></div>
   
    <table class="library_tb">
    	<tr>
        	<td height="20" width="10%">题号</td>
            <td width="20%">章节</td>
            <td width="20%">题型</td>
            <td width="40%">题目</td>
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