<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Inventário Patrimonial</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css">

</head>

<body>
	<br>

	<div class="row">

		<div class="container">
			<h3 class="text-center">Inventário Patrimonial</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/adicionar"
					class="btn btn-success">Adicionar Patrimonio</a>
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

							<td><a href="<c:url value="/edit?id=${pat.id}"/>"><i
									class="far fa-edit"></i> Editar</a> <a
								href="<c:url value="/delete/${pat.id}"/>"><i
									class="far fa-trash-alt"></i> Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>