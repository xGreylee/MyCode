<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
		function checkRepwd() {
			var psw1 = document.getElementById("pw1").value;
			var psw2 = document.getElementById("pw2").value;
			var tishi = document.getElementById("tishi");
			
			if (psw1 == psw2) {
			 	return true;
			} else {
				alert( "两次输入密码不相同") ;
				return  false;
			}
		}
	</script>
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
		<h2>管理员修改密码页面</h2>
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
			<table>
				<s:form action="smrepwd?method=updatesmpwd" method="post"  onsubmit="return checkRepwd()" >
					<tr>
						<s:hidden name="manager.id"></s:hidden>
						<td><s:password name="pwd" label="新密码" id="pw1" /></td>
					</tr>
					<tr></tr>
					<tr>
						<td><s:password name="newpwd" label="确认新密码" id="pw2" /></td> 
					</tr>
					<tr>
						<td><s:submit value="保存" theme="simple" /></td>
						<td><s:reset value="取消" theme="simple" /></td>
					</tr>
				</s:form>
			</table>
		</center>
	</div>

	




</body>
</html>
