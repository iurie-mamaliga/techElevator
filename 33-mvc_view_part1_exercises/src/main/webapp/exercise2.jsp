<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			 <c:set var="tempNumber" value="0" />
			 <c:set var="firstNumber" value="0" />
			 <c:set var="secondNumber" value="1" />
			 <c:set var="thirdNumber" value="1" />
			 <c:set var="finalNumber" value="0" />	 
			 
			 <c:forEach begin="1" end="25" var="number"> 
			 	<c:if test="${thirdNumber == '1'}">
					<li>
						${firstNumber} 
					</li>
					<c:set var='firstNumber' value="${firstNumber + 1}" />
				</c:if>
			 	<li>
					${thirdNumber} 
				</li>
			 	<c:set var='thirdNumber' value="${firstNumber + secondNumber}" />
			 	<c:set var='tempNumber' value="${secondNumber}" />
			 	<c:set var='secondNumber' value="${thirdNumber}" />
			 	<c:set var='firstNumber' value="${tempNumber}" />
			 </c:forEach>
		</ul>
	</body>
</html>