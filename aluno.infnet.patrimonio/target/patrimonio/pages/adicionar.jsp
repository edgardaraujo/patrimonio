<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adicionar patrimonio</title>
</head>
<body>
	<!-- inluir elemento na página -->
	<jsp:include page="template/header.jsp"></jsp:include>

	<div class="container">
		<div class="row justify-content-center">

			<h1>Adicionar patrimonio</h1>
		</div>
		<div class="row justify-content-center">
			<form>
				<div class="form-row">
					<div class="col-6">
						<label for="descricaoPatrimonio">Descrição</label> <input
						type="text" class="form-control" id="descricaoPatrimonio"
						placeholder="Digite a descrição">
					</div>
					<div class="col-6">
						<label for="localizacaoPatrimonio">Localização</label> <input
						type="text" class="form-control" id="localizacaoPatrimonio"
						placeholder="Digite a localização">
					</div>
				</div>
				<div class="row mt-4 justify-content-center">
					<button type="submit" class="btn btn-success" action="insert" method="post">Adicionar</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>