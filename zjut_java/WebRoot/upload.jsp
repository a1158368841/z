<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'upload.jsp' starting page</title>

</head>

<body>
<label>ppt</label>
<form action="upload.action" method="post" enctype="multipart/form-data">
	<input type="file" name="upload" />
	<input type="submit" value="上传" />
</form>

<hr/>
<label>excel</label>
<form action="uploadexcel.action" method="post" enctype="multipart/form-data">
	<input type="file" name="upload" />
	<input type="submit" value="upload" />
</form>
</body>
</html>
