<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<title>Hello Spring MVC</title>
</head>
<body>
	<h1>Book Page</h1>
	<img src="img/forDummies.png" alt="Book Cover">


	<p><h3><a
		href="http://localhost:8080/37-mvc-controllers-part2-exercises/writeReview">Write
		a new review</a></h3></p>

	<table class="table">
		<h1>Reviews</h1>
		<c:forEach items="${reviews}" var="review">
			<hr>
			<p>
				<b><c:out value="${review.title}" /></b> (
				<c:out value="${review.username}" />
				)
			</p>
			<p>
				<c:out value="${review.dateSubmittedFormated}" />
			</p>
			<p>
				<c:out value="${review.text}" />
			</p>
			<c:choose>
				<c:when test="${review.rating == 1}">
					<img src="img/star.png" alt="Product Rating">
				</c:when>
				<c:when test="${review.rating == 2}">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
				</c:when>
				<c:when test="${review.rating == 3}">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
				</c:when>
				<c:when test="${review.rating == 4}">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
				</c:when>
				<c:otherwise>
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
					<img src="img/star.png" alt="Product Rating">
				</c:otherwise>
			</c:choose>

		</c:forEach>
	</table>


</body>
</html>