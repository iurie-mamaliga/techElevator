<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "Product List View"/>
</c:import>
    <section id="main-content">
		<h1 id = "depName">Toy Department</h1>
		
		<c:forEach var="product" items="${requestScope.productList}">
				
				<section>
					<hr>					
					<a href="http://localhost:8080/34-mvc-views-part2-exercises/productDetail?productId=${product.productId}"><img id = "leftcolumn" src="img/${product.imageName}" alt="Product Image"></a>


					<ul id = "rightcolumn">
					<c:choose>
						<c:when test="${product.topSeller == true}">	
							<li>${product.name}   <spam id = "bestseller">BEST SELLER!</spam></li>
						</c:when>
						<c:otherwise>
							<li>${product.name}</li>	
						</c:otherwise>
					</c:choose>

						<li style="font-weight:lighter;">by ${product.manufacturer}</li>
						
						<li style="color:rgb(128, 0, 0);">$${product.price}</li>
						<li>Weight<span style="font-weight:lighter";> ${product.weightInLbs} lbs</span></li>
						
						<c:choose>
						<c:when test="${product.averageRating < 2}">	
							<li><img id = "rattingList" src="img/1-star.png" alt="Product Rating"></li>
						</c:when>
						<c:when test="${product.averageRating < 3}">	
							<li><img id = "rattingList" src="img/2-star.png" alt="Product Rating"></li>
						</c:when>
						<c:when test="${product.averageRating < 4}">	
							<li><img id = "rattingList" src="img/3-star.png" alt="Product Rating"></li>
						</c:when>
						<c:when test="${product.averageRating < 5}">	
							<li><img id = "rattingList" src="img/4-star.png" alt="Product Rating"></li>
						</c:when>
						<c:otherwise>
							<li><img id = "rattingList" src="img/5-star.png" alt="Product Rating"></li>
						</c:otherwise>
					</c:choose>				
					</ul>

					</section>
					</c:forEach>
					</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp"></c:import>