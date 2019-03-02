/**
 * 
 */
package com.hogam.contasys.backingbean;

import java.util.*;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.component.html.HtmlSelectOneRadio;
import javax.faces.context.FacesContext;

import com.hogam.contasys.core.IAdminConsulta;
import com.hogam.contasys.core.IAdminCrud;
import com.hogam.contasys.modelo.MatTipoProducto;

/**
 * Clase que administrara el formulario tipoProducto.jsp
 * 
 * @author Usuario
 *
 */
@ManagedBean(name = "aaa")
@RequestScoped
public class TipoProductoBean {

	private List<MatTipoProducto> listaTipoProductos;

	private MatTipoProducto tipoProducto;
	private int idCon;

	@EJB
	private IAdminCrud adminCrud;
	@EJB
	private IAdminConsulta adminConsulta;

	public TipoProductoBean() {

		this.listaTipoProductos = new ArrayList<MatTipoProducto>();
		tipoProducto = new MatTipoProducto();

	}

	public int getIdCon() {
		return idCon;
	}

	public void setIdCon(int idCon) {
		this.idCon = idCon;
	}

	public MatTipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(MatTipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public List<MatTipoProducto> getListaTipoProductos() {
		return listaTipoProductos;
	}

	public void setListaTipoProductos(List<MatTipoProducto> listaTipoProductos) {
		this.listaTipoProductos = listaTipoProductos;
	}

	public String guardarTipoProducto() {

		String mensajeOpe = null;

		if (tipoProducto.getIdTipPro() > 0) {

			mensajeOpe = adminCrud.actualizar(tipoProducto);
		} else {
			mensajeOpe = adminCrud.guardar(tipoProducto);

		}

		// Desplegar mensaje
		FacesMessage mensaje = new FacesMessage();
		mensaje.setSeverity(FacesMessage.SEVERITY_INFO);
		mensaje.setSummary(mensajeOpe);

		FacesContext.getCurrentInstance().addMessage("Mensaje", mensaje);

		resetearFormulario();

		return null;
	}

	private void cargarTiposProductos() {

		this.listaTipoProductos.clear();
		List<Object> tiposProTmp = adminCrud.consultarTodos(MatTipoProducto.class);

		for (Object objTmp : tiposProTmp) {
			this.listaTipoProductos.add((MatTipoProducto) objTmp);
		}

	}

	public String editarTipoProducto() {

		String idTipPro = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id")
				.toString();

		tipoProducto = (MatTipoProducto) adminCrud.consultarPorId(MatTipoProducto.class, Integer.parseInt(idTipPro));

		HtmlInputHidden txtIdTipPro = (HtmlInputHidden) FacesContext.getCurrentInstance().getViewRoot()
				.findComponent("frmTipPro:txtIdTipPro");

		HtmlInputText txtNomTipPro = (HtmlInputText) FacesContext.getCurrentInstance().getViewRoot()
				.findComponent("frmTipPro:txtNomCat");
		HtmlInputTextarea txtDesTipPro = (HtmlInputTextarea) FacesContext.getCurrentInstance().getViewRoot()
				.findComponent("frmTipPro:txtDesCat");

		txtIdTipPro.setSubmittedValue(tipoProducto.getIdTipPro());
		txtNomTipPro.setSubmittedValue(tipoProducto.getNombreTipPro());
		txtDesTipPro.setSubmittedValue(tipoProducto.getDescripcionTipPro());

		return null;
	}

	public String eliminarTipoProducto() {

		String idTipPro = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id")
				.toString();

		tipoProducto = (MatTipoProducto) adminCrud.consultarPorId(MatTipoProducto.class, Integer.parseInt(idTipPro));

//		Desplegar mensaje
		FacesMessage mensaje = new FacesMessage();
		mensaje.setSeverity(FacesMessage.SEVERITY_INFO);
		mensaje.setSummary(adminCrud.eliminar(tipoProducto));

		FacesContext.getCurrentInstance().addMessage("Mensaje", mensaje);
		resetearFormulario();
		return null;
	}

	/*
	 * 
	 * Metodo para buscar los tipos de productos de acuerdo al tipo de query
	 */
	public String buscarTipoProductos() {

		this.listaTipoProductos.clear();

		HtmlSelectOneRadio txtIdTipPro = (HtmlSelectOneRadio) FacesContext.getCurrentInstance().getViewRoot()
				.findComponent("frmTipPro:selOneRadCon");

		idCon = Integer.parseInt(txtIdTipPro.getSubmittedValue().toString());

		if (idCon == 1) {
			this.listaTipoProductos = adminConsulta.consulatarTodosJPQL();
		} else if (idCon == 2) {
			this.listaTipoProductos = adminConsulta.consultarTodosSQL();
		} else {
			this.listaTipoProductos = adminConsulta.consultarCriteriaAPI();
		}

		return null;
	}

	public void resetearFormulario() {

		tipoProducto = new MatTipoProducto();

		inicializar();
	}

	/*
	 * 
	 * Metodo para inicializar el formulario
	 * 
	 */

	@PostConstruct
	public void inicializar() {

		cargarTiposProductos();

	}

}
