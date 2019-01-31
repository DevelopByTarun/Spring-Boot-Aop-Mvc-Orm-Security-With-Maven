<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Fetch.Jsp</title>
<style>
.show {
	text-align: center;
	text-transform: capitalize;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	color: brown;
}

.btnOne a {
	color: black;
}

.btnTwo a {
	color: black;
}

table tbody {
	text-align: center;
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
			<h1 class="show">Products</h1>
<br/>
<table class="table table-striped table-bordered">
  <thead class="thead-dark">
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Description</th>
      <th>Price</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tbody> 
  <c:forEach var="product" items="${proudList}">			
	   <tr>
       <td>${product.id}</td>
       <td>${product.name}</td>
       <td>${product.desc}</td>
       <td>${product.price}</td>
       <td>
       <button type="button" class="btn btn-danger btnTwo">
       	<a href="/delete-product/${product.id}">Delete</a>
       </button>
       </td>
    </tr>						
</c:forEach>
  </tbody>
</table>
<br/><br/>
<h2 class="alert alert-info" role="alert">
Add More Product <a href="/welcome-product">Click Here</a>
</h2>
		</div>
	</div>
</div>
</body>
</html>