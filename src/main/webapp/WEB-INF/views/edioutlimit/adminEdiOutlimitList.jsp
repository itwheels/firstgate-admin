<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>EDI接口供应商-店仓过滤规则管理</title>
</head>

<body>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>接口类型</th><th>供应商编码</th><th>店仓编码</th><th>管理</th></tr></thead>
		<tbody>
		<c:forEach items="${ediOutlimits}" var="ediOutlimit">
			<tr>
				<td>${ediOutlimit.type}</td>
				<td>${ediOutlimit.customerCode}</td>
				<td>${ediOutlimit.storeCode}</td>
				<td><a href="${ctx}/admin/edioutlimit/update/${ediOutlimit.id}">修改</a></td>
				<td><a href="${ctx}/admin/edioutlimit/delete/${ediOutlimit.id}">删除</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div><a class="btn" href="${ctx}/admin/edioutlimit/create">创建规则</a></div>
</body>
</html>
