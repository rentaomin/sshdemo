<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<!DOCTYPE html>  
<%@ page session="true"%>  
<html lang="zh">  
<head>  
<meta charset="utf-8">  
</head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basePath",basePath);
%>

<c:set var="proPath" value="${pageContext.request.contextPath}" /> 
<c:set var="basePath" value="${basePath}" />
<body>
<h2>Hello World!</h2>
	<a href = "${basePath }/hello/save">保存</a>
</body>
</html>
