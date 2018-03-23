<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
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

<body>
<div class="container">
<div class="col-sm-4">
<br>
<br>
 <div class="thumbnail"  >
<img src="${e}resources/images/${product.p_id}.jpg" height="440" width="240"/>
</div>
</div>
<div class="col-sm-8" >
<h3><b>${product.p_name}</b></h3>
<hr>
<h5><b>IN STOCK</b> : ${product.p_quant}</h5>
<h5><b>PRICE</b> : <i class="fa fa-rupee" style="font-size:13px"></i> ${product.p_price}</h5>
<h5><b>SUPPLIER NAME</b> : ${product.p_sup.s_name}</h5>
<h5><b>CATEGORY</b> : ${product.p_cat.c_name}</h5>

<div id="featurebullets_feature_div" class="feature" data-feature-name="featurebullets">
<div id="feature-bullets" class="a-section a-spacing-medium a-spacing-top-small">
<ul class="a-unordered-list a-vertical a-spacing-none">
<li> 
<h5>${ product.p_desc_dialcolor}</h5>
</li>
<li>
<h5>${ product.p_desc_bandcolor}</h5>
</li>
<li> 
<h5>${ product.p_desc_momenttype}</h5>
</li>
<li> 
<h5>${ product.p_desc_displaytype}</h5>
</li>
<li> 
<h5>${ product.p_desc_casematerial}</h5>
</li>
<li> 
<h5>${ product.p_desc_waterres}</h5>
</li>
<li>
<h5>${ product.p_desc_warr}</h5>
</li>
</ul>
</div>
</div>

<a class="btn btn-primary" href="${e}addtocart/${product.p_id}"> ADD TO CART</a>
<a class="btn btn-primary" href="${e}buynow/${product.p_id}"> BUY NOW </a>

</div>
</div>

</body>
<%@include file="footer.jsp" %>
</body>
</html>