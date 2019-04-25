<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Drug</title>
</head>
<body>
<h1>New Drug</h1>
	<form:form action="/drugs/new" method="post" modelAttribute="drug">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="type">Type</form:label>
	        <form:errors path="type"/>
	        <form:input path="type"/>
	    </p>
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description"/>
	        <form:textarea path="description"/>
	    </p>
	    <p>
	        <form:label path="price">Price</form:label>
	        <form:errors path="price"/>     
	        <form:input type="number" step="0.01" path="price"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>