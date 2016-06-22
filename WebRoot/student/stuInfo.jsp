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
		<h2>个人信息表查询页面</h2>
		</br>
		<ul>
			<li><a href="tostupwd?method=toRepwd">修改密码</a></li>
			<li></li>
			<li><a href="course?method=scheduleQuery">查询课表</a></li>
			<li></li>
			<li><a href="score?method=scoreQuery">查询成绩</a></li>
		</ul>
	</div>

	<div id="content">
		<center>
			<s:if test="#request.stulist.size()!=0">
				<table>
					<s:iterator value="#request.stulist" var="student">
						<tr>
							<td height="20">学生学号：</td>
							<td height="20"><s:property value="#student.sno"/></td>
						</tr>
						<tr>
							<td height="20">学生姓名：</td>
							<td height="20"><s:property value="#student.sname"/></td>
						</tr>
						<tr>
							<td height="20">学生密码：</td>
							<td height="20"><s:property value="#student.pwd"/></td>
						</tr>
						<tr>
							<td height="20">学生年龄：</td>
							<td height="20"><s:property value="#student.age"/></td>
						</tr>
						<tr>
							<td height="20">学生性别：</div></td>
							<td height="20"><s:property value="#student.sex"/></td>
						</tr>
						<tr>
							<td height="20">学生学院：</td>
							<td height="20"><s:property value="#student.institudes"/></td>
						</tr>
						<tr>
							<td height="20">学生班级：</div></td>
							<td height="20"><s:property value="#student.classes"/></td>
						</tr>
					</s:iterator>
				</table>
			
			</s:if>
			
			<s:else>
				暂无数据！
			</s:else>
		</center>


	</div>





</body>
</html>
