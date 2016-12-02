<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//路径：.../ssm-demo,等价于webapp文件夹
	String path = request.getContextPath();
	//路径：http://localhost:port/projectName/,项目绝对路径
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="path" scope="request" value="<%=path %>" />
<c:set var="basePath" scope="request" value="<%=basePath %>" />
<!DOCTYPE html>
<html>
<head>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link type="text/css" href="${path}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${path}/resources/js/jquery/jquery-3.1.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${path}/resources/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
