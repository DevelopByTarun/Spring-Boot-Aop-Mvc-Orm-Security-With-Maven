<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Scope.Jsp</title>
<style>
.enter {
	text-align: center;
}
.result {
	font-family: cursive;
	color: red;
}
</style>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="enter">Request Session And Application Scope Result</h1>
<br/>
<h2 class="result">
<%= request.getAttribute("getValue") %>
</h2>
		</div>
	</div>
</div>
</body>
</html>