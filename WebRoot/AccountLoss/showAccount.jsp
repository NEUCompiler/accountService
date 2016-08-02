<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/boot.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>储蓄卡挂失</title>

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
			<div class="col-md-15 column">
				<!-- 主页  -->
			</div>
		</div>
		<div class="col-md-15 column">
			<ul class="breadcrumb">
				<li><a href="#">储蓄卡挂失</a></li>
				<li class="active">选择未挂失的储蓄卡</li>
				<li><a href="#">确认网银密码</a></li>
				<li><a href="#">挂失成功</a></li>
			</ul>
			<form action="AccountLossAction_selectCard.action" id="form">
				<select name="selectAccount" class="form-control">
					<c:forEach items="${request.accountIdList}" var="li">
						<option value=${li}>${li}</option>
					</c:forEach>
					<option>${li}</option>
				</select>
			</form>
			<a class="btn btn-default" href="index.jsp" role="button">上一步</a>  &nbsp; &nbsp; <input
				type="button" class="btn btn-default" value="下一步"
				onclick="document.getElementById('form').submit();" /></br>
			注意：此操作仅相当于临时挂失，有效期为5天，正式挂失请到开户行或拨打客服电话进行办理。
		</div>
	</div>
</body>
</html>