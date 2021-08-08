<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Time</title>
        <link rel="stylesheet" type="text/css" href="css/time.css">
    </head>
    <body>
    	<a href="/">Go Back</a>
        <c:out value="${time}"/>
    </body>
    <script type="text/javascript" src="js/timeAlert.js"></script>
</html>