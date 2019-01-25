<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page import="com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.model.User"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title><spring:message code="userDetail.title"/></title>
<style>
.heading {
	text-align: center;
	font-family: cursive;
	text-transform: capitalize;
	color: green;
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
			<h1 class="heading"><spring:message code="userDetail.heading"/></h1>
<br/>
<table class="table table-striped table-bordered">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th><spring:message code="userDetail.table.id"/></th>
      <th><spring:message code="userDetail.table.name"/></th>
      <th><spring:message code="userDetail.table.age"/></th>
      <th><spring:message code="userDetail.table.city"/></th>
    </tr>
  </thead>
  <tbody>
 	<tr>
      <th scope="row">1</th>
      <td><%= ((User)request.getAttribute("values")).getId() %></td>
      <td><%= ((User)request.getAttribute("values")).getName() %></td>
      <td><%= ((User)request.getAttribute("values")).getAge() %></td>
      <td><%= ((User)request.getAttribute("values")).getCity() %></td>
    </tr>						
  </tbody>
</table>
		</div>
	</div>
</div>
</body>
</html>