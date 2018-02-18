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
<table class="table table-striped table-hover" >
<tr>
<th>ID</th>
<th>NAME</th>
<th>DESCRIPTION</th>
<th>Operation</th>
</tr>
<c:forEach items="${catList}" var="cat">
<tr>
<td>${cat.c_id}</td>
<td>${cat.c_name}</td>
<td>${cat.c_desc}</td>
<td>
<a href="${e}updatecategory/${cat.c_id}">Update</a>
<a href="${e}deletecategory/${cat.c_id}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<%@include file="footer.jsp" %>
</body>
</html>