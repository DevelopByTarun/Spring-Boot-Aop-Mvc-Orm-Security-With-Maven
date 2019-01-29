<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Welcome.Jsp</title>
<style>
.idx {
	text-align: center;
	text-transform: capitalize;
	font-family: cursive;
	color: brown;
}
</style>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="idx">Welcome To Spring Email With Attachment</h1>
<br/>
<form action="/sendEmailWithAttachment" method="post">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>From&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="from" class="form-control" id="inputEmail3" placeholder="Enter Your Email">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>To&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="to" class="form-control" id="inputEmail3" placeholder="Enter Receiver Email">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Subject&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="subject" class="form-control" id="inputEmail3" placeholder="Enter Subject">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>Text&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="text" class="form-control" id="inputPassword3" placeholder="Enter Text">
    </div>
  </div>
  
   <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>Attach File&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="pathForAttachment" class="form-control" id="inputPassword3" placeholder="Enter Path For Attach File">
    </div>
  </div>
  
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-warning">Send Email</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>