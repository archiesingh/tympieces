<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Orders</title>
<style>
body  {
    background-image: url("resources/images/waterr.jpeg");
 	background-repeat: no-repeat;
    background-position: right bottom;
    background-attachment: fixed;
}
</style>
</head>
<body>
<%@include file="header.jsp" %>
<h1 style=" color:black; font-size:500%; text-align:center; font-family:algerian;"><u>MY ORDERS</u></h1>

<div class="row">

<c:forEach items="${orderlist}" var="order_item">
<hr>
<div class="container"  >
<div class="col-sm-4">
<br>
<br>
<br>
<br>
 <div class="thumbnail"  style="height:450px">
      <a href="${e}productdetails/${pro.p_id}" target="_blank"></a>
<img src="${e}resources/images/${order_item.pro.p_id}.jpg" alt="product"  style="height:400px">
</div>
</div>
<div class="col-sm-6" >
<h2><b><u>${order_item.pro.p_name}</u></b></h2>
<hr>
<h4><b>QUANTITY</b> : ${order_item.qaunt}</h4>
<h4><b>PRICE</b> : <i class="fa fa-rupee" style="font-size:24px"></i> ${order_item.pro.p_price*order_item.qaunt}.00</h2>
<h4><b>Payment mode</b> : ${order_item.paymentmode}</h4>
<hr>
<h3><b><U>SHIPPING ADDRESS</U></h3>
<h4><b>NAME</b> : ${order_item.ship_address.name}</h4>
<h4><b>MOBILE</b> : ${order_item.ship_address.mobile}</h4>
<h4><b>HOUSE NO.</b> : ${order_item.ship_address.houseno}</h4>
<h4><b>CITY</b> : ${order_item.ship_address.city}</h4>
<h4><b>STATE</b> : ${order_item.ship_address.state}</h4>
<hr>
<h3><U><b>BILLING ADDRESS</b></U></h3>
<h4><b>NAME</b> : ${order_item.bill_addess.name}</h4>
<h4><b>MOBILE</b> : ${order_item.bill_addess.mobile}</h4>
<h4><b>HOUSE NO.</b> : ${order_item.bill_addess.houseno}</h4>
<h4><b>CITY:</b>  ${order_item.bill_addess.city}</h4>
<h4><b>STATE:</b> ${order_item.bill_addess.state}</h4>
<br>
</div>

</div><br/>
</c:forEach></div>
<%@include file="footer.jsp" %>
</body>
</html>