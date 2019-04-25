<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Chemical</title>
</head>
<body>
<h1>New Chemical</h1>
	<form:form action="/chemicals/new" method="post" modelAttribute="chemical">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description"/>
	        <form:textarea path="description"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>