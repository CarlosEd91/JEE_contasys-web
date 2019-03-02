<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administracion Tipo Producto</title>
<link rel="stylesheet" type="text/css"
	href="../../resources/css/contasys.css">
<script type="text/javascript">
	function confirmarEProducto() {
		return confirm("Estas seguro de eliminar el tipo de producto");
	}
</script>
</head>
<body>
	<f:view>
		<h:form id="frmTipPro">
			<h:inputHidden id="txtIdTipPro" value="#{aaa.tipoProducto.idTipPro}" />
			<h:panelGrid columns="3">
				<h:commandButton value="#{inter.btnNuevo}" type="reset" />
				<h:commandButton value="#{inter.btnGuardar}" type="submit"
					action="#{aaa.guardarTipoProducto}" />
			</h:panelGrid>

			<h:panelGrid border="1" columns="2" headerClass="order-table-header"
				styleClass="order-table"
				rowClasses="order-table-odd-row, order-table-even-row">
				<f:facet name="header">
					<h:outputLabel value="Administracion Tipo Producto" />
				</f:facet>
				<h:outputText value="Nombre"></h:outputText>
				<h:inputText id="txtNomCat" value="#{aaa.tipoProducto.nombreTipPro}">

				</h:inputText>
				<h:outputText value="Descripcion"></h:outputText>
				<h:inputTextarea id="txtDesCat" converter="conMayPer"
					value="#{aaa.tipoProducto.descripcionTipPro }" />
			</h:panelGrid>
			<h:messages />
			<br />

			<h:panelGrid columns="2">

				<h:selectOneRadio id="selOneRadCon" value="#{aaa.idCon }">
					<f:selectItem itemLabel="JPQL" itemValue="1" />
					<f:selectItem itemLabel="NATIVA" itemValue="2" />
					<f:selectItem itemLabel="Criteria API" itemValue="3" />

				</h:selectOneRadio>
				<h:commandButton value="#{inter.btnBuscar}"
					action="#{aaa.buscarTipoProductos }" immediate="true" />

			</h:panelGrid>

			<h:dataTable id="datTabTipPro" value="#{aaa.listaTipoProductos }"
				var="tipPro" headerClass="order-table-header"
				styleClass="order-table"
				rowClasses="order-table-odd-row, order-table-even-row">
				<f:facet name="header">
					<h:outputLabel value="Lista de Productos" />
				</f:facet>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Id" />
					</f:facet>
					<h:outputLabel value="#{tipPro.idTipPro }"></h:outputLabel>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Nombre" />
					</f:facet>
					<h:outputLabel value="#{tipPro.nombreTipPro }"></h:outputLabel>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Descripcion" />
					</f:facet>
					<h:outputLabel value="#{tipPro.descripcionTipPro }"></h:outputLabel>
				</h:column>


				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Operaciones" />
					</f:facet>
					<h:panelGroup>

						<h:commandLink value="Editar" action="#{aaa.editarTipoProducto}"
							immediate="true">
							<f:param name="id" value="#{tipPro.idTipPro }" />
						</h:commandLink>

						<h:commandLink value="Eliminar"
							action="#{aaa.eliminarTipoProducto }"
							onclick="return confirmarEProducto();" immediate="true">
							<f:param name="id" value="#{tipPro.idTipPro }" />
						</h:commandLink>
					</h:panelGroup>
				</h:column>

			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>