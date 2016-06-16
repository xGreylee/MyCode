<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<style type="text/css">
div#header {
	margin-top: 200px;
}

p {
	font-size: 30px;
	font-family: PMingLiU
}
</style>

</head>

<body background="img/bgd2.jpg">
	<div id="header">
		<p align=center>学生信息管理系统</p>
	</div>
	<center>
		<s:form action="/login" method="post">
			<s:textfield name="username" label="用户名" />
			<s:password name="pwd" label="密码" />
			<table>
				<tr>
					<td><input type="radio" name="flag" value="a">学生</td>
					<td><input type="radio" name="flag" value="b">教师</td>
					<td><input type="radio" name="flag" value="c">管理员</td>
				</tr>
				<tr>
					<td><s:submit value="登录" theme="simple"/></td>
					<td><s:reset value="取消" theme="simple" /></td>
				</tr>
			</table>

		</s:form>

	</center>



</body>
</html>
