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
<title>Insert title here</title>
</head>
<body>
	用户名称为：${user.name }
	<br/>
	密  码：${user.password }
</body>
</html>