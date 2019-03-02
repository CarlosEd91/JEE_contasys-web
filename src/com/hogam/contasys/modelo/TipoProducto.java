package com.hogam.contasys.modelo;

// Clase que representara la tabla tipo producto

public class TipoProducto {
	private int idTipPro;
	private String nombreTipPro;
	private String descripcionTipPro;

	public TipoProducto() {
	}

	

	public TipoProducto(int idTipPro, String nombreTipPro,
			String descripcionTipPro) {
		this.idTipPro = idTipPro;
		this.nombreTipPro = nombreTipPro;
		this.descripcionTipPro = descripcionTipPro;
	}



	public int getIdTipPro() {
		return idTipPro;
	}

	public void setIdTipPro(int idTipPro) {
		this.idTipPro = idTipPro;
	}

	public String getNombreTipPro() {
		return nombreTipPro;
	}

	public void setNombreTipPro(String nombreTipPro) {
		this.nombreTipPro = nombreTipPro;
	}

	public String getDescripcionTipPro() {
		return descripcionTipPro;
	}

	public void setDescripcionTipPro(String descripcionTipPro) {
		this.descripcionTipPro = descripcionTipPro;
	}

}
