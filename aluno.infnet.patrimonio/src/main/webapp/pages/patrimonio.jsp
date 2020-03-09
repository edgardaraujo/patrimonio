<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Inventário Patrimonial</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css">

</head>

<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: gray">

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Listar Patrimonio</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
	
		<div class="container">
			<h3 class="text-center">Inventário Patrimonial</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Adicionar
					Patrimonio</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Descrição</th>
						<th>Localização</th>
						<th>Ação</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="pat" items="${listaPatrimonio}">

						<tr>
							<td><c:out value="${pat.id}" /></td>
							<td><c:out value="${pat.descricao}" /></td>
							<td><c:out value="${pat.localizacao}" /></td>

							<td><a href="edit?id=<c:out value='${pat.id}' />">Editar</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${pat.id}' />">Deletar</a></td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>