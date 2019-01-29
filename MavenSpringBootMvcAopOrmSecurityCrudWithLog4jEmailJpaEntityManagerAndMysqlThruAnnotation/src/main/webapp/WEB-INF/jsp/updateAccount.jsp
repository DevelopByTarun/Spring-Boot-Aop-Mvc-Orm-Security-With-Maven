<%@ include file="taglib.jsp"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="links.jsp"%>
<title>UpdateAccount.Jsp</title>
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
  <li class="active">
    <a href="/fetch-accounts">Fetch Accounts Details</a>
  </li>
  <li>
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
			<h1 class="idx">Account Updation Form</h1>
<br/>
<form action="/update-account" method="post">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountId&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="id" value="<%= ((AccountDTO)request.getAttribute("values")).getId() %>" class="form-control" id="inputEmail3" readonly>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountNumber&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="accountNumber" value="<%= ((AccountDTO)request.getAttribute("values")).getNumber() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountType&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="accountType" value="<%= ((AccountDTO)request.getAttribute("values")).getType() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountBank&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="accountBank" value="<%= ((AccountDTO)request.getAttribute("values")).getBank() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>AccountStatus&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="accountStatus" value="<%= ((AccountDTO)request.getAttribute("values")).getStatus() %>" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary btn3d btn-lg"><span class="glyphicon glyphicon-cloud"></span> UpdateAccount</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>