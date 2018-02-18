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
<th>PRICE</th>
<th>QUANTITY</th>
<th>DIAL COLOR</th>
<th>BAND COLOR</th>
<th>MOMENT TYPE</th>
<th>DISPLAY TYPE</th>
<th>CASE MATERIAL</th>
<th>WATER RES. DEPTH</th>
<th>WARRENTY</th>
<th>SUPPLIER</th>
<th>CATEGORY</th>
<th>Operation</th>
</tr>
<c:forEach items="${proList}" var="pro">
<tr>
<td>${pro.p_id}</td>
<td>${pro.p_name}</td>
<td>${pro.p_price}</td>
<td>${pro.p_quant}</td>
<td>${pro.p_desc_dialcolor}</td>

<td>${pro.p_desc_bandcolor}</td>

<td>${pro.p_desc_momenttype}</td>

<td>${pro.p_desc_displaytype}</td>

<td>${pro.p_desc_casematerial}</td>

<td>${pro.p_desc_waterres}</td>

<td>${pro.p_desc_warr}</td>

<td>${pro.p_sup.s_name}</td>
<td>${pro.p_cat.c_name}</td>
<td>
<a href="${e}updateproduct/${pro.p_id}">Update</a>
<a href="${e}deleteproduct/${pro.p_id}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<%@include file="footer.jsp" %>
</body>
</html>