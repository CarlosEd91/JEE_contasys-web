package com.hogam.contasys.modelo;

// Clase que representara la tabla tipo producto

public class Producto {
	private int idPro;
	private String nombrePro;
	private String descripcionPro;

	public Producto() {

	}

	public Producto(int idPro, String nombrePro, String descripcionPro) {
		super();
		this.idPro = idPro;
		this.nombrePro = nombrePro;
		this.descripcionPro = descripcionPro;
	}

	public int getIdPro() {
		return idPro;
	}

	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	public String getNombrePro() {
		return nombrePro;
	}

	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	public String getDescripcionPro() {
		return descripcionPro;
	}

	public void setDescripcionPro(String descripcionPro) {
		this.descripcionPro = descripcionPro;
	}

}
