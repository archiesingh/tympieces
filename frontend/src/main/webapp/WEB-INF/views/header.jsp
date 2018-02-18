<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<c:url value="/" var="e"></c:url>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <a  href="${e}">
    <img src="${e}/resources/images/logoimage.jpeg" alt="Logoimage" >
    </a>
    <img src="${e}/resources/images/logo.PNG" alt="Logo" >
     </div>
    <ul class="nav navbar-nav">
<c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
<c:if test='<%=session.getAttribute("role").equals("admin")%>'>
    <li><a href="${e}adminhome">ADMIN HOME</a></li></c:if></c:if>
      <li class="active"><a href="${e}">Home</a></li>
<c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
          <li class="dropdown">
  <a style="cursor: pointer;" class="dropdown-toggle" type="button" data-toggle="dropdown">Categories
  <span class="caret"></span></a>
  <ul class="dropdown-menu">
    <c:forEach items='<%=session.getAttribute("categoryList")%>' var="cats">
          <li><a href="${e}productlist/${cats.c_id}">${cats.c_name}</a></li></c:forEach>
  </ul>
</li>
</c:if>


      </ul>
    <ul class="nav navbar-nav navbar-right">
<c:if test='<%=session.getAttribute("loggedIn")==null%>'>
      <li><a href="${e}register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="${e}login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
</c:if>		<c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
<c:if test='<%=(boolean)session.getAttribute("loggedIn")%>'>
<li><a href="${e}viewcart">CART</a></li>
<li><a href="${e}myorders">My Orders</a></li>
<li><a href="${e}perform_logout">Logout</a></li>
</c:if></c:if>
    </ul>
  </div>
</nav>
  



</body>
</html>