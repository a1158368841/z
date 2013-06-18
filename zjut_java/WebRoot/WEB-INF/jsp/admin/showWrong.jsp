<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/admin_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/highcharts.js"></script>
<script type="text/javascript" src="js/modules/exporting.js"></script>
</head>

<body>

    <table class="library_tb">
    	<tr>
        	<td height="20" width="10%">题号</td>
            <td width="20%">章节</td>
            <td width="10%">题型</td>
            <td width="30%">题目</td>
            <td width="10%">错误次数</td>
            <td width="10%">错误率</td>
            <td width="10%">详情</td>
        </tr>
        <s:iterator value="#request.tb" var="question"></s:iterator>
        <tr>
        	<td><s:property value="#question.questionid" /> </td>
            <td><s:property value="#question.questionsection" /></td>
            <td><s:property value="#question.questionType" /></td>
            <td><s:property value="#question.question" /></td>
            <td><s:property value="#question.wrongnum" /></td>
            <td><s:property value="#question.wrong" /></td>
            <td>>></td>
        </tr>
    </table>

</body>
</html>