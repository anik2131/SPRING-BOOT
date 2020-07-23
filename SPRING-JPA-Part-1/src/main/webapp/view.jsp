<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
.footer {
	color: purple;
	position: relative;
	top: 100px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>ZONIX TICKET APP</h1>
		<table class="table table-striped">
			<tr>
				<th>TICKET ID</th>
				<th>TICKET NAME</th>
			</tr>

			<c:forEach items="${tickets}" var="ticket">
				<tr>
					<td>${ticket.getTicketid()}</td>
					<td>${ticket.getTicketname()}</td>
					<td>
						<form action="/delete" method="post">
							<input type="hidden" name="ticketId"
								value="${ticket.getTicketid()}" /> <input type="submit"
								class="btn btn-warning" value="DELETE" />
						</form>
					</td>
			</c:forEach>
		</table>
		<a href="/add-ticket"><button class="btn btn-success">ADD
				TICKET</button></a>
		<footer class="footer">Developed by Anik Chakraborty</footer>
	</div>
</body>
</html>