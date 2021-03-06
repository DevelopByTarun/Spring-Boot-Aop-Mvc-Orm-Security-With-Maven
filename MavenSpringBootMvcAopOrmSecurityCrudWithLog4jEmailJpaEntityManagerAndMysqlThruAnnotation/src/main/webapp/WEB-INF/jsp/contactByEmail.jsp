<%@ include file="taglib.jsp"%> 
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="links.jsp"%>
<title>ContactByEmail.Jsp</title>
</head>
<body>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" id="fonty" href="#">Hello&nbsp;${pageContext.request.userPrincipal.name}</a>
	</div>
<ul class="nav navbar-nav">
  <li>
    <a href="/">Home</a>
  </li> 
  <li>
    <a href="/welcome-account">Add Account</a>
  </li>
  <li>
    <a href="/fetch-accounts">Fetch Accounts Details</a>
  </li>
  <li class="active">
    <a href="/email-account">ContactUs By Email</a>
  </li>
</ul>
<ul class="nav navbar-nav navbar-right">
		<li>
			<a href="/logout">Logout</a>
		</li>
	</ul>
</div>
</nav>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/><br/>
			<h1 class="contact">Welcome To Spring Email With Attachment</h1>
<br/>
<form action="/sendEmailWithAttachment-account" method="post">
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
      <button type="submit" class="btn btn-magick btn3d btn-lg"><span class="glyphicon glyphicon-gift"></span> SendEmail</button>
    </div>
  </div>
</form>
<br/>
		</div>
	</div>
</div>
</body>
</html>