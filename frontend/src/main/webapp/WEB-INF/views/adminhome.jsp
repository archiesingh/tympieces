<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header.jsp" %>
<br/>

<div class="container">
  
  
  <button type="button" class="btn btn-success btn-lg btn-block">SUPPLIER</button>

<a class="btn btn-info btn-hover " href="${e}addsupplier">ADD SUPPLIER</a>
<br/>

<a class="btn btn-info btn-hover " href="${e}viewsupplier">VIEW SUPPLIER</a>

</div>

<br/>
<br/>
<br/>
<div class="container">
<button type="button" class="btn btn-success btn-lg btn-block">CATEGORY</button>
<a class="btn btn-info btn-hover " href="${e}addcategory">ADD CATEGORY</a>

<br/>
<a class="btn btn-info btn-hover " href="${e}viewcategory">VIEW CATEGORY</a>
</div>
<br/><br/><br/>

<div class="container">
  
  
  <button type="button" class="btn btn-success btn-lg btn-block">PRODUCT</button>

<a class="btn btn-info btn-hover " href="${e}addproduct">ADD PRODUCT</a>
<br/>

<a class="btn  btn-info btn-hover " href="${e}viewproduct">VIEW PRODUCT</a>

</div>


<%@include file="footer.jsp" %>
</body>
</html>
