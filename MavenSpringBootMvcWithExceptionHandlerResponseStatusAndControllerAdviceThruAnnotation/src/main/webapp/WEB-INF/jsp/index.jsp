<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			<h1 class="enter">Different Exception Handling Results</h1>
<br/>
<ul class="list-group">  
<li class="list-group-item list-group-item-danger">
<h3>
<a href="/normalexception">
Get Runtime Exception
</a>
</h3>
</li>
<li class="list-group-item list-group-item-dark">
<h3>
<a href="/customexception">
Get Custom Exception
</a>
</h3>
</li>
<li class="list-group-item list-group-item-primary">
<h3>
<a href="/conflictexception">
Get Custom Conflict Exception
</a>
</h3>
</li>
<li class="list-group-item list-group-item-warning">
<h3>
<a href="/customexceptionwithhttpstatuscode">
Get Custom Exception With Http Status Code
</a>
</h3>
</li>
<li class="list-group-item list-group-item-warning">
<h3>
<a href="/customgeneralexception">
Get Custom General Exception
</a>
</h3>
</li>
</ul>
		</div>
	</div>
</div>
</body>
</html>