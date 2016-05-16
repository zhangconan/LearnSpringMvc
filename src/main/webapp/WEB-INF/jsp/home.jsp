<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script type="text/javascript" src="static/js/jquery-2.1.4.min.js"></script>
</head>
<body>
<%=request.getAttribute("message") %>
<%=request.getAttribute("errorMessage") %>
${message} 
${errorMessage}
</body>
</html>

