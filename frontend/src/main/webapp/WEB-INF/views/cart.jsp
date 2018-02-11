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
<c:forEach items="${cartlist}" var="cart_item">






<div class="container">
<div class="col-sm-4">
 <div class="thumbnail"  style="height:400px">
      <a href="${e}productdetails/${pro.p_id}" target="_blank"></a>
<img src="${e}resources/images/${cart_item.pro.p_id}.jpg" alt="buildings"  style="height:400px">
<div class="caption">
</div>
</div>
</div>
    <div class="col-sm-8" >
    
<h2><b>${cart_item.pro.p_name}</b></h2>
<hr>
<h2>Quantity</h2>
<table><tr>
<td><a class="btn btn-primary" href="${e}changequantity/${cart_item.id}/0" >-</a></td><td style="padding-left:10px;padding-right:10px;"><p>${cart_item.quant}</p></td><td><a class="btn btn-primary" href="changequantity/${cart_item.id}/1">+</a></td>
<p>${cart_item.pro.p_price*cart_item.quant}</p>
</tr></table>
<a class="btn btn-danger" href="${e}deletecartitem/${cart_item.id}">delete</a>
</div>

</a>
</div>

    
</c:forEach></div>
<div class="container">
<a href="${e}checkout" class="btn btn-primary">checkout</a>
</div>

<%@include file="footer.jsp" %>

</body>
</html>