<!doctype>
<html>
<head>
<script src="${e}resources/javaScript/validationRegister.js"></script>
<link href="${e}resources/css/try.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@include file="header.jsp" %>
<style>
body  {
    background-image: url("resources/images/wallpaper.jpg");
}
</style>

<div class="login-page">
  <div class="form">
    <form class="login-form" action="addAllUsers" method="post" onsubmit="return validationRegister()">
      <input type="text" placeholder="username" name="username"/>
      <input type="text" placeholder="name" name="name"/>
      <input type="text" placeholder="email address" name="email"/>
     <input type="text" placeholder="Mobile number"name="phoneNo"/> 
     <input type="password" placeholder="password" name="password"/>
            
      <button>signup</button>
    </form>
  </div>
</div>
<%@include file="footer.jsp" %>
</head>
</html>