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
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<form action="update" method="get">

					<input type="hidden" name="id"
						value="<c:out value='${patrimonio.id}' />" />

					<fieldset class="form-group">
						<label>Descrição</label> <input type="text"
							value="<c:out value='${patrimonio.descricao}' />"
							class="form-control" name="descricao" required="required">
					</fieldset>

					<fieldset class="form-group">
						<label>Localização</label> <input type="text"
							value="<c:out value='${patrimonio.localizacao}' />"
							class="form-control" name="localizacao" required="required">
					</fieldset>

					<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>


