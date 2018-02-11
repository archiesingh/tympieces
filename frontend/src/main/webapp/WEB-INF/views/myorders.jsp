<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="row">
<c:forEach items="${orderlist}" var="order_item">
<div class="container" style="box-shadow: 5px 2px 5px 5px grey">
<div class="col-sm-4">
 <div class="thumbnail"  style="height:400px">
      <a href="${e}productdetails/${pro.p_id}" target="_blank"></a>
<img src="${e}resources/images/${order_item.pro.p_id}.jpg" alt="buildings"  style="height:400px">
<div class="caption">
</div>
</div>
</div>
    <div class="col-sm-8" >
    
<h2><b>${order_item.pro.p_name}</b></h2>
<hr>
<h2>Quantity : ${order_item.qaunt}</h2>
<h2>Price : ${order_item.pro.p_price*order_item.qaunt}</h2>
<h2>Payment mode : ${order_item.paymentmode}</h2>
<h2>Shipping Address </h2><hr> <h3>${order_item.ship_address}</h3>
<h2>Billing Address </h2><hr><h3> ${order_item.bill_addess}</h3>
</div>

</div><br/>
</c:forEach></div>
<%@include file="footer.jsp" %>
</body>
</html>