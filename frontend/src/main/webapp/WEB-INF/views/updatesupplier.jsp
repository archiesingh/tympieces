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
    <form class="supplier-form" action="${e}savesupplier" method="post">
<input type="hidden" name="s_id" value="${sup.s_id}"/>
      <input type="text" placeholder="supplier name" name="s_name" value="${sup.s_name}"/>
  <textarea class="form-control" rows="5" id="comment" placeholder="supplier address" name="s_address"/>${sup.s_add}</textarea>
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