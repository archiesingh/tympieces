<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="${e}resources/css/try.css" rel="stylesheet">
<script src="${e}resources/javaScript/validation.js"></script>
</head>
<body>
<%@include file="header.jsp" %>
 <div class="form">

 <form:form action="${e}saveproduct" modelAttribute="pro" enctype="multipart/form-data" onsubmit="return validation()">
<form:input placeholder="product name" path="p_name"/>
<form:input placeholder="product price" path="p_price"/>
<form:input placeholder="product quantity" path="p_quant"/>
<form:input placeholder="dial color" path="p_desc_dialcolor"/>
<form:input placeholder="band color" path="p_desc_bandcolor"/>
<form:input placeholder="watch moment type" path="p_desc_momenttype"/>
<form:input placeholder="watch display type" path="p_desc_displaytype"/>
<form:input placeholder="case material" path="p_desc_casematerial"/>
<form:input placeholder="water resistence depth" path="p_desc_waterres"/>
<form:input placeholder="warrenty" path="p_desc_warr"/>
<form:select path="p_sup.s_id">
<form:options items="${listsup}"/>
</form:select>
<form:select path="p_cat.c_id">
<form:options items="${listcat}"/>
</form:select>
<form:input path="p_image" type="file"/>
<button type="submit">Add</button>
</form:form></div>
<%@include file="footer.jsp" %>


</body>
</html>