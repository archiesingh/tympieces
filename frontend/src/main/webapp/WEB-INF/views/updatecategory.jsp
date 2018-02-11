<!doctype>
<html>
<head>
<%@include file="header.jsp" %>
<link href="${e}resources/css/try.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>
<div class="supplier-page">
  <div class="form">
    <form class="supplier-form" action="${e}savecategory" method="post">
<input type="hidden" name="c_id" value="${cat.c_id}"/>
      <input type="text" placeholder="category name" name="c_name" value="${cat.c_name}"/>
  <textarea class="form-control" rows="5" id="comment" placeholder="category description" name="c_desc"/>${cat.c_desc}</textarea>
<br/>
<button>SUBMIT</button>
</div>
</body>
      
     
    </form>
  </div>
</div>
<%@include file="footer.jsp" %>
</head>
</html>