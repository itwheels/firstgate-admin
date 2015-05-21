<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springside.org.cn/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>EDI接口供应商-店仓过滤规则管理</title>
</head>

<body>
	<form id="inputForm" action="${ctx}/admin/edioutlimit/${action}" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${ediOutlimit.id}"/>
		<fieldset>
			<legend><small>EDI接口供应商-店仓过滤规则管理</small></legend>
			<div class="control-group">
				<label class="control-label">接口类型:</label>
				<div class="controls">
					<form:select path="ediOutlimit.type">
						<form:option value="slsrpt">slsrpt</form:option>
						<form:option value="invrpt">invrpt</form:option>
					</form:select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">供应商:</label>
				<div class="controls">
					<form:select path="ediOutlimit.customerCode" items="${allCustomers}" itemLabel="description" itemValue="code" >
					</form:select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">店仓:</label>
				<div class="controls">
					<form:select path="ediOutlimit.storeCode" items="${stores}" itemLabel="name" itemValue="code">
					</form:select>
				</div>
			</div>			
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
	
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#name").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate();
		});
	</script>
</body>
</html>
