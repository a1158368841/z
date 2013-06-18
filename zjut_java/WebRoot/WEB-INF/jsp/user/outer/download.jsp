<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
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
<title>文档下载</title>
<link href="/zjut_java/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="d_con">
    	<table class="d_tb">
        	<tr>
            	<td width="300">第一章.zip</td>
                <td width="100"><a href="">download</a></td>
            </tr>
            <tr>
            	<td width="300">第二章.zip</td>
                <td width="100"><a href="">download</a></td>
            </tr>
        </table>
    </div>
</body>
</html>