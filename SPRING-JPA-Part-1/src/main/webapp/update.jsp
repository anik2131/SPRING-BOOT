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
	top: 350px;
}
</style>
</head>
<body>
	<div class="container">
		<H1>
			<B><I>ZONIX TICKET BOOKING PORTAL</I></B>
		</H1>
		<form action="/update-ticket" method="post">
			<input type="number" name="ticketid" placeholder="TICKET-ID"
				value="${ticketId}" disabled="disabled" /> <input type="text"
				name="ticketname" placeholder="TICKET NAME" /> <input type="submit"
				class="btn btn-success" value="UPDATE NOW" />
		</form>
		<footer class="footer">Developed by Anik Chakraborty</footer>
	</div>
</body>
</html>