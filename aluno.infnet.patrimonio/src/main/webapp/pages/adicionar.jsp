<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
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

			<h1>Formulário Patrimonio</h1>
		</div>
		<div class="container">
			<div class="card">
				<div class="card-body">
					<c:if test="${patrimonio != null}">
						<form action="update" method="get">
					</c:if>
					<c:if test="${patrimonio == null}">
						<form action="insert" method="get">
					</c:if>

					<caption>
						<h2>
							<c:if test="${patrimonio != null}">
                                    Editar Patrimonio
                                </c:if>
							<c:if test="${patrimonio == null}">
                                    Adicionar Patrimonio
                                </c:if>
						</h2>
					</caption>

					<c:if test="${patrimonio != null}">
						<input type="hidden" name="id"
							value="<c:out value='${patrimonio.id}' />" />
					</c:if>

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
	</div>
</body>
</html>

<body>
