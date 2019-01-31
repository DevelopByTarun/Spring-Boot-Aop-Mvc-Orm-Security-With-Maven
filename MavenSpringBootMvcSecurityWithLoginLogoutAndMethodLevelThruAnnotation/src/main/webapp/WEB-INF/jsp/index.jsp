<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Index.Jsp</title>
<style>
.idx {
	text-align: center;
	text-transform: capitalize;
	font-family: serif;
	color: forestgreen;
}
</style>
</head>
<body>
<ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link active" href="#">welcome ${pageContext.request.userPrincipal.name}</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/logout">Logout</a>
  </li>
</ul>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="idx">Product Task</h1>
<br/>
<ul class="list-group">  
<li class="list-group-item list-group-item-warning">
<h3>
<a href="/welcome-product">
Add Product
</a>
</h3>
</li>

<li class="list-group-item list-group-item-dark">
<h3>
<a href="/list-product">
Fetch Products
</a>
</h3>
</li>
</ul>
		</div>
	</div>
</div>
</body>
</html>