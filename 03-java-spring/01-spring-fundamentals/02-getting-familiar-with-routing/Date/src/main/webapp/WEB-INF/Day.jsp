<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/j.js"></script>
<meta charset="UTF-8">
<title>Date</title>
</head>
<body onload="yell()">
	<span class="datewrap"> <c:out value="${date}"/></span>
</body>
</html>