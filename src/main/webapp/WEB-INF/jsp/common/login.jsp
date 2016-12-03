<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common/top.jsp" %>
<title>LOGIN</title>
<link type="text/css" href="${path}/resources/css/bootstrapTemplate/signin.css" rel="stylesheet">
</head>
  <body>
    <div class="container">
      <form class="form-signin" role="form" action="${path}/user/userLogin" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" placeholder="username" name="username" value="" required="" autofocus="">
        <input type="password" class="form-control" placeholder="Password" name="psw" value="" required="">
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
    </div> <!-- /container -->
</body></html>