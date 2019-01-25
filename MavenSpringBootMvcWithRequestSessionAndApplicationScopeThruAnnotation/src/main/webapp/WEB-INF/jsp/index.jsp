<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Index.Jsp</title>
<style>
.enter {
	text-align: center;
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
			<h1 class="enter">Request Session And Application Scope</h1>
<br/>
<ul class="list-group">  
<li class="list-group-item list-group-item-danger">
<h3>
<a href="/address">
Get Address
</a>
</h3>
</li>
<li class="list-group-item list-group-item-dark">
<h3>
<a href="/addresscheck">
Get Address Check
</a>
</h3>
</li>
<li class="list-group-item list-group-item-primary">
<h3>
<a href="/age">
Get Age
</a>
</h3>
</li>
<li class="list-group-item list-group-item-warning">
<h3>
<a href="/agecheck">
Get Age Check
</a>
</h3>
</li>
</ul>
		</div>
	</div>
</div>
</body>
</html>