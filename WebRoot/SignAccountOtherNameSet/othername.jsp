<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/boot.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'othername.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<!-- 主页  -->
			</div>
		</div>
		<div class="col-md-15 column">
			<ul class="breadcrumb">
				<li><a href="#">账户别名设置</a></li>
				<li><a href="#">选择签约账户</a></li>
				<li class="active">别名设置</li>
				<li><a href="#">账户别名修改成功</a></li>
			</ul>
			<form action=AccountSignAction_setOtherName.action>
				请输入要设置的账户别名 <input id="othername" type="text" name="othername" />
				<button>下一步</button>
			</form>
		</div>
	</div>
</body>
</html>
