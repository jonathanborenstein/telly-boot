<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<h2>Search</h2>



<sf:form method="post" modelAttribute="bus">


	<div class="error">
		<sf:errors path="date"></sf:errors>
	</div>
	
	<table class="form-horizontal" role="form">
		<tr>


			<td class="control-label col-sm-2">Leave Date:</td>
			<td><sf:input class="col-sm-10" path="date" name="date"
					type="text" /><br/>
		<tr>
		<tr>
			<td class="control-label col-sm-2">Leave From:</td>
			<td><sf:input class="col-sm-10" path="leaveFrom"
					name="leaveFrom" type="text" /><br />
				<div class="error">
					<sf:errors path="leaveFrom"></sf:errors>
				</div></td>
		<tr>
		<tr>
			<td class="control-label col-sm-2">Going to:</td>
			<td><sf:input class="col-sm-10" path="goingTo" name="goingTo"
					type="text" /><br />
				<div class="error">
					<sf:errors path="goingTo"></sf:errors>
				</div></td>
		<tr>
			<td>
			<td><input class="btn-primary pull-right" value="Search"
				type="submit" /></td>
		</tr>
	</table>
</sf:form>

<p>
	<br>



	<c:forEach var="results" items="${results}">
		<p>
			Date:
			<c:out value="${results.date}"></c:out>
		<p>
			Leaving From:
			<c:out value="${results.leaveFrom}"></c:out>
			<br>Going To:
			<c:out value="${results.goingTo}"></c:out>
		<p>

			<c:if test="${results != null}">
				<sf:form method="post"
					action="${pageContext.request.contextPath}/book"
					commandName="reservations">

					<input id="id" name="id" type="hidden" value="${results.id}" />

					<input class="btn-primary" value="Book" type="submit" />


				</sf:form>
				<br>
			</c:if>
	</c:forEach>


</p>