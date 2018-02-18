<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${e}resources/css/boot.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<table  class="table table-striped table-hover" >
<tr>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>Operation</th>
</tr>
<c:forEach items="${supList}" var="sup">
<tr>
<td>${sup.s_id}</td>
<td>${sup.s_name}</td>
<td>${sup.s_add}</td>
<td>
<a href="${e}updatesupplier/${sup.s_id}">Update</a>
<a href="${e}deletesupplier/${sup.s_id}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<%@include file="footer.jsp" %>
</body>
</html>