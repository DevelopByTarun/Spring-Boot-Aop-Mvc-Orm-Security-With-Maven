<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>AccessDenied.Jsp</title>
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
		<br/><br/>
			<h1 id="banner">Unauthorized Access !!</h1>
		<hr />
		<c:if test="${not empty error}">
			<div style="color:red">
				<h3>
					Your fake login attempt was bursted, dare again !!<br /> 
				Caused : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
				</h3>
			</div>
		</c:if>
		<h4 class="message">Access denied!</h4>
		</div>
	</div>
</div>
</body>
</html>