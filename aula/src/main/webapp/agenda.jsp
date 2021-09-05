<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saudação</title>
</head>
<body>
	<h2>Preeencha o formulário a seguir:</h2>
	<form action="ServletAgenda" method="get">
		<p>Nome</p>
		<input type="text" name="nome"/>
		<p>Telefone</p>
		<input type="text" name="telefone"/>
		<p>Nascimento</p>
		<input type="text" name="nascimento"/>
		<input type="submit" value="enviar"/>
	</form>
</body>
</html>