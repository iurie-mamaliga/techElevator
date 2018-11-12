<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
				font-size: number;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		<h1>parameter names are: "word" and "number"</h1>
		<c:choose>
			<c:when test="${empty param.word}">
				<c:set var="word" value="Hello World!" />
			</c:when>
			<c:otherwise>
				<c:set var="word" value="${param.word}" />
			</c:otherwise>
		</c:choose>
		
		<c:choose>
			<c:when test="${empty param.number}">
				<c:set var="number" value="5" />
			</c:when>
			<c:otherwise>
				<c:set var="number" value="${param.number}" />
			</c:otherwise>
		</c:choose>

		<ul>
		
		<c:forEach begin="1" end="${number}" var="count">
			<li>
				<font size="${number}px">
					${word}
				</font>
			</li>
			<c:set var="number" value="${number - 1}" />
		</c:forEach>

		</ul>
		
	</body>
</html>