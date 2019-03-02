package com.hogam.contasys.backingbean;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import com.hogam.contasys.modelo.Producto;

/**
 * Clase que administrara el formulario tipoProducto.jsp
 * 
 * @author Usuario
 *
 */
@ManagedBean(name = "bbb")
@RequestScoped
public class ProductoBean {

	private int idPro;;
	private String nombreProd;
	private String descripcionProd;
	private Date fechaCadPro;
	private List<Producto> listaProductos;
	private List<SelectItem> listaTipProductos;

	public ProductoBean() {
		this.listaProductos = new ArrayList<Producto>();
		this.listaTipProductos = new ArrayList<SelectItem>();
		inicializar();
	}

	public int getIdPro() {
		return idPro;
	}

	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public String getDescripcionProd() {
		return descripcionProd;
	}

	public void setDescripcionProd(String descripcionProd) {
		this.descripcionProd = descripcionProd;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public List<SelectItem> getListaTipProductos() {
		return listaTipProductos;
	}

	public void setListaTipProductos(List<SelectItem> listaTipProductos) {
		this.listaTipProductos = listaTipProductos;
	}
	
	

	public Date getFechaCadPro() {
		return fechaCadPro;
	}

	public void setFechaCadPro(Date fechaCadPro) {
		this.fechaCadPro = fechaCadPro;
	}

	public String guardarProducto() {

		return null;
	}

//	 metodo encargado de inicializar los valores del formulario
	public void inicializar() {

		this.listaProductos.add(new Producto(1, "AAA", "bbbb"));
		this.listaProductos.add(new Producto(2, "BBB", "bbbb"));
		this.listaProductos.add(new Producto(3, "CCC", "bbbb"));
		this.listaProductos.add(new Producto(4, "AAA", "bbbb"));
		this.listaProductos.add(new Producto(5, "BBB", "bbbb"));
		this.listaProductos.add(new Producto(6, "CCC", "bbbb"));

		this.listaTipProductos.add(new SelectItem(1, "A"));
		this.listaTipProductos.add(new SelectItem(2, "B"));

	}

}
