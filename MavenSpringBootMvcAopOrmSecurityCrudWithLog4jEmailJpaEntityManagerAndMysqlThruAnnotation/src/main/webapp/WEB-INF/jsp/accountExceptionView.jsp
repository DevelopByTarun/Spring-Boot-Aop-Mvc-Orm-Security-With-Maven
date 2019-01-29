<%@ include file="taglib.jsp"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="links.jsp"%>
<title>AccountExceptionView.Jsp</title>
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
    <a href="/welcome-account">Add Account</a>
  </li>
  <li>
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
		<br/><br/><br/>
			<h1 class="view">
				Account Exception Page
			</h1>
			<br/>
			<h3 class="alert alert-primary">Exception Occured At :: ${exception.date}</h3>
			<br/>
			<h3 class="alert alert-info">Exception Message :: ${exception.message}</h3>
			<br/>
		</div>
	</div> 
</div>
</body>
</html>