<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common/top.jsp" %>
<title>HOME</title>
</head>
<body>
	<div class="container">
		<h1>${user.username} welcome!</h1>
		<h2>当前登录人数为：${onlineAmount}人</h2>
	</div>
	<!-- /container -->
</body>
</html>