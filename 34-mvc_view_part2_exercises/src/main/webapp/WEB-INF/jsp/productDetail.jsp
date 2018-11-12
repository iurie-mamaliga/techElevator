<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "Product Details"/>
</c:import>

    <section id="productdetails" style="font-size: 110%; min-height: 800px;">



		<h1 id = "depName">Product Details</h1>
			

				<c:set var="productId" value="${param.productId}" />
				<c:set var="product" value="${requestScope.product}" />
				
				
				<div id="leftColDetail">
				<img src="img/${product.imageName}" alt="Product Image">
				
				</div>
				<div id="rightColDetail">
				<ul>
		  		<c:choose>
						<c:when test="${product.topSeller == true}">	
							<li style="font-size: 1.3em;">${product.name}   <spam id = "bestsellerTile">BEST SELLER!</spam></li>
						</c:when>
						<c:otherwise>
							<li>${product.name}</li>
						</c:otherwise>
					</c:choose>
		  		<li style="font-weight:lighter;">by ${product.manufacturer}</li>
		  		<div id="rightColDetail2">
		  		<c:choose>
						<c:when test="${product.averageRating < 2}">	
							<li><span id="detailRatingSize"><img id = "rattingDetail" src="img/1-star.png" alt="Product Rating"></span></li>
						</c:when>
						<c:when test="${product.averageRating < 3}">	
							<li><span id="detailRatingSize"><img id = "rattingDetail" src="img/2-star.png" alt="Product Rating"></span></li>
						</c:when>
						<c:when test="${product.averageRating < 4}">	
							<li><span id="detailRatingSize"><img id = "rattingDetail" src="img/3-star.png" alt="Product Rating"></span></li>
						</c:when>
						<c:when test="${product.averageRating < 5}">	
							<li><span id="detailRatingSize"><img id = "rattingDetail" src="img/4-star.png" alt="Product Rating"></span></li>
						</c:when>
						<c:otherwise>
							<li><span id="detailRatingSize"><img id = "rattingDetail" src="img/5-star.png" alt="Product Rating"></span></li>
						</c:otherwise>
				</c:choose>	
				</div>
		  		<li style="color:rgb(128, 0, 0);"><p>$${product.price}</p></li>
				<li>Weight <span style="font-weight:lighter;">${product.weightInLbs} lbs</span></li>
				<li>Description: <span style="font-weight:lighter;"> ${product.description}</span></li>
				
				</ul>
				</div>
	</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp"></c:import>					    