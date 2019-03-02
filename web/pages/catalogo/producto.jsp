<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administracion Producto</title>
</head>
<body>
	<f:view>
		<h:form>

			<h:panelGrid columns="3">
				<h:commandButton value="#{inter.btnNuevo}"
					action="#{bbb.guardarProducto }" />
				<h:commandButton value="#{inter.btnGuardar}" />
				<h:commandButton value="#{inter.btnBuscar}" />
			</h:panelGrid>

			<h:panelGrid border="1" columns="3">
				<f:facet name="header">
					<h:outputLabel value="Administracion Tipo Producto" />
				</f:facet>

				<h:outputLabel value="Tipo Producto" />

				<h:selectOneMenu id="cmbTipPro">

					<f:selectItem itemLabel="Viveres" itemValue="1" />
					<f:selectItem itemLabel="Electrodomesticos" itemValue="2" />
					<f:selectItems value="#{bbb.listaTipProductos}" />

				</h:selectOneMenu>
				<h:message for="cmbTipPro" />


				<h:outputText value="Nombre" />
				<h:inputText id="txtNomPro" value="#{bbb.nombreProd }"
					required="true" requiredMessage="Nombre requerido"
					validatorMessage="#{inter.longitudNombre }">

					<f:validateLength minimum="3" maximum="10" />

				</h:inputText>
				<h:message for="txtNomPro" />

				<h:outputText value="Descripcion"></h:outputText>
				<h:inputTextarea id="txtDesPro" required="true"
					requiredMessage="Descripcion requerida"
					value="#{bbb.descripcionProd }" />
				<h:message for="txtDesPro" />


				<h:outputText value="Fecha Caducidad"></h:outputText>
				<h:inputText id="txtFecCadPro" value="#{bbb.fechaCadPro }"
					converterMessage="#{inter.fechaIncorrecta }">
					<f:convertDateTime pattern="yyyy-MM-dd" />

				</h:inputText>

			</h:panelGrid>
			<h:messages style="color:red;" />
			<br />
			<h:dataTable id="datTabTipPro" value="#{bbb.listaProductos }"
				var="pro">
				<f:facet name="header">
					<h:outputLabel value="Lista de Productos" />
				</f:facet>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Id" />
					</f:facet>
					<h:outputLabel value="#{pro.idPro }"></h:outputLabel>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Nombre" />
					</f:facet>
					<h:outputLabel value="#{pro.nombrePro}"></h:outputLabel>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Descripcion" />
					</f:facet>
					<h:outputLabel value="#{pro.descripcionPro }"></h:outputLabel>
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>