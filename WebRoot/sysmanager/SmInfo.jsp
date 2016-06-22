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
		<h2>管理员信息页面</h2>
		</br>
		<ul>
			<li><a href="tosmpwd?method=toRepwd">修改密码</a></li>
			<li></li>
			<li><a href="manager?method=stumanage">管理学生信息</a></li>
			<li></li>
			<li><a href="manager?method=tcrmanage">管理教师信息</a></li>
		</ul>
	</div>

	<div id="content">
		<center>
			<s:if test="#request.smlist.size()!=0">
				<table>
					<s:iterator value="#request.smlist" var="manager">
						<tr>
							<td height="20">管理员工号：</td>
							<td height="20"><s:property value="#manager.id"/></td>
						</tr>
						<tr>
							<td height="20">管理员密码：</td>
							<td height="20"><s:property value="#manager.pwd"/></td>
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
