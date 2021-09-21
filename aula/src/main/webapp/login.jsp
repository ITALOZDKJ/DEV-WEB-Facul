<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ServletLogin" method= "post">
	Usuário: <input type="text" name="usuario"><br>
	Senha: <input type="password" name="senha"><br>
	Telefone: <input type="text" name="telefone"><br>
	Nascimento: <input type="text" name="nascimento"><br>
	<input type="submit" value="Autenticar">
</form>
</body>
</html>