<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Hello Spring MVC</title>
</head>
<body>
	<h1>
		write review
	</h1>


<form method="POST" action="${formAction}" id="reviewForm">
	<label for="name">Your Name:</label>
	<input type="text" id="name" name="name" /> 
	<select name="rating" form="reviewForm">
		<option value="1">One</option>
		<option value="2">Two</option>
		<option value="3">Three</option>
		<option value="4">Four</option>
		<option value="5">Five</option>		
	</select> 
	
	<label for="reviewName">Review Name:</label>
	<input type="text" id="reviewName" name="reviewName" /> 
	<label for="reviewBody">Review Body:</label>
	<input type="text" id="reviewBody" name="reviewBody" /> 
	<input type="submit" value="Submit" />
</form>




</body>
</html>