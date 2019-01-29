<%@ include file="taglib.jsp"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="links.jsp"%>
<title>Fetch-Accounts.Jsp</title>
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
			<h1 class="show">Accounts List</h1>
<br/>
<table class="table table-striped table-bordered">
  <thead class="thead-dark">
    <tr>
      <th>Id</th>
      <th>Number</th>
      <th>Type</th>
      <th>Bank</th>
      <th>Status</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tbody> 
  <c:forEach var="account" items="${accountsList}">			
	   <tr>
	   <td><c:out value="${account.id}"/></td>
	   <td><c:out value="${account.number}"/></td>
	   <td><c:out value="${account.type}"/></td>
	   <td><c:out value="${account.bank}"/></td>
	   <td><c:out value="${account.status}"/></td>
       <td>
       <button type="button" class="btn btn-warning btnOne">
       		<a href="/edit-account/${account.id}">Edit</a>
       	</button>
       </td>
       <td>
       <button type="button" class="btn btn-danger btnTwo">
       		<a href="/delete-account/${account.id}">Delete</a>
       	</button>
       </td>
    </tr>						
</c:forEach>
  </tbody>
</table>
<br/>
		</div>
	</div>
</div>
</body>
</html>