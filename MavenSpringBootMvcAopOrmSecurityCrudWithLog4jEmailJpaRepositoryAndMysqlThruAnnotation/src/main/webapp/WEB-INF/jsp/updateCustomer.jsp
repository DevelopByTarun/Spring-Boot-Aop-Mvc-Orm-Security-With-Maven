<%@ include file="taglib.jsp"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="links.jsp"%>
<title>UpdateCustomer.Jsp</title>
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
    <a href="/welcome-customer-account">Add Customer And Account</a>
  </li>
  <li class="active">
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
			<h1 class="idx">Customer Updation Form</h1>
<br/>
<form action="/update-customer" method="post">

  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerId&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="id" value="<%= ((CustomerDTO)request.getAttribute("values")).getId() %>" class="form-control" id="inputEmail3" readonly>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerName&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerName" value="<%= ((CustomerDTO)request.getAttribute("values")).getName() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerAge&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerAge" value="<%= ((CustomerDTO)request.getAttribute("values")).getAge() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerCity&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerCity" value="<%= ((CustomerDTO)request.getAttribute("values")).getCity() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>CustomerCountry&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="customerCountry" value="<%= ((CustomerDTO)request.getAttribute("values")).getCountry() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
   
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary btn3d btn-lg"><span class="glyphicon glyphicon-cloud"></span> UpdateCustomer</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>