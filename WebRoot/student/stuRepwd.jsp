<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
div#header {
	height: 25%;
	width: 100%;
	background-image: url("img/bgd3.jpg")
}

div#menu {
	height: 75%;
	width: 18%;
	float: buttom;
	background-image: url("img/bgd3.jpg");
	float: left;
	padding: 15px 20px 15px
}

div#content {
	height: 75%;
	width: 82%;
	float: right;
	background-image: url("img/bgd3.jpg");
	padding: 15px 20px 15px
}

h1 {
	margin-bottom: 50;
	margin-top: 50px;
	font-size: 40px;
	font-family: PMingLiU
}

h2 {
	margin-bottom: 0;
	font-size: 24px;
}

ul {
	margin: 0;
	font-size: 20dx
}

li {
	list-style: none;
}
</style>
</head>

<body>


	<div id="header">
		<h1 align=center>学生信息管理系统</h1>
	</div>

	<div id="menu">
		<h2>学生功能模块</h2>
		</br>
		<ul>
			<li><a href="selectStu?method=selectStuInfo">查询个人信息</a></li>
			<li></li>
			<li><a href="course?method=scheduleQuery">查询课表</a></li>
			<li></li>
			<li>查询成绩</li>
		</ul>
	</div>

	<div id="content">
		<center>
			<h2>欢迎进入学生信息管理系统</h2>
		</center>
	</div>


	<div id="content">
		<center>
			<s:form action="sturepwd?method=updpwd" method="post">
				<s:password name="pwd" id="pw1" lable="新密码" />
				<s:password name="pwd" id="pw2" lable="确认新密码"  onBlur="checkRepwd()"/><div id="tishi"></div>
				<s:submit value="保存"  theme="simple" />
				<s:reset value="取消" theme="simple" />
			</s:form>
		</center>
	</div>
	<script type="text/javascript">
		function checkRepwd() {
			var pw1 = document.getElementById("pw1").value;
			var pw2 = document.getElementById("pw2").value;
			if (pw1 == pw2) {
				document.innerHTML = "<font color='green'>两次密码相同</font>";
			} else {
				document.getElementById("tishi").innerHTML = "<font color='red'>两次密码不相同</font>";

			}
		}
	</script>




</body>
</html>
