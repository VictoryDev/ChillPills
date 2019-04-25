<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<thead>
	<tr>
	    <th onclick="msg()">Medicine</th>
	    <th>Original Price</th>
	    <th>Price w/ coverage</th>
	    <th>Type</th>
    </tr>
</thead>
<tbody>
<c:forEach items="${drugs}" var="drug">
   <tr>
       <td onclick="msg()">${drug.name}</td>
       <td>${drug.price}</td>
       <td>${String.format("%.2f",drug.price * x)}</td>
       <td>${drug.type}</td>
    </tr>
</c:forEach>
</tbody>