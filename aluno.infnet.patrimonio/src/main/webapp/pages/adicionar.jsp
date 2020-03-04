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
	<!-- inluir elemento na p�gina -->
	<jsp:include page="template/header.jsp"></jsp:include>

	<div class="container">
		<div class="row justify-content-center">

			<h1>Adicionar patrimonio</h1>
		</div>
		<div class="row justify-content-center">
			<form>
				<div class="form-row">
					<div class="col-6">
						<label for="descricaoPatrimonio">Descri��o</label> <input
						type="text" class="form-control" id="descricaoPatrimonio"
						placeholder="Digite a descri��o">
					</div>
					<div class="col-6">
						<label for="localizacaoPatrimonio">Localiza��o</label> <input
						type="text" class="form-control" id="localizacaoPatrimonio"
						placeholder="Digite a localiza��o">
					</div>
				</div>
				<div class="row mt-4 justify-content-center">
					<button type="submit" class="btn btn-success">Adicionar</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>