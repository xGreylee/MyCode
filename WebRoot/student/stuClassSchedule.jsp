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
		<h2>学生课表查询页面</h2>
		</br>
		<ul>
			<li><a href="selectStu?method=selectStuInfo">查询个人信息</a></li>
			<li></li>
			<li><a href="tostupwd?method=toRepwd">修改密码</a></li>
			<li></li>
			<li><a href="score?method=scoreQuery">查询成绩</a></li>
		</ul>
	</div>

	<div id="content">
		<center>
			<s:if test="#request.list.size()!=0">
				<table border="1" width="500px" height="100px">
					<tr>
						<td align="center">课程名</td>
						<td align="center">上课时间</td>
						<td align="center">上课地点</td>
					</tr>
					<s:iterator value="#request.list" id="course">
						<tr>
							<td height="40" align="center"><s:property value="cname" /></td>

							<td height="40" align="center"><s:property value="classtime" /></td>

							<td height="40" align="center"><s:property value="classroom" /></td>
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
