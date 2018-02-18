<!doctype>
<html>
<head>
<script src="${e}resources/javaScript/validationAddCategory.js"></script>

<%@include file="header.jsp" %>
<link href="${e}resources/css/try.css" rel="stylesheet">

<body>
<div class="supplier-page">
  <div class="form">
    <form class="supplier-form" action="${e}savecategory" method="post" onsubmit="return validationAddCategory()">
      <input type="text" placeholder="category name" name="c_name"/>
  <textarea class="form-control" rows="5" id="comment" placeholder="category description" name="c_desc"/></textarea>
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