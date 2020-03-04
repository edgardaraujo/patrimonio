<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- inluir elemento na página -->
	<jsp:include page="template/header.jsp"></jsp:include>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-10 ">
				<div class="row">
					<c:forEach var="pat" items="${ lista_patrimonio }">
						<div class="col-4">
							<p class="card-text">${ pat.descricao }</p>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</body>
</html>