<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/boot.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>My JSP 'Successloss.jsp' starting page</title>

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
		<div class="row clearfix">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<ul class="breadcrumb">
						<li><a href="#">储蓄卡挂失</a></li>
						<li><a href="#">选择未挂失的储蓄卡</a></li>
						<li><a href="#">确认网银密码</a></li>
						<li class="active">挂失成功</li>
					</ul>
				</div>
			</div>
			<div class="col-md-12 column">
				<p>信用卡:${sessionScope.account}挂失成功。</p>
			</div>
		</div>
	</div>
</body>
</html>
