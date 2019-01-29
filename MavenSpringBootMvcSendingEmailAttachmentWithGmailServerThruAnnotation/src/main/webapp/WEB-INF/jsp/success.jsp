<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Success.Jsp</title>
<style>
.show {
	text-align: center;
	text-transform: capitalize;
	font-family: Verdana;
	color: green;
}
</style>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="show">
			<%= request.getAttribute("result") %>
			</h1>
<br/>
		</div>
	</div>
</div>
</body>
</html>