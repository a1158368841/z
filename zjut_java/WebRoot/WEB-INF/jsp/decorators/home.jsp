<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台</title>

<link href="/zjut_java/css/admin_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/statistics.js"></script>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/highcharts.js"></script>
<script type="text/javascript" src="js/modules/exporting.js"></script>
<decorator:head />
</head>

<body>
<div class="container">
<div class="admin_head">
    	<div class="head_img"><img src="/zjut_java/image/admin_head.gif" width="400" height="120" /></div>
       
    </div>
    <br />

	<div class="left_bar">
	<dl class="left_menu">
    	<dt>数据统计</dt>
    	<dd><a href="javascript:draw5()"><span>易错题排行（错误量）</span></a></dd>
        <dd><a href="javascript:draw6()"><span>易错题排行（错误率）</span></a></dd>
        <dd><a href="javascript:draw1()"><span>模块各时段点击率</span></a></dd>
        <dd><a href="javascript:draw2()"><span>模块总点击率</span></a></dd>
        <dd><a href="javascript:draw7()"><span>用时分布</span></a></dd>
        <dt>题库管理</dt>
        <dd><a href=""><span>查找</span></a></dd>
        <dd><a href=""><span>添加</span></a></dd>
         <dt>学校管理</dt>
        <dd><a href="university_viewFind"><span>查找</span></a></dd>
        <dd><a href="university_viewUpdate"><span>添加</span></a></dd>
         <dt>用户管理</dt>
        <dd><a href=""><span>查找</span></a></dd>
        <dd><a href=""><span>添加</span></a></dd>
         <dt>下载管理</dt>
        <dd><a href=""><span>查找</span></a></dd>
        <dd><a href=""><span>添加</span></a></dd>
    </dl>
    </div>
  <div class="right_content">
  <decorator:body />
</div>
</body>
</html>
