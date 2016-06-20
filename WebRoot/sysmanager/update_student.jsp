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
		<h2>更新学生页面</h2>
	</div>

	<div id="content">
		<center>
			<table>
				<s:form action="manageStu?method=updatestu" method="post" var="student">
					<tr>
						<td><s:textfield name="student.sno" label="学生学号"  value="%{student.sno}"></s:textfield></td>
					</tr>
					<tr>
						<td><s:textfield name="student.pwd" label="学生密码"></s:textfield></td>
					</tr>
					<tr>
						<td><s:textfield name="student.sname" label="学生姓名"  value="%{student.sname}"></s:textfield></td>
					</tr>
					<tr>
						<td><s:textfield name="student.age" label="学生年龄" value="%{student.age}"></s:textfield></td>
					</tr>
					<tr>
						<td><s:textfield name="student.sex" label="学生性别" value="%{student.sex}"></s:textfield></td>
					</tr>
					<tr>
						<td><s:textfield name="student.institudes" label="学生学院" value="%{student.institudes}"></s:textfield></td>
					</tr>
					<tr>
						<td><s:textfield name="student.classes" label="学生专业班级" value="%{student.classes}"></s:textfield></td>
					</tr>
					<tr>
						<td><s:submit value="确定更新" theme="simple"></s:submit></td>
						<td><s:reset value="重置" theme="simple"></s:reset></td>
					</tr>
				</s:form>
			</table>
		</center>
	</div>





</body>
</html>
