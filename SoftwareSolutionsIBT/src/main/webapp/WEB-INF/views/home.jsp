<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<title>Home</title>
</head>
<body>

<h1>
	Software Solutions Issue and Bug Tracker  
</h1>
<div class="btn-group">
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
    Action <span class="caret"></span>
  </button>
  <ul class="dropdown-menu">
	<li><a href="addSystem">Add New System</a></li>
	<li><a href="showSystems">View Systems</a></li>
	<li><a href="addRelease">Add New System</a></li>
	<li><a href="showReleases">View Systems</a></li>
	<li><a href="addReport">Add New System</a></li>
	<li><a href="showReport">View Systems</a></li>
	<li><a href="addRevision">Add New System</a></li>
	<li><a href="showRevisions">View Systems</a></li>
	<li><a href="addTargetChange">Add New System</a></li>
	<li><a href="showTargetChanges">View Systems</a></li>
	<li><a href="addTargetFile">Add New System</a></li>
	<li><a href="showTargetFile">View Systems</a></li>
	<li class="divider"></li>
  </ul>
</div>



	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="resources/js/jquery-2.0.3.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>
