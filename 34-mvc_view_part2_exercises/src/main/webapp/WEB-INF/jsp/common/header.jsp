<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
<c:import url="/WEB-INF/jsp/common/header.jsp">
<c:param name="pageTitle" value="Product List View" />
</c:import>
--%>
<!DOCTYPE html>

<html>
<head>
    <title><c:out value= "${param.pageTitle}"/></title>
    <c:url var="sitesCssUrl" value="/css/site.css"/>
    <link rel="stylesheet" type="text/css" href="${sitesCssUrl }" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="http://localhost:8080/34-mvc-views-part2-exercises/productList">List Layout</a></li>
            <li><a href="http://localhost:8080/34-mvc-views-part2-exercises/productTiles">Tile Layout</a></li>
            <li><a href="http://localhost:8080/34-mvc-views-part2-exercises/productTable">Table Layout</a></li>
        </ul>
        
    </nav>