<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administracion de Clientes</title>
</head>
<body>
	<jsp:useBean id="cliBea" class="com.hogam.contasys.bean.Cliente"></jsp:useBean>
	<h3>
		Bienvenido:
		<jsp:getProperty property="nombre" name="cliBea" />
		<jsp:getProperty property="apellido" name="cliBea" />
	</h3>

	<jsp:setProperty property="nombre" name="cliBea" value="Eduardo" />
	<h3>
		Bienvenido:
		<jsp:getProperty property="nombre" name="cliBea" />
		<jsp:getProperty property="apellido" name="cliBea" />
	</h3>
</body>
</html>