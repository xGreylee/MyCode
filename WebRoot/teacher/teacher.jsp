<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


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
		<h2>教师功能模块</h2>
		</br>
		<ul>
			<li><a href="selectTcr?method=selectTcrInfo">查询个人信息</a></li>
			<li></li>
			<li><a href="totcrpwd?method=toRepwd">修改密码</a></li>
			<li></li>
			<li><a href="course?method=tcrScheduleQuery">查询课表</a></li>
			<li></li>
			<li>录入成绩</li>
		</ul>
	</div>

	<div id="content">
		<center>
			<h2>欢迎进入学生信息管理系统</h2>
		</center>
	</div>





</body>
</html>
