<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="header.jsp" %>


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
<div class="row">
<div class="container">
<c:forEach items="${proList}" var="pro">

    <div class="col-sm-4">  
        <div class="thumbnail"  >
      <a href="${e}productdetails/${pro.p_id}" target="_blank">
<img src="${e}resources/images/${pro.p_id}.jpg"  style="height:200px" alt="buildings" >
<div class="caption">
<p><center><b>${pro.p_name}</b></center></p>
</div>
</a>
</div>

    </div>
</c:forEach></div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>