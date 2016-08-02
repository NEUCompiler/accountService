<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/boot.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'showAccountInform.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.5/themes/icon.css">
<script type="text/javascript" src="jquery-easyui-1.4.5/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script >
function getdate(){
var d=$('#ddd').datebox('getValue');
var e=$('#ddb').datebox('getValue');
alert(d);
alert(e);
//ation="AccountInformationAction_searchDealInform.action"
}
</script>


</head>

<body>
	<table class= "table" >

		<tr>

			<th>类型</th>
			<th>卡号</th>
			<th>余额</th>
			<th>额度</th>
			<th>别名</th>
		<tr />
		<tr>

			<td>${request.cardType}</td>
			<td>${sessionScope.account.accountid}</td>
			<td>${sessionScope.account.amount}</td>
			<td>${sessionScope.account.cdlimit}</td>
			<td>${sessionScope.account.othername}</td>
		<tr />
	</table >
    <form action="AccountInformationAction_searchDealInform.action">
	<div style="margin:20px 0;"></div>
	开始日期<input id="ddda" name="ddda" class="easyui-datebox"></input>
	------结束日期<input id="dddb" name="dddb" class="easyui-datebox"></input>
	<input type="submit" value="查询"></input>
</form>
</body>	
</html>
