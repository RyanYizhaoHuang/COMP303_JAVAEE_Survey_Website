<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
<title>Add New Survey</title>
</head>
<body>
	  <div class="body_container">
      <div class="row">
        <div class="col-md-offset-3 col-md-6">
          <h3 class="list_title"><i class="glyphicon glyphicon-chevron-right"></i> Get start with your survey</h3>
            <form class="form" method="get" action="${pageContext.request.contextPath}/CreateSurvey">

              <div class="form-group">
                <label class="label_Styling" for="NameTextField">Survey Topic</label>
                <input type="text" class="form-control" id="NameTextField"
                placeholder="Survey Topic" name="topic" value="" required>
              </div>


            <div class="form-group">
                <label class="label_Styling" for="NameTextField">Number of questions</label>
                <input type="text" class="form-control" id="NameTextField"
                placeholder="Number of questions" name="numberOfQuestion" value="" required>
            </div>

            

    
<!--<a href="/surveys/create" class="btn btn-primary">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>-->
              <button type="submit" class="btn btn-primary">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></button>
              <a href="${pageContext.request.contextPath}/" class="btn btn-warning"><i class="fa fa-undo"></i> Cancel</a>
            </form>
        </div>
      </div>
    </div>
</body>
</html>