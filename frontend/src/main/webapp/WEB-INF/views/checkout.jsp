<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${e}resources/css/try.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header.jsp" %>
<div class="login-page">
  <div class="form">
<form action="placeorder" method="post">
SHIPPING<br/>
 <input type="text" placeholder="name" name="s_name"/><br/>
 <input type="text" placeholder="mobile" name="s_mobile"/><br/>
  <input type="text" placeholder="houseno" name="s_houseno"/><br/>
      <input type="text" placeholder="city" name="s_city"/><br/>
      <input type="text" placeholder="state" name="s_state"/><br/>
      <input type="text" placeholder="pincode" name="s_pincode"/><br/>
      <br/><br/><br/>
      BILLING<br/>
<input type="text" placeholder="name" name="b_name"/><br/>
 <input type="text" placeholder="mobile" name="b_mobile"/><br/>
  <input type="text" placeholder="houseno" name="b_houseno"/><br/>
      <input type="text" placeholder="city" name="b_city"/><br/>
      <input type="text" placeholder="state" name="b_state"/><br/>
      <input type="text" placeholder="pincode" name="b_pincode"/><br/>
	Payment Mode : <input type="radio" name="paymode" value="Cash On Delivery"/> COD
	<input type="radio" name="paymode" value="Net Banking"/> Net Banking
	<input type="radio" name="paymode" value="Credit Card"/> Credit Card
<br/>	
<button type="submit">Place Order</button>

    </form>
  </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>