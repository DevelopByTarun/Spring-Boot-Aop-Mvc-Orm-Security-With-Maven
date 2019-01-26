<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Index.Jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="enter">Student Login Form</h1>
<br/>
<form action="authenticate" method="post">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Username&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="usrnm" class="form-control" id="inputEmail3" placeholder="Enter Student Username">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>Password&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="pwd" class="form-control" id="inputPassword3" placeholder="Enter Student Password">
    </div>
  </div>
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-success">Login Student</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>