<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
<body>
<%@include file="header.jsp" %>
<br/>

<div class="container">
  
  
  <button type="button" class="btn btn-success btn-lg btn-block">SUPPLIER</button>
<br/><div class="btn-group">
<a class="btn btn-info btn-hover " href="${e}addsupplier">ADD SUPPLIER</a>
<a class="btn btn-info btn-hover " href="${e}viewsupplier">VIEW SUPPLIER</a>

</div>

</div>

<br/>
<br/>
<br/>
<div class="container">
<button type="button" class="btn btn-success btn-lg btn-block">CATEGORY</button>
<br/><div class="btn-group">
<a class="btn btn-info btn-hover " href="${e}addcategory">ADD CATEGORY</a>
<a class="btn btn-info btn-hover " href="${e}viewcategory">VIEW CATEGORY</a>
</div></div>
<br/><br/><br/>

<div class="container">
  
  
  <button type="button" class="btn btn-success btn-lg btn-block">PRODUCT</button>

<br/><div class="btn-group">
<a class="btn btn-info btn-hover " href="${e}addproduct">ADD PRODUCT</a>

<a class="btn  btn-info btn-hover " href="${e}viewproduct">VIEW PRODUCT</a>
</div>
</div>


<%@include file="footer.jsp" %>
</body>
</html>
