<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista patrimonio</title>
</head>
<body>
	<!-- inluir elemento na p�gina -->
	<jsp:include page="template/header.jsp"></jsp:include>

	<div class="container">
		<div class="row justify-content-center">
			
			<h1>Lista patrimonio</h1>
			
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Descri��o</th>
						<th scope="col">Localiza��o</th>
						<th scope="col">Editar</th>
						<th scope="col">Excluir</th>						
					</tr>
				</thead>
				<tbody>

					<c:forEach var="pat" items="${lista}">
						<tr>
							<th scope="row">${ pat.id }</th>
							<td>${ pat.descricao }</td>
							<td>${ pat.localizacao }</td>
							<td><a class="btn btn-primary" href="edit?id=<c:out value='${pat.id}'/>">Editar</a></td>
							<td><a class="btn btn-danger" href="delete?id=<c:out value='${pat.id}'/>">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>

</body>
</html>