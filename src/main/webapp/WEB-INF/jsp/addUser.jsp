<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=path %></h1>	<!-- /ssm-demo 项目相对路径，与webapp同级 -->
	<hr>
	<h1><%=basePath %></h1>	<!-- tomcat: http://localhost:8084/ssm-demo/ 访问的绝对路径 -->
</body>
</html>