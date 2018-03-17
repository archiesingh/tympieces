<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Cart</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="row">
<c:forEach items="${cartlist}" var="cart_item">
<div class="container" style="box-shadow: 5px 2px 5px 5px grey">

<br>
<div class="col-sm-4">
 <div class="thumbnail"  style="height:500px" >
<a href="${e}productdetails/${pro.p_id}" target="_blank"></a>
<img src="${e}resources/images/${cart_item.pro.p_id}.jpg" alt="buildings"  style="height:400px">
</div>
</div>
<div class="col-sm-8" >
<h2><u><b>${cart_item.pro.p_name}</u></b></h2>
<hr>
<h3><b>PRICE</b>: <i class="fa fa-rupee" style="font-size:24px"></i>
 ${cart_item.pro.p_price}.00</h3>
<h3>Select Quantity</h3>
<table><tr>

<td><a class="btn btn-primary" href="${e}changequantity/${cart_item.id}/0" >-</a></td><td style="padding-left:10px;padding-right:10px;"><p>${cart_item.quant}</p></td><td><a class="btn btn-primary" href="changequantity/${cart_item.id}/1">+</a></td>
</tr></table>
<br>
<hr>
<h3><b>TOTAL QUANTITY</b> :${cart_item.quant}</h3>
<h3><b>TOTAL PRICE</b> : <i class="fa fa-rupee" style="font-size:24px"></i>
${cart_item.pro.p_price*cart_item.quant}.00</h3>
<hr>
<a class="btn btn-danger" href="${e}deletecartitem/${cart_item.id}">REMOVE FROM CART</a>
<br>
<br>
<a href="${e}checkout" class="btn btn-primary">CHECKOUT</a>

</div>
</a>
</div>
</div>
</c:forEach></div>
<%@include file="footer.jsp" %>
</body>
</html>