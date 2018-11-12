<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "Product Table View"/>
</c:import>
    
    <section id="main-content">
	<h1 id = "depName">Toy Department</h1>
	
	
       <table >
       
  <tr>
  <td width="100"></td>
  	<c:forEach var="product" items="${requestScope.productList}">
    		<td width="100" height="100"><a href="http://localhost:8080/34-mvc-views-part2-exercises/productDetail?productId=${product.productId}"><img src="img/${product.imageName}" alt="Product Image"></a></td>
	</c:forEach>
  </tr>
  
  <tr>
	<td width="100"></td>
		<c:forEach var="product" items="${requestScope.productList}">
			<c:choose>
				<c:when test="${product.topSeller == true}">	
					<td style="text-align: center;"><spam id = "bestseller">BEST SELLER!</spam></td>
				</c:when>
				<c:otherwise>
					<td></td>	
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</tr>

  <tr>
  <td width="100">Name</td>
    <c:forEach var="product" items="${requestScope.productList}">
    		<td style="text-align: center;">${product.name}</td>
	</c:forEach>
	</tr>
	
  <tr>
  <td width="100">Rating</td>
    <c:forEach var="product" items="${requestScope.productList}">
    		<td>
    		<c:choose>
						<c:when test="${product.averageRating < 2}">	
							<img align="right" id = "ratting" src="img/1-star.png" alt="Product Rating">
						</c:when>
						<c:when test="${product.averageRating < 3}">	
							<img id = "ratting" src="img/2-star.png" alt="Product Rating">
						</c:when>
						<c:when test="${product.averageRating < 4}">	
							<img id = "ratting" src="img/3-star.png" alt="Product Rating">
						</c:when>
						<c:when test="${product.averageRating < 5}">	
							<img id = "ratting" src="img/4-star.png" alt="Product Rating">
						</c:when>
						<c:otherwise>
							<img id = "ratting" src="img/5-star.png" alt="Product Rating">
						</c:otherwise>
					</c:choose>	
    		
    		</td>
	</c:forEach>
  </tr>
  <tr>
  <td width="100">Mfr.</td>
  	<c:forEach var="product" items="${requestScope.productList}">
    		<td style="text-align: center;">${product.manufacturer}</td>
	</c:forEach>
  </tr>
  <tr>
  <td width="100">Price</td>
  	<c:forEach var="product" items="${requestScope.productList}">
    		<th style="color:rgb(128, 0, 0); text-align: center;">$${product.price}</th>
	</c:forEach>
  </tr>
  <tr>
  <td width="100">wt. (in Lbs)</td>
  	<c:forEach var="product" items="${requestScope.productList}">
    		<td style="text-align: center;">${product.weightInLbs}</td>
	</c:forEach>
  </tr>
</table>

    </section>
<c:import url="/WEB-INF/jsp/common/footer.jsp"></c:import>