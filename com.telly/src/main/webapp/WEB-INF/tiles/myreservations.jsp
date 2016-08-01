<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2>My Reservations</h2>


<br>
<c:forEach var="trips" items="${trips}">
	<p>
		<c:out value="${trips.leaveFrom}"></c:out>
		<c:out value="${trips.dateLeave}"></c:out>
	<p>
		<c:out value="${trips.goingTo}"></c:out>
		<c:out value="${trips.dateReturn}"></c:out>
	<p>
	<br>
</c:forEach>
