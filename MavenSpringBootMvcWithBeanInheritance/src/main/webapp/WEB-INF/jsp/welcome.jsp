<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title><spring:message code="welcome.title"></spring:message></title>
<style>
.enter {
	text-align: center;
	font-family: cursive;
	color: red;
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
			<h1 class="enter"><spring:message code="welcome.heading"></spring:message></h1>
<br/>
<ul class="list-group">  
<li class="list-group-item list-group-item-danger">
<h3>
<a href="/service">
<spring:message code="welcome.link1"></spring:message>
</a>
</h3>
</li>
<li class="list-group-item list-group-item-dark">
<h3>
<a href="/anotherservice">
<spring:message code="welcome.link2"></spring:message>
</a>
</h3>
</li>
<li class="list-group-item list-group-item-primary">
<h3>
<a href="/telephoneservice">
<spring:message code="welcome.link3"></spring:message>
</a>
</h3>
</li>
<li class="list-group-item list-group-item-warning">
<h3>
<a href="/consultservice">
<spring:message code="welcome.link4"></spring:message>
</a>
</h3>
</li>
</ul>
		</div>
	</div>
</div>
</body>
</html>