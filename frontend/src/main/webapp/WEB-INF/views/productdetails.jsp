<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%@include file="header.jsp" %>
<div class="container">

<div class="col-sm-4">
 <div class="thumbnail"  >
<img src="${e}resources/images/${product.p_id}.jpg" height="440" width="240"/>
</div>
</div>
    <div class="col-sm-8" >
    
     
<h3><b>${product.p_name}</b></h3>
<hr>
<h5>IN STOCK: ${product.p_quant}</h5>
<h5>PRICE: ${product.p_price}</h5>
<div id="cashOnDelivery_feature_div" class="feature" data-feature-name="cashOnDelivery">

<script type="a-state" data-a-state="{&quot;key&quot;:&quot;cashOnDeliveryPageState&quot;}">{"isCodRestrictedGl":false}</script>
      <span id="cod_eligible_message" class="a-color-base">
                <b>Cash on Delivery</b> eligible.
            </span>
</div>
<div id="featurebullets_feature_div" class="feature" data-feature-name="featurebullets">

<div id="feature-bullets" class="a-section a-spacing-medium a-spacing-top-small">
                               <ul class="a-unordered-list a-vertical a-spacing-none">
					
					
						<li><span class="a-list-item"> 
							<h5>${ product.p_desc_dialcolor}</h5>
							
						</span></li>
					
						<li><span class="a-list-item"> 
							<h5>${ product.p_desc_bandcolor}</h5>
							
						</span></li>
					
						<li><span class="a-list-item"> 
							<h5>${ product.p_desc_momenttype}</h5>
							
							
						</span></li>
						
						
						<li><span class="a-list-item"> 
							<h5>${ product.p_desc_displaytype}</h5>
							
						</span></li>
					
						<li><span class="a-list-item"> 
							<h5>${ product.p_desc_casematerial}</h5>
</span></li>
<li><span class="a-list-item"> 
<h5>${ product.p_desc_waterres}</h5>
</span></li>
<li><span class="a-list-item"> 
<h5>${ product.p_desc_warr}</h5>
</span></li>
</ul>
<!--  Loading EDP related metadata -->
</div>
</div>







<h5>SUPPLIER NAME: ${product.p_sup.s_name}</h5>
<h5>CATEGORY: ${product.p_cat.c_name}</h5>

<a class="btn btn-primary" href="${e}addtocart/${product.p_id}"> ADD TO CART</a>
<a class="btn btn-primary" href="${e}buynow/${product.p_id}"> Buy Now</a>

</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>