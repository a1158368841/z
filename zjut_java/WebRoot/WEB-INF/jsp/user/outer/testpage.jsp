<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>测试</title>
<link href="/zjut_java/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="test_con">
<form action="" method="post">
	<div class="test_left">
   	  <div class="test_title"><div class="title1"><span class="t1">Java模拟卷</span></div>
      <br />
       <div class="title2"> <span class="t2">试卷类型：综合题(共27题)  试卷分数：100分  考试时间：90分钟</span></div>
        </div>
        <br />
        <!--显示题目 -->
        <div class="test_body">
        	<!-- 锚点-->
     		<a name="qt1"></a>
        	<div class="q1">
            <!--题目内容 -->
            	<p class="qcontent">
            1.关于异常下列说法正确的是（）
            <br />
A 异常是一种对象
B 一旦程序运行，异常将会创建
C 为了保证程序运行速度，要尽量避免异常控制
D 以上说法都不对</p>
				<!-- 题目答案-->
				<div class="qanswer">
                <span>你的答案是:：<input type="checkbox"/>A&nbsp;<input type="checkbox"/>B&nbsp;<input type="checkbox"/>C&nbsp;<input type="checkbox"/>D</span>
                </div>
            </div><!--end of q1  -->
            
            <!-- 锚点-->
     		<a name="qt2"></a>
        	<div class="q1">
            <!--题目内容 -->
            	<p class="qcontent">
            2.关于异常下列说法正确的是（）
            <br />
A 异常是一种对象
B 一旦程序运行，异常将会创建
C 为了保证程序运行速度，要尽量避免异常控制
D 以上说法都不对</p>
				<!-- 题目答案-->
				<div class="qanswer">
                <span>你的答案是:：<input type="checkbox"/>A&nbsp;<input type="checkbox"/>B&nbsp;<input type="checkbox"/>C&nbsp;<input type="checkbox"/>D</span>
                </div>
            </div><!--end of q1  -->
            
            <!-- 锚点-->
     		<a name="qt3"></a>
        	<div class="q1">
            <!--题目内容 -->
            	<p class="qcontent">
           3.关于异常下列说法正确的是（）
            <br />
A 异常是一种对象
B 一旦程序运行，异常将会创建
C 为了保证程序运行速度，要尽量避免异常控制
D 以上说法都不对</p>
				<!-- 题目答案-->
				<div class="qanswer">
                <span>你的答案是:：<input type="checkbox"/>A&nbsp;<input type="checkbox"/>B&nbsp;<input type="checkbox"/>C&nbsp;<input type="checkbox"/>D</span>
                </div>
            </div><!--end of q1  -->
        </div>
        <input type="button" value="做好了，我要交卷！" />
    </div>
    <div class="test_right">
    	<div class="counttime" id="showtime">
        
        
        </div>
        <div class="qnum">
        <span>题目序号</span><br />
        <table width="200">
        	<tr>
            <!--利用锚点进行跳转 -->
        		<td><a href="#qt1">1</a></td><td><a href="#qt2">2</a></td><td><a href="#qt3">3</a></td>
        	</tr>
        </table>
        </div>
        <div align="center">
        <input type="button" value="我要提交" />
        <input type="button" value="重新考试" />
        </div>
    </div>
    </form>
</div>
</body>
</html>