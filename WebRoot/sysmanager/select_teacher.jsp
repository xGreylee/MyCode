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
		<h2>查询学生页面</h2>
	</div>

	<div id="content">
		<h3>请输入要查询的教师工号：</h3>
		<center>
			<table>
				<s:form action="manageTcr?method=selecttcr" method="post" var="teacher">
					<tr>
						<td><s:textfield name="teacher.tno" label="教师工号" value="" ></s:textfield></td>
					</tr>
					
					<tr>
						<td><s:submit value="查询" theme="simple"></s:submit></td>
						<td><s:reset value="重置" theme="simple"></s:reset></td>
					</tr>
				</s:form>
			</table>
		</center>
	</div>





</body>
</html>
