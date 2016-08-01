<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<h2>Create a Bus Trip</h2>

<sf:form method="post" modelAttribute="bus">

	<table class="form-horizontal" role="form">
		<tr>
			<td class="control-label col-sm-2">Leave Date:</td>
			<td><sf:input class="col-sm-10" path="dateLeave"
					name="dateLeave" type="text" /><br />
				<div class="error">
					<sf:errors path="dateLeave"></sf:errors>
				</div></td>
		<tr>
		<tr>
			<td class="control-label col-sm-2">Return Date:</td>
			<td><sf:input class="col-sm-10" path="dateReturn"
					name="dateReturn" type="text" /><br />
				<div class="error">
					<sf:errors path="dateReturn"></sf:errors>
				</div></td>
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
	</table>
	<tr>
		<td class="label"></td>
		<td><input class="btn-primary pull-right" value="Create Trip"
			type="submit" /></td>
	</tr>

</sf:form>