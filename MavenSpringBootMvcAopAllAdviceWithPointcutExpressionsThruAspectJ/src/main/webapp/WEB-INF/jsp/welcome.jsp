<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Welcome.Jsp</title>
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
			<h1 class="enter">Welcome Aspects</h1>
<br/>
<ul class="list-group">  
<li class="list-group-item list-group-item-info">
<h3>
<a href="/aspectnormal">
Click For Normal Aspect
</a>
</h3>
</li>
<li class="list-group-item list-group-item-dark">
<h3>
<a href="/aspectpointcut">
Click For Pointcut Aspect
</a>
</h3>
</li>
<li class="list-group-item list-group-item-primary">
<h3>
<a href="/aspectjoinpoint">
Click For Jointpoint Aspect
</a>
</h3>
</li>
<li class="list-group-item list-group-item-warning">
<h3>
<a href="/aspectloggable">
Click For Loggable Aspect
</a>
</h3>
</li>
</ul>
		</div>
	</div>
</div>
</body>
</html>