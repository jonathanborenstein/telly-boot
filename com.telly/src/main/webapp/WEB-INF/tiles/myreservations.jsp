<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2>My Reservations</h2>


<br>
<c:forEach var="myMap" items="${myMap}">

	<p>
		Leaving From: <c:out value="${myMap.value.leaveFrom}"></c:out>
		on <c:out value="${myMap.value.date}"></c:out>
	<p>
		Going To: <c:out value="${myMap.value.goingTo}"></c:out>



		<sf:form method="post" commandName="reservations">
			<input id="id" name="id" type="hidden" value="${myMap.key}" />

			<input class="btn-primary" value="Cancel Reservation" type="submit" />




		</sf:form>
		<br>
</c:forEach>
