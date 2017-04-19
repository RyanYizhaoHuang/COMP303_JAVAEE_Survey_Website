<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap import -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>

<div class="container">
	<div class="page-header">
  		<h1>Student Management <small> By: Ryan Huang</small></h1>
	</div>
	<div class="row">
		<div class="col-md-9">
			<a class="btn btn-success btn-lg" href="InsertServlet" role="button">Add New Student</a>
		</div>
	</div>
	<div class="row" style="margin-top: 16px">
		<div class="col-md-9">
		<form action="${pageContext.request.contextPath}/SearchServlet">
			<div class="input-group input-group-lg">
			  	<span class="input-group-addon " id="sizing-addon1">Student Id:</span>		  	
			  	<input type="text" class="form-control" name="id" value="">		  	
			  	<span class="input-group-btn btn-group">
	        	<button class="btn btn-info dropdown-toggle" type="Submit" id="dropdownMenuLink" 
	        		data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Search
	        	</button>
	      		</span>
			</div>
		</form>
		</div>
		<div class="col-md-3">
			<a  class="btn btn-lg btn-primary" href="SearchServlet?op=all">Show ALL Student <span class="badge"><%=request.getAttribute("numberOfStudent") %></span></a>
		</div>
	</div>
</div>
</body>
</html>