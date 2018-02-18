<!doctype>
<html>
<head>
<%@include file="header.jsp" %>
<script src="${e}resources/javaScript/validationAddSupplier.js"></script>
<link href="${e}resources/css/try.css" rel="stylesheet">
<body>
<div class="supplier-page">
  <div class="form">
    <form class="supplier-form"  action="${e}savesupplier" method="post" onsubmit="return validationAddSupplier()">
      <input type="text" placeholder="supplier name" name="s_name"/>
  <textarea class="form-control" rows="5" id="comment" placeholder="supplier address" name="s_address"/></textarea>
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