<%@ include file="taglib.jsp"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="links.jsp"%>
<title>AddCustomerAccount.Jsp</title>
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
  <li class="active">
    <a href="/welcome-customer-account">Add Customer And Account</a>
  </li>
  <li>
    <a href="/fetch-customers">Fetch Customers Details</a>
  </li>
  <li>
    <a href="/fetch-accounts">Fetch Accounts Details</a>
  </li>
  <li>
    <a href="/email-customer-account">ContactUs By Email</a>
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
			<h1 class="idx">Customer And Account Registration Form</h1>
<br/>
<form action="/add-customer-account" method="post">

  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerName&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerName" class="form-control" id="inputEmail3" placeholder="Enter Customer Name">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerAge&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerAge" class="form-control" id="inputEmail3" placeholder="Enter Customer Age">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerCity&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerCity" class="form-control" id="inputEmail3" placeholder="Enter Customer City">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerCountry&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerCountry" class="form-control" id="inputEmail3" placeholder="Enter Customer Country">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountType&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="accountType" class="form-control" id="inputEmail3" placeholder="Enter Account Type">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountBank&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="accountBank" class="form-control" id="inputEmail3" placeholder="Enter Account Bank">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountStatus&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="accountStatus" class="form-control" id="inputEmail3" placeholder="Enter Account Status">
    </div>
  </div>
   
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary btn3d btn-lg"><span class="glyphicon glyphicon-cloud"></span> CustomerAccount</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>