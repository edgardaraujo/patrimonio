<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Patrimonio</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Alterna navegação">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="${pageContext.request.contextPath}/pages/home.jsp">Home
						<span class="sr-only">(Página atual)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value='/PatrimonioSrv' />">Lista patrimonio</a>
				</li>
<%-- 				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/pages/adicionar.jsp">Adicionar patrimonio</a></li> --%>
				<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/new">Adicionar patrimonio</a></li>
			</ul>
		</div>
	</nav>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>