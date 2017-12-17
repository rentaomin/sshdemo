<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="org.springframework.util.StringUtils"%>
<%@page import="org.springframework.web.util.WebUtils"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!doctype html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Hello Amaze UI</title>
  <!-- Set render engine for 360 browser -->
  <meta name="renderer" content="webkit">
  <!-- No Baidu Siteapp-->
  <meta http-equiv="Cache-Control" content="no-siteapp"/>

  <link rel="icon" type="image/png" href="${ctx}/ui/i/favicon.png">

  <!-- Add to homescreen for Chrome on Android -->
  <meta name="mobile-web-app-capable" content="yes">
  <link rel="icon" sizes="192x192" href="${ctx}/ui/i/app-icon72x72@2x.png">

  <!-- Add to homescreen for Safari on iOS -->
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
  <link rel="apple-touch-icon-precomposed" href="${ctx}/ui/i/app-icon72x72@2x.png">

  <!-- Tile icon for Win8 (144x144 + tile color) -->
  <meta name="msapplication-TileImage" content="${ctx}/ui/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileColor" content="#0e90d2">

  <link rel="stylesheet" href="${ctx}/ui/css/amazeui.min.css">
  <link rel="stylesheet" href="${ctx}/ui/css/app.css">
</head>
<script src="${ctx}/js/jquery/jquery.min.js"/>
<script src="${ctx}/ui/js/amazeui.min.js"></script>
<script type="text/javascript">
function save() {
	var username = $("#name").val();
	var password = $("#password").val();
	if (username == null || username == "" || username == undefined) {
		alert("用户名不能为空");
		return;
	}
	if (password == null || password == "" || password == undefined) {
		alert("密码不能为空");
		return;
	}
	$.ajax({
		  type: 'POST',
		  url: "${ctx}/user/saveUser",
		  data: $("#userForm").serialize(),
		  success: function(data){
			location.href="${ctx}/user/index?name="+data.name;
		  }
		});
}
</script>
<body data-type="login">
    <script src="${ctx}/ui/js/theme.js"></script>
    <div class="am-g tpl-g">
        <!-- 风格切换 -->
        <div class="tpl-skiner">
            <div class="tpl-skiner-toggle am-icon-cog">
            </div>
            <div class="tpl-skiner-content">
                <div class="tpl-skiner-content-title">选择主题</div>
                <div class="tpl-skiner-content-bar">
                    <span class="skiner-color skiner-white" data-color="theme-white"></span>
                    <span class="skiner-color skiner-black" data-color="theme-black"></span>
                </div>
            </div>
        </div>
        <div class="tpl-login">
            <div class="tpl-login-content">
                <div class="tpl-login-logo">
                </div>
                <form id ="userForm" class="am-form tpl-form-line-form">
                    <div class="am-form-group">
                        <input type="text" class="tpl-form-input" id="name" name="name" placeholder="请输入用户名">
                    </div>
                    <div class="am-form-group">
                        <input type="password" class="tpl-form-input" id="password" name="password" placeholder="请输入密码">
                    </div>
                    <div class="am-form-group tpl-login-remember-me">
                        <input id="remember-me" type="checkbox">
                        <label for="remember-me">记住密码
                    </div>
                    <div>
                    	<a id= "index" href="${ctx}/user/index" >跳转首页</a>
                    </div>
                    <div class="am-form-group">
                        <button type="button" id="button" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn" onclick="save();">登陆</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
