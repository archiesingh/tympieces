<!doctype>
<html>
<head>
<link href="${e}resources/css/try.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="${e}resources/javaScript/validationLogin.js"></script>
<%@include file="header.jsp" %>
<div class="login-page">
  <div class="form">
    <form class="login-form" action="${e}perform_login" method="post" onsubmit="return validationLogin()">
      <input type="text" placeholder="username" name="username"/>
      <input type="password" placeholder="password" name="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="${e}register">Create an account</a></p>
    </form>
  </div>
</div>
<%@include file="footer.jsp" %>
</head>
</html>