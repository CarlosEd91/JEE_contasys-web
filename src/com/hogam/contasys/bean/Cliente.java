/**
 * 
 */
package com.hogam.contasys.bean;

import java.util.List;

/**
 * Esta clase representa la clase de control para el formulario
 * 
 * @author Usuario
 *
 */
public class Cliente {
	private String nombre;
	private String apellido;
	private List<String> valores;

	public Cliente() {
		this.nombre = "Carlos";
		this.apellido = "Sampedro";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<String> getValores() {
		return valores;
	}

	public void setValores(List<String> valores) {
		this.valores = valores;
	}
	
	
}
