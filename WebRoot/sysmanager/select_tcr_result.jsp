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
		<h2>教师信息查询结果页面</h2>
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
			<s:if test="#request.selectTcrResultsize!=0">
				<table border="1" width="600px" height="100px">
					<tr>
						<td align="center">教师工号</td>
						<td align="center">教师姓名</td>
						<td align="center">教师密码</td>
						<td align="center">教师年龄</td>
						<td align="center">教师学院</td>
					</tr>
					<s:iterator value="#request.selectTcrResult" id="teacher">
						<tr>
							<td height="40" align="center"><s:property value="tno" /></td>
							<td height="40" align="center"><s:property value="tname" /></td>
							<td height="40" align="center"><s:property value="pwd" /></td>
							<td height="40" align="center"><s:property value="age" /></td>				
							<td height="40" align="center"><s:property value="institude" /></td>
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
