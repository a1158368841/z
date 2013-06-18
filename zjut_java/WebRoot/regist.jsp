<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户注册</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/jquery.ui.datepicker-zh-CN.js"></script>
<script type="text/javascript" src="js/jquery.ui.core.js"></script>
<script type="text/javascript" src="js/jquery.ui.widget.js"></script>
<script type="text/javascript" src="js/jquery.ui.datepicker.js"></script>
<script type="text/javascript" src="js/school.js"></script>
<script type="text/javascript">
	$(function() {
		$("#birthday").datepicker({
			changeYear:true,
			changeMonth: true,
			yearRange:'c-80:c+10'
		});
	});
</script>
</head>

<body>
	<div class="container">
		<div class="head2">
			<div class="head_img"></div>
		</div>&nbsp;&nbsp;  
		<br /><hr />
		<div class="regist_body">
			<div class="regist_head">
				<img src="image/j.jpg" width="60" height="80" />欢迎注册通行证
			</div>
			<br /> <br /> <br /> <br />
			<form action="user_regist" method="post">
              <dl class="regist_dl">
            	<dt class="regist_dt">用户名：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						name="tbusers.userId" value="candy">
                <s:fielderror fieldName="tbusers.userId" ></s:fielderror>
                </dd>
            </dl>
             <dl class="regist_dl">
            	<dt class="regist_dt">密码：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="password"
						name="tbusers.pwd" value="123123">
                <s:fielderror fieldName="tbusers.userId" ></s:fielderror>
                </dd>
            </dl>
             <dl class="regist_dl">
            	<dt class="regist_dt">密码确认：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="password"
						name="pwd2" value="123123">
           <s:fielderror fieldName="pwd2" ></s:fielderror>
                </dd>
            </dl>
            <dl class="regist_dl">
            	<dt class="regist_dt">姓名：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						name="tbusers.name" value="lj">
                </dd>
            </dl>
            <dl class="regist_dl">
            	<dt class="regist_dt">生日：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						id="birthday" name="tbusers.birthday">
          <s:fielderror fieldName="tbusers.birthday" ></s:fielderror>
                </dd>
            </dl>
             <dl class="regist_dl">
            	<dt class="regist_dt">手机号码：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						value="519904" name="tbusers.cellPhone">
                </dd>
            </dl>
             <dl class="regist_dl">
            	<dt class="regist_dt">邮箱：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						value="1001" name="tbusers.email">
                </dd>
            </dl>
			 <dl class="regist_dl">
            	<dt class="regist_dt">省：</dt>
                <dd class="regist_dd"><select id="province">
					<option value="">--请选择--</option>
					</select>
                </dd>
            </dl>
             <dl class="regist_dl">
            	<dt class="regist_dt">市：</dt>
                <dd class="regist_dd"><select id="city" name="city">
					<option value="">--请选择--</option>
					</select>
                </dd>
            </dl>
             <dl class="regist_dl">
            	<dt class="regist_dt">学校：</dt>
                <dd class="regist_dd"><select id="univ">
					<option value="">--请选择--</option>
					</select>
                </dd>
            </dl>
			 <dl class="regist_dl">
            	<dt class="regist_dt">专业：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						value="technonogy economic" name="tbusers.major">
                </dd>
            </dl>
             <dl class="regist_dl">
            	<dt class="regist_dt">班级：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						value="1001" name="tbusers.class_">
                </dd>
            </dl>	
			 <dl class="regist_dl">
            	<dt class="regist_dt">学号：</dt>
                <dd class="regist_dd"><input class="regist_ipt" type="text"
						value="1001" name="tbusers.studentId">
                </dd>
            </dl>
            <input type="hidden" value="0" name="tnusers.userType"/>
				<br /> <br />
				<br />
				<div class="regist_input_bt">
					<input class="regist_bt" type="submit" value="立刻注册" />
				</div>
                </form>
		</div>
		
	</div>
</body>
</html>

