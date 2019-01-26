<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.model.Employee"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>

<!-- style.css link not working -->
<!-- <link type="text/css" href="/WEB-INF/css/style.css" rel="stylesheet"> -->

<title>EmployeeDetail.jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="heading">Employee Details</h1>
<br/>
<table class="table table-striped table-bordered">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th>Id</th>
      <th>Name</th>
      <th>Age</th>
      <th>Salary</th>
    </tr>
  </thead>
  <tbody>
 	<tr>
      <th scope="row">1</th>
      <td><%= ((Employee)request.getAttribute("details")).getId() %></td>
      <td><%= ((Employee)request.getAttribute("details")).getName() %></td>
      <td><%= ((Employee)request.getAttribute("details")).getAge() %></td>
      <td><%= ((Employee)request.getAttribute("details")).getSalary() %></td>
    </tr>						
  </tbody>
</table>
		</div>
	</div>
</div>
</body>
</html>