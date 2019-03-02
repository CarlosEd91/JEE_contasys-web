<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MENU GENERAL</title>
</head>
<body>
	<f:view>

		<h:form>

			<f:facet name="header">
				<h:outputLabel value="Menu de Opciones" />
			</f:facet>

			<h:panelGrid columns="4">

				<h:commandLink action="tipoProducto" value="Tipo Producto" />
				<h:commandLink action="producto" value="Producto" />
				<h:commandLink action="tipoProducto" value="Cliente" />
				<h:commandLink action="producto" value="Proveedor" />


			</h:panelGrid>
		</h:form>

	</f:view>
</body>
</html>