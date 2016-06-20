<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

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
		<h2>学生信息查询页面</h2>
	</div>

	<div id="content">
		<center>
			<s:if test="(#request.selectResult.list).size()!=0">
				<table border="1" width="500px" height="100px">
					<tr>
						<td align="center">学生学号</td>
						<td align="center">学生姓名</td>
						<td align="center">学生密码</td>
						<td align="center">学生年龄</td>
						<td align="center">学生性别</td>
						<td align="center">学生学院</td>
						<td align="center">学生班级</td>
					</tr>
					<s:iterator value="#request.selectResult.list" id="student">
						<tr>
							<td height="40" align="center"><s:property value="sno" /></td>
							<td height="40" align="center"><s:property value="sname" /></td>
							<td height="40" align="center"><s:property value="pwd" /></td>
							<td height="40" align="center"><s:property value="age" /></td>
							<td height="40" align="center"><s:property value="sex" /></td>
							<td height="40" align="center"><s:property value="institudes" /></td>
							<td height="40" align="center"><s:property value="classes" /></td>
						</tr>
					</s:iterator>
					
				</table>
			</s:if>
			<s:else>
				暂无数据！！
			</s:else>
		</center>


	</div>





</body>
</html>
