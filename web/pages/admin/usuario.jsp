<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administracion de Usuarios</title>
</head>
<body>
	<%--Tag Declaracion --%>
	<%!Date fechaActual = new Date();%>
	<form action="">

		<fieldset>
			<legend>Datos Generales</legend>
			<table>
				<tr>
					<td><label>Rol:</label></td>
					<td><select>
							<option value="1">Administrador</option>
							<option value="2">Contador</option>
							<option value="3">Operador</option>

					</select>
				</tr>

				<tr>
					<td><label>Nombre usuario:</label></td>
					<td><input name="txtNomUsu" type="text"></td>
					<td><label>Clave usuario:</label></td>
					<td><input name="txtClaUsu" type="text"></td>
				</tr>
			</table>
		</fieldset>

		<br>

		<fieldset>
			<legend>Lista de Usuarios</legend>
			<table>

				<thead>
					<tr>

						<td>Id</td>
						<td>Rol</td>
						<td>Nombre</td>
						<td>Clave</td>

					</tr>
				</thead>

				<%--Scriptlets - Bloques de codigo --%>

				<%
					for (int i = 0; i < 10; i++) {
				%>

				<tr>
					<%--Tag expresion - unir codigo java y html --%>
					<td><%=i%></td>
					<td>Administrador<%=i%></td>
					<td>carlos<%=i%></td>
					<td>mmvs<%=i%></td>

				</tr>
				<%
					}
				%>
			</table>

		</fieldset>
		<br>
		<h4>La fecha actual es:<%=fechaActual%></h4>
	</form>

</body>
</html>