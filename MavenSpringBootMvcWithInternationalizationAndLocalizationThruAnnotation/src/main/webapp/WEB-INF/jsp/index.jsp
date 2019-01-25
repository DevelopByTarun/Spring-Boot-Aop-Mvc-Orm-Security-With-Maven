<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title><spring:message code="index.title"/></title>
<style>
.show {
	text-align: center;
	font-family: Verdana;
	text-transform: capitalize;
	color: brown;
}
.txt {
	text-align: right;
}
</style>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
		<h5 class="txt"><a href="/?language=en">English</a> | <a href="/?language=hi">Hindi</a></h5>
		<br/>
			<h1 class="show"><spring:message code="index.heading"/></h1>
<br/>
<form action="/saveUser" method="post">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong><spring:message code="index.form.id"/>&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="id" class="form-control" id="inputEmail3" placeholder="Enter User Id">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong><spring:message code="index.form.name"/>&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputPassword3" placeholder="Enter User Name">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong><spring:message code="index.form.age"/>&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="age" class="form-control" id="inputPassword3" placeholder="Enter User Age">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong><spring:message code="index.form.city"/>&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="city" class="form-control" id="inputPassword3" placeholder="Enter User City">
    </div>
  </div>
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-warning"><spring:message code="index.form.button"/></button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>