<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Add.Jsp</title>
<style>
.enter {
	text-align: center;
	text-transform: capitalize;
	font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
	color: brown;
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
			<h1 class="enter">Add Product</h1>
<br/>
<form action="/add-product" method="post">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Id&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="id" class="form-control" id="inputEmail3" placeholder="Enter Id">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Name&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputEmail3" placeholder="Enter Name">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Description&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="desc" class="form-control" id="inputEmail3" placeholder="Enter Description">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>Price&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="price" class="form-control" id="inputPassword3" placeholder="Enter Price">
    </div>
  </div>
  
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-success">Add Product</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>